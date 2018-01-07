package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the Library Activity
        TextView libraryButton = (TextView) findViewById(R.id.library_button);

        // Set a click listener on that view
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlayingActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the Home Activity
        TextView homeButton = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Find the view that shows the Artist Info activity
        TextView artistButton = (TextView) findViewById(R.id.artist_button);

        // Set a click listener on that view
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(NowPlayingActivity.this, ArtistInfoActivity.class);
                startActivity(artistIntent);
            }
        });

        // Find the view that shows the Album Info activity
        TextView albumButton = (TextView) findViewById(R.id.album_button);

        // Set a click listener on that view
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(NowPlayingActivity.this, AlbumInfoActivity.class);
                startActivity(albumIntent);
            }
        });
    }
}
