package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_preview);

        // Set a click listener that shows the Now Playing Category
        TextView playMusic = (TextView) findViewById(R.id.play_music_button);

        // Set a click listener on that view
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playMusicIntent = new Intent(MusicPreviewActivity.this, NowPlayingActivity.class);
                startActivity(playMusicIntent);
            }
        });

        // Set a click listener that shows the Artist Info
        TextView artistInfo = (TextView) findViewById(R.id.artist_button);

        // Set a click listener on that view
        artistInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistInfoIntent = new Intent(MusicPreviewActivity.this, ArtistInfoActivity.class);
                startActivity(artistInfoIntent);
            }
        });

        // Set a click listener that shows the Album Info
        TextView albumInfo = (TextView) findViewById(R.id.album_button);

        // Set a click listener on that view
        albumInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumInfoIntent = new Intent(MusicPreviewActivity.this, AlbumInfoActivity.class);
                startActivity(albumInfoIntent);
            }
        });

        // Find the View that shows the Payment Activity
        TextView purchaseButton = (TextView) findViewById(R.id.purchase_button);

        // Set a click listener on that view
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent purchaseIntent = new Intent(MusicPreviewActivity.this, PaymentActivity.class);
                startActivity(purchaseIntent);
            }
        });

        // Find the View that shows the Home Activity
        TextView homeButton = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MusicPreviewActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        TextView libraryButton = (TextView) findViewById(R.id.library_button);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MusicPreviewActivity.this, MusicLibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
    }
}
