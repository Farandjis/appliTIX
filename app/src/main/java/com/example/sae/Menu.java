package com.example.sae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class Menu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer la Toolbar depuis le layout
        Toolbar toolbar = findViewById(R.id.toolbar);

        //Activer la Toolbar comme ActionBar de l'activité
        setSupportActionBar(toolbar);
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
            Intent intent = new Intent(this, Connexion.class);
            startActivity(intent);

        } else if (id == R.id.menu_inscription) {

        }  else if (id == R.id.menu_accueil) {

        } else if (id == R.id.menu_profil) {
        }else if (id == R.id.menu_administration) {
            Intent intent = new Intent(this, Maintenance.class);
            startActivity(intent);
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