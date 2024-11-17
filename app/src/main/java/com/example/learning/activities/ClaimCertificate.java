package com.example.learning.activities;

import static com.example.learning.activities.MyCertificateActivity.REQUEST_CODE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learning.Models.Add_certificate;
import com.example.learning.Models.Add_user_data;
import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.others.CustomLoadingDialog;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import io.github.muddz.styleabletoast.StyleableToast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClaimCertificate extends AppCompatActivity {

    TextView activity_name,certificate_course,certificate_name;
    ImageView back_icon;
    AppCompatButton certificate_download,certificate_share;
    CustomLoadingDialog customLoadingDialog;
    String course_id,course_name,userEmail,userName;
    TextView changed_name, change_course;
    final static int REQUEST_CODE = 1232;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_certificate);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        Intent intent = getIntent();
        course_id = intent.getStringExtra("course_id");
        course_name = intent.getStringExtra("course_name");
         userEmail = account.getEmail();
         userName = account.getDisplayName();
        askPermissions();

        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Add_certificate> call = apiInterface.add_certificate("add_certificate", userEmail,
                course_id);
        call.enqueue(new Callback<Add_certificate>() {
            @Override
            public void onResponse(Call<Add_certificate> call, @NonNull Response<Add_certificate> response) {

            }
            @Override
            public void onFailure(Call<Add_certificate> call, Throwable t) {
            }
        });
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        activity_name = findViewById(R.id.activity_name);
        back_icon = findViewById(R.id.back_icon);
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        certificate_course = findViewById(R.id.certificate_course);
        certificate_name = findViewById(R.id.certificate_name);
        certificate_download = findViewById(R.id.certificate_download);
        certificate_share = findViewById(R.id.certificate_share);
        String course = intent.getStringExtra("cat_name");
        certificate_course.setText(course);
        certificate_name.setText(userName);


        certificate_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPDF();
            }
        });

        certificate_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createPDF();
                sharePDF();
            }
        });

    }
    private void createPDF() {
        // Inflate the XML layout file
        View view = LayoutInflater.from(this).inflate(R.layout.certificate_design, null);
        changed_name = view.findViewById(R.id.certificate_name);
        change_course = view.findViewById(R.id.certificate_course);

        changed_name.setText(userName);
        change_course.setText(course_name);

        // Measure the view
        view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));

        // Adjust the size of the view to match the measured width and height
        int width = view.getMeasuredWidth();
        int height = view.getMeasuredHeight();
        view.layout(0, 0, width, height);

        PdfDocument document = new PdfDocument();

        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(width, height, 1).create();

        // Start a new page
        PdfDocument.Page page = document.startPage(pageInfo);

        // Get the Canvas object to draw on the page
        Canvas canvas = page.getCanvas();

        // Create a Paint object for styling the view
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        // Draw the view on the canvas
        view.draw(canvas);

        // Finish the page
        document.finishPage(page);

        // Specify the path and filename of the output PDF file
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String fileName = userName + "-" + course_name + ".pdf";
        File filePath = new File(downloadsDir, fileName);

        try {
            // Save the document to a file
            FileOutputStream fos = new FileOutputStream(filePath);
            document.writeTo(fos);
            document.close();
            fos.close();
            StyleableToast.makeText(getApplicationContext(), "PDF Generated !!", Toast.LENGTH_LONG,
                    R.style.pdf_generated).show();
            openPDF(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openPDF(File file) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);
        intent.setDataAndType(uri, "application/pdf");
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void sharePDF() {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String fileName = userName + "-" + course_name + ".pdf";
        File file = new File(downloadsDir, fileName);
        Uri uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);

        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        shareIntent.setType("application/pdf");
        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        startActivity(Intent.createChooser(shareIntent, "Share PDF using"));
    }
    private void askPermissions() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
    }
    @Override
    public void onBackPressed() {
        setResult(RESULT_OK);
        super.onBackPressed();
        }
    }