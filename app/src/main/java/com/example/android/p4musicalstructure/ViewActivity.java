package com.example.android.p4musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        // Find the View that shows the artist category
        TextView viewHomeScreen = (TextView) findViewById(R.id.backtohome_view);

        // Set a click listener on that View
        viewHomeScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs view is clicked on.
            @Override
            public void onClick(View view) {
                Intent backViewIntent = new Intent(ViewActivity.this, MainActivity.class);
                startActivity(backViewIntent);
            }
        });
    }
}
