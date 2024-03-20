package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;


public class creerticket extends AppCompatActivity{

    ArrayList<String> titreListe = new ArrayList<String>(Arrays.asList("Titre 1", "Titre 2"));
    ArrayList<String> motsClesListe = new ArrayList<String>(Arrays.asList("! : Aucun mot-clé", "LOGICIEL : Firefox", "SALLE : G21"));
    ArrayList<String> urgenceListe = new ArrayList<String>(Arrays.asList("Faible", "Moyen", "Important"));
    ArrayAdapter<String> adapttitre;     ArrayAdapter<String> adaptmc; ArrayAdapter<String> adaptur;
    Spinner sptitre;     Spinner spmc; Spinner spur;
    LinearLayout llct2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creerticket);
        //Le Spinner
        sptitre= (Spinner)findViewById(R.id.ct_selecttitre);
        spmc = (Spinner)findViewById(R.id.ct_selectdesmotscles);
        spur = (Spinner)findViewById(R.id.ct_selectur);
        llct2 = (findViewById(R.id.llct2));

        // Récupérer la Toolbar depuis le layout
        Toolbar toolbar = findViewById(R.id.toolbar);

        //Activer la Toolbar comme ActionBar de l'activité
        setSupportActionBar(toolbar);

        // source : https://www.developpez.net/forums/d1473835/java/developpement-mobile-java/android/composants-graphiques/ajouter-element-spinner/

        //Initialiser l'adapteur avec la liste de données déclarée plus haut
        adapttitre = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, titreListe);
        //passer l'adapteur dans le Spinner
        sptitre.setAdapter(adapttitre);

        adaptmc = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, motsClesListe);
        //passer l'adapteur dans le Spinner
        spmc.setAdapter(adaptmc);

        adaptur = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, urgenceListe);
        //passer l'adapteur dans le Spinner
        spur.setAdapter(adaptur);

        Button bt = findViewById(R.id.buttonCreerTicket2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(creerticket.this, tableaubord.class);
                startActivity(intent);
            }
        });

    }

    //Quand l'activity demarre
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_connexion) {

        } else if (id == R.id.menu_inscription) {

        }  else if (id == R.id.menu_accueil) {

        } else if (id == R.id.menu_profil) {

        }else if (id == R.id.menu_administration) {

        }else if (id == R.id.menu_tableauDeBord) {
            Intent intent = new Intent(this, com.example.sae.tableaubord.class);
            startActivity(intent);
        }else if (id == R.id.menu_quitter) {
            finish();
        }else {
            return super.onContextItemSelected(item);
        }

        return true;
    }


}
