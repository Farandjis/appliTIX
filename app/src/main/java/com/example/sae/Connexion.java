package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Connexion extends AppCompatActivity {
    private EditText editTextLogin;
    private EditText editTextMdp;
    private Button buttonConnexion;
    private Button buttonMdpOublie;
    private Button buttonPasDeCompte;
    private Button buttonRetour;
    private ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        editTextLogin = findViewById(R.id.editLogin);
        editTextMdp = findViewById(R.id.editMdp);
        buttonConnexion = findViewById(R.id.buttonconnexion);
        buttonRetour = findViewById(R.id.buttonRetour);
        buttonMdpOublie = findViewById(R.id.buttonmdpoublie);
        buttonPasDeCompte = findViewById(R.id.buttonpasdecompte);
        imageView = findViewById(R.id.imageView);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(Connexion.this, PageProfil.class);
                startActivity(intent);*/
            }
        });

        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Connexion.this, Menu.class);
                startActivity(intent);
            }
        });

        buttonMdpOublie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Connexion.this, Maintenance.class);
                startActivity(intent);
            }
        });

        buttonPasDeCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Connexion.this, Inscription.class);
                startActivity(intent);
            }
        });
    }
}