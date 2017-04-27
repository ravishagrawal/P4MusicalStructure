package com.example.android.p4musicalstructure;

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

        // Find the View that shows the songs list category
        TextView songsList = (TextView) findViewById(R.id.song_lists);


        // Set a click listener on that View
        songsList.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the songs view is clicked on.
        @Override
        public void onClick(View view) {
            Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);
            startActivity(songsIntent);
            }
        });

        // Find the View that shows the artist category
        TextView artistList = (TextView) findViewById(R.id.artist_list);

        // Set a click listener on that View
        artistList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs view is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the viewed category

        TextView viewList = (TextView) findViewById(R.id.viewed);

        // Set a click listener on that View
        viewList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs view is clicked on.
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(viewIntent);
            }
        });
    }

}
