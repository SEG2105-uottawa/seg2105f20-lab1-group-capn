package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText teamNameField;
    private TextView teamNameTextField;
    private ImageView logo;
    private EditText teamAddressField;
    private TextView teamAddressTextField;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnOpenInGoogleMaps (v);
            }
        });

        logo = findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnSetAvatarButton(v);
            }
        });

        teamAddressField = findViewById(R.id.teamAddressField);
        //teamAddressTextField = findViewById(R.id.teamAddressTextField);
        teamNameField = findViewById(R.id.teamNameField);
        //teamNameTextField = findViewById(R.id.teamNameTextField);



    }

    public void OnOpenInGoogleMaps (View view) {

        EditText teamAddres = (EditText) findViewById(R.id.teamAddressField);

        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAddres.getText());

        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

            // Make the Intent explicit by setting the Google Maps package  mapIntent.setPackage("com.google.android.apps.maps");
            // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
    }

    public void OnSetAvatarButton(View view) {
    //Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult (intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_CANCELED) return;

    //Getting the Avatar Image we show to our users
        ImageView avatarImage = (ImageView) findViewById(R.id.logo);

    //Figuring out the correct image
        int imageId = data.getIntExtra("imageID", R.id.teamid00);
        String drawableName;

        if (imageId == R.id.teamid00) {
            drawableName = "ic_logo_00";
        } else if (imageId == R.id.teamid01) {
            drawableName = "ic_logo_01";
        } else if (imageId == R.id.teamid02) {
            drawableName = "ic_logo_02";
        } else if (imageId == R.id.teamid03) {
            drawableName = "ic_logo_03";
        } else if (imageId == R.id.teamid04) {
            drawableName = "ic_logo_04";
        } else if (imageId == R.id.teamid05) {
            drawableName = "ic_logo_05";
        } else {
            drawableName = "ic_logo_00";
        }

        int	resID	=	getResources().getIdentifier(drawableName,	"drawable",  getPackageName());
        avatarImage.setImageResource(resID);
    }


}


