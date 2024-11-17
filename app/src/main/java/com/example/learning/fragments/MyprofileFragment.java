package com.example.learning.fragments;

import static android.app.Notification.EXTRA_TEXT;
import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_SUBJECT;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
//https://stackoverflow.com/questions/12560246/how-to-add-a-push-notification-in-my-own-android-app/41241604
import com.bumptech.glide.Glide;
import com.example.learning.R;
import com.example.learning.activities.LoginActivity;
import com.example.learning.activities.MyCertificateActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import io.github.muddz.styleabletoast.StyleableToast;

public class MyprofileFragment extends Fragment {
    ImageView profile_picture;
    TextView profile_name, profile_email;
    RelativeLayout profile_feedback, profile_shareapp, profile_logout, my_certificates;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myprofile , container , false);
        GoogleSignInOptions gso;
        GoogleSignInClient gsc;
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(getActivity() , gso);

        profile_picture = view.findViewById(R.id.profile_picture);
        profile_name = view.findViewById(R.id.profile_name);
        profile_email = view.findViewById(R.id.profile_email);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getActivity());
        if (account != null) {
            String personName = account.getDisplayName();
            String personEmail = account.getEmail();
            Uri personPhoto = account.getPhotoUrl();

            profile_name.setText(personName);
            profile_email.setText(personEmail);

            if (personPhoto != null) {
                Glide.with(this).load(personPhoto).into(profile_picture);
            }
        }
        profile_feedback = view.findViewById(R.id.profile_feedback);
        profile_shareapp = view.findViewById(R.id.profile_shareapp);
        profile_logout = view.findViewById(R.id.profile_logout);
        my_certificates = view.findViewById(R.id.my_certificates);
        profile_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.profile_feedback_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Button later_btn, submit_btn;
                later_btn = dialog.findViewById(R.id.later_btn);
                submit_btn = dialog.findViewById(R.id.submit_btn);
                submit_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StyleableToast.makeText(getContext(), "Launching Premium in Short Time " +
                                        "than can Give Feedback", Toast.LENGTH_LONG, R.style.feedback
                                ).show();

                    }
                });
                later_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

        profile_shareapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(EXTRA_SUBJECT , "Share App");
                intent.putExtra(Intent.EXTRA_TEXT , "Download This Fantastic App and Share With Your Friends. \n\n https://play.google.com/store/apps/details?id=" + getActivity().getPackageName());
                startActivity(Intent.createChooser(intent , "Choose One"));
            }
        });

        my_certificates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getContext(), MyCertificateActivity.class);
                startActivity(intent1);
            }
        });
        profile_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.profile_logout_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Button yes_btn, no_btn;
                yes_btn = dialog.findViewById(R.id.yes_btn);
                no_btn = dialog.findViewById(R.id.no_btn);
                yes_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gsc.signOut().addOnCompleteListener(getActivity() , new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                StyleableToast.makeText(getContext(), "Logout Success",
                                        Toast.LENGTH_LONG,
                                        R.style.logout_successfully).show();
                                Intent intent = new Intent(requireContext() , LoginActivity.class);
                                startActivity(intent);
                                requireActivity().finish();
                            }
                        });
                    }
                });
                no_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        return view;
    }
}
