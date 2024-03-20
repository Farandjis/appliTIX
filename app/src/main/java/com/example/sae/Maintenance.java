package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maintenance extends AppCompatActivity {

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(Maintenance.this, Connexion.class);
            startActivity(intent);
        });
    }
}