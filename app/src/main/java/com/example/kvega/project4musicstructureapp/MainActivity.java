package com.example.kvega.project4musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Now Playing Category
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the Music Library Category
        TextView musicLibrary = (TextView) findViewById(R.id.music_library);

        // Set a click listener on that view
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(musicLibraryIntent);
            }
        });

        // Find the View that shows the Store Category
        TextView store = (TextView) findViewById(R.id.store);

        // Set a click listener on that view
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the Settings Category
        TextView settings = (TextView) findViewById(R.id.settings);

        // Set a click listener on that view
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}
