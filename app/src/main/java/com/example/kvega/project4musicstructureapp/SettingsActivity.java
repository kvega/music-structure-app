package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Find the View that shows the Home Activity
        TextView homeButton = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Music Library Activity
        TextView libraryButton = (TextView) findViewById(R.id.library_button);

        // Set a click listener on that view
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(SettingsActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
