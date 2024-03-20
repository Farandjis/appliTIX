package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class tableaubord extends AppCompatActivity {
    ArrayList<String> typeDeSelectTickets = new ArrayList<String>(Arrays.asList("Tous les tickets de TIX (par défaut)", "Mes demandes actuel", "Tickets en attente", "Tickets ouvert", "Ticket en cours à gérer"));
    ArrayList<String> motsClesListe = new ArrayList<String>(Arrays.asList("! : Aucun mot-clé", "LOGICIEL : Firefox", "SALLE : G21"));
    ArrayAdapter<String> adapttypetick;     ArrayAdapter<String> adaptmc;
    Spinner sptypetick;     Spinner spmc;
    LinearLayout lltdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableaubord);
        //Le Spinner
        sptypetick = (Spinner)findViewById(R.id.tdb_selectdestickets);
        spmc = (Spinner)findViewById(R.id.tdb_selectdesmotscles);
        lltdb = (findViewById(R.id.lltdb));

        // Récupérer la Toolbar depuis le layout
        Toolbar toolbar = findViewById(R.id.toolbar);

        //Activer la Toolbar comme ActionBar de l'activité
        setSupportActionBar(toolbar);

        // source : https://www.developpez.net/forums/d1473835/java/developpement-mobile-java/android/composants-graphiques/ajouter-element-spinner/

        //Initialiser l'adapteur avec la liste de données déclarée plus haut
        adapttypetick = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, typeDeSelectTickets);
        //passer l'adapteur dans le Spinner
        sptypetick.setAdapter(adapttypetick);

        adaptmc = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, motsClesListe);
        //passer l'adapteur dans le Spinner
        spmc.setAdapter(adaptmc);
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
            Intent intent = new Intent(this, tableaubord.class);
            startActivity(intent);
        }else if (id == R.id.menu_quitter) {
            finish();
        }else {
            return super.onContextItemSelected(item);
        }

        return true;
    }

}