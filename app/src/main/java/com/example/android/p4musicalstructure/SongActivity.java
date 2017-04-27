package com.example.android.p4musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // Find the View that shows the artist category
        TextView homeScreen = (TextView) findViewById(R.id.backtohome);

        // Set a click listener on that View
        homeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs view is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
