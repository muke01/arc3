package com.arcdrive.arc;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    private ImageButton arrowButton;
    private ImageButton arrowNoBorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        arrowButton = (ImageButton) findViewById(R.id.arrowButton);
        arrowNoBorder = (ImageButton) findViewById(R.id.arrowNoBorder);

        arrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApplicationActivity();
            }
        });

        arrowNoBorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginSignupActivity();
            }
        });
    }

    public void openLoginSignupActivity() {
        Intent intent = new Intent(this, LoginSignupActivity.class);
        startActivity(intent);
    }

    public void openApplicationActivity() {
        Intent intent = new Intent(this, ApplicationActivity.class);
        startActivity(intent);
    }

}
