package com.example.sae;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonInscription = findViewById(R.id.button2);

        buttonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(Inscription.this, PageProfil.class);
                startActivity(intent);*/
            }
        });

        TableLayout tableLayout = findViewById(R.id.tableLayoutAccueil);

        // Exemple de données pour le tableau
        String[][] data = {
                {"ID","Date","Titre","Niv.Urgence","Description","État"},
                {"contenu", "contenu", "contenu","contenu", "contenu", "contenu"},
                {"contenu", "contenu", "contenu","contenu", "contenu", "contenu"},
                {"contenu", "contenu", "contenu","contenu", "contenu", "contenu"}
        };

        // Ajouter des lignes au tableau
        for (int i = 0; i < data.length; i++) {
            TableRow row = new TableRow(this);
            row.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < data[i].length; j++) {
                TextView textView = new TextView(this);
                textView.setText(data[i][j]);
                textView.setPadding(20, 20, 20, 20);
                // Style du texte
                textView.setTextColor(getResources().getColor(R.color.colorText));
                textView.setTextSize(11);
                // Bordures
                textView.setBackgroundResource(R.drawable.cell_border);
                textView.setGravity(Gravity.CENTER);
                // Ajouter les TextViews à la ligne
                row.addView(textView);
            }

            // Style de la ligne
            row.setBackgroundColor(getResources().getColor(R.color.colorRowBackground));
            // Ajouter la ligne au tableau
            tableLayout.addView(row);
        }
    }
}