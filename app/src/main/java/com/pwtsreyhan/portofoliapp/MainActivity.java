package com.pwtsreyhan.portofoliapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    ImageButton btnProfile, btnHardskill, btnProject, btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnProfile = findViewById(R.id.profile);
        btnHardskill = findViewById(R.id.hardskill);
        btnProject = findViewById(R.id.project);
        btnContact = findViewById(R.id.contact);

        btnProfile.setOnClickListener(view -> {
            ProfileSheet ProfileSheet = new ProfileSheet();
            ProfileSheet.show(getSupportFragmentManager(), ProfileSheet.getTag());
        });

    }
}