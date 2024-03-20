package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;

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
    private Button buttonRetour;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        editTextLogin = findViewById(R.id.editLogin);
        editTextMdp = findViewById(R.id.editMdp);
        buttonConnexion = findViewById(R.id.buttonconnexion);
        buttonRetour = findViewById(R.id.buttonRetour);
        imageView = findViewById(R.id.imageView);

        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(Connexion.this, PageProfil.class);
                startActivity(intent);*/
            }
        });

    }
}