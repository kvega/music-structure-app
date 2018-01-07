package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        // Set a click listener that shows the Music Preview Activity
        TextView previewMusic = (TextView) findViewById(R.id.preview_music_button);

        // Set a click listener on that view
        previewMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previewMusicIntent = new Intent(StoreActivity.this, MusicPreviewActivity.class);
                startActivity(previewMusicIntent);
            }
        });

        // Find the View that shows the Home Activity
        TextView homeButton = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
