package com.sniekdho.bookreaderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    ImageView imgCriminalPsychology, imgOriginOfSpices, imgPridePrejudice,
                imgArtOfWar, imgWarOfTheWorld;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imgCriminalPsychology   = findViewById(R.id.imgCriminalPsychology);
        imgOriginOfSpices       = findViewById(R.id.imgOriginOfSpices);
        imgPridePrejudice       = findViewById(R.id.imgPridePrejudice);
        imgArtOfWar             = findViewById(R.id.imgArtOfWar);
        imgWarOfTheWorld        = findViewById(R.id.imgWarOfTheWorld);



        //== First PDF Book
        imgCriminalPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.assetName = "criminal_psychology_book.pdf";

                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);

            }
        });
        //== First PDF Book



        //== Second PDF Book
        imgOriginOfSpices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.assetName = "on_the_origin_of_species_book.pdf";

                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);


            }
        });
        //== Second PDF Book



        //== Third PDF Book
        imgPridePrejudice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.assetName = "pride_prejudice_book.pdf";

                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);

            }
        });
        //== Third PDF Book



        //== Fourth PDF Book
        imgArtOfWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.assetName = "the_art_of_war_book.pdf";

                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);

            }
        });
        //== Fourth PDF Book



        //== Fifth PDF Book
        imgWarOfTheWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.assetName = "the_war_of_the_world_book.pdf";

                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);

            }
        });
        //== Fifth PDF Book


    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(Dashboard.this, R.style.MyDialogTheme)
                .setIcon(R.drawable.question)
                .setTitle("EXIT")
                .setMessage("Are You Really Want To Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();

    }

}