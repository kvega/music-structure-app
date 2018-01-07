package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        // Find the View that show the Now Playing Category
        TextView playMusic = (TextView) findViewById(R.id.play_music_button);

        // Set a click listener on that view
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playMusicIntent = new Intent(MusicLibraryActivity.this, NowPlayingActivity.class);
                startActivity(playMusicIntent);
            }
        });

        // Find the View that shows the Music Preview Category
        TextView musicPreview = (TextView) findViewById(R.id.preview_music_button);

        // Set a click listener on that view
        musicPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicPreviewIntent = new Intent(MusicLibraryActivity.this, MusicPreviewActivity.class);
                startActivity(musicPreviewIntent);
            }
        });

        // Find the View that shows the Home Activity
        TextView homeButton = (TextView) findViewById(R.id.home_button);

        // Set a click listener on that view
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MusicLibraryActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
