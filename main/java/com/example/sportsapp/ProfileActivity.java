package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    protected ImageView teamid00, teamid01,teamid02,teamid03, teamid04, teamid05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        teamid00 = findViewById(R.id.teamid00);
        teamid00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });

        teamid01 = findViewById(R.id.teamid01);
        teamid01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });

        teamid02 = findViewById(R.id.teamid02);
        teamid02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });

        teamid03 = findViewById(R.id.teamid03);
        teamid03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });

        teamid04 = findViewById(R.id.teamid04);
        teamid04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });

        teamid05 = findViewById(R.id.teamid05);
        teamid05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetTeamIcon(v);
            }
        });
    }

    public void SetTeamIcon(View view) {
    //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();

    //Figuring out which image was clicked
        ImageView selectedImage = (ImageView) view;

    //Adding stuff to the return intent  returnIntent.putExtra("imageID", selectedImage.getId());  setResult(RESULT_OK, returnIntent);
        returnIntent.putExtra("imageID", selectedImage.getId());
        setResult(RESULT_OK, returnIntent);
    //Finishing Activity and return to main screen!
        finish();
    }


}