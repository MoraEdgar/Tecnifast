package com.example.edgarmora.pruebaversion4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){
                Intent intent= new Intent(LoginActivity.this,MenuMainActivity.class);
                startActivity(intent);
            }
        });


    }



}
