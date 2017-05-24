package com.example.edgarmora.pruebaversion4;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private static int splashtime = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        new Handler().postDelayed(new Runnable(){

            public void run(){
                Intent principalIntent = new Intent(HomeActivity.this,MenuMainActivity.class);
                startActivity(principalIntent);
                finish();
            }
        },splashtime);

    }
}



