package com.example.sae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inscription extends AppCompatActivity {

    private Button buttonRetour;

    private Button buttonCompte;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        buttonRetour = findViewById(R.id.button2);
        buttonCompte = findViewById(R.id.buttoncompte);

        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inscription.this, Menu.class);
                startActivity(intent);
            }
        });

        buttonCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inscription.this, Connexion.class);
                startActivity(intent);
            }
        });
    }
}