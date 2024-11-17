package com.example.learning.adapters;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning.Models.Get_certificate;
import com.example.learning.R;
import com.example.learning.activities.MyCertificateActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import es.dmoral.toasty.Toasty;
import io.github.muddz.styleabletoast.StyleableToast;

public class MyCertificateRVAdapter extends RecyclerView.Adapter<MyCertificateRVAdapter.MYViewHolder> {

    Context context;
    ArrayList<Get_certificate.GetCertificate> getCertificates;
    TextView changed_name, change_course;


    public MyCertificateRVAdapter(Context context ,
                                  ArrayList<Get_certificate.GetCertificate> getCertificates1) {
        this.context = context;
        this.getCertificates = getCertificates1;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mycertificate_design , parent , false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCertificateRVAdapter.MYViewHolder holder , int position) {
        holder.bind(getCertificates.get(position));
    }

    @Override
    public int getItemCount() {
        return getCertificates.size();
    }

    public class MYViewHolder extends RecyclerView.ViewHolder {
        TextView user_name, course_name;
        Button download_btn,share_btn;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            download_btn = itemView.findViewById(R.id.download_btn);
            share_btn = itemView.findViewById(R.id.share_btn);
            user_name = itemView.findViewById(R.id.user_name);
            course_name = itemView.findViewById(R.id.course_name);
        }

        public void bind(Get_certificate.GetCertificate certificate) {
            GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(context);
            String userName = (account != null) ? account.getDisplayName() : "User Name";
            user_name.setText(userName);
            course_name.setText(certificate.getName().toString());

            String course = course_name.getText().toString();
            String user = user_name.getText().toString();

            download_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    createPDF(course, user);
                }
            });

            share_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    createPDF(course, user);
                    sharePDF(course, user);
                }
            });
        }
    }
    private void createPDF(String course, String user) {
        // Inflate the XML layout file

            View view = LayoutInflater.from(context).inflate(R.layout.certificate_design, null);
        changed_name = view.findViewById(R.id.certificate_name);
        change_course = view.findViewById(R.id.certificate_course);

        changed_name.setText(user);
        change_course.setText(course);

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
        String fileName =  user + "-" + course + ".pdf";
        File filePath = new File(downloadsDir, fileName);

        try {
            // Save the document to a file
            FileOutputStream fos = new FileOutputStream(filePath);
            document.writeTo(fos);
            document.close();
            fos.close();
            StyleableToast.makeText(context, "PDF Generated !!", Toast.LENGTH_LONG, R.style.pdf_generated).show();
            openPDF(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openPDF(File file) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
        intent.setDataAndType(uri, "application/pdf");
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try {
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void sharePDF(String course, String user) {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String fileName =  user + "-" + course + ".pdf";
        File file = new File(downloadsDir, fileName);
        Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);

        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        shareIntent.setType("application/pdf");
        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        context.startActivity(Intent.createChooser(shareIntent, "Share PDF using"));
    }

}