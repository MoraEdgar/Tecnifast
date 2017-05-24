package com.example.edgarmora.pruebaversion4;

import android.content.Intent;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMainActivity extends AppCompatActivity {
    private Button btnRegistro;
    private Button btnAyuda;
    private Button btnServicios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);

        btnRegistro = (Button)findViewById(R.id.btnRegisPropietario);

        btnRegistro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){
                Intent intent= new Intent(MenuMainActivity.this,RegistroActivity.class);
                startActivity(intent);
            }
        });


        btnAyuda = (Button)findViewById(R.id.btnPedirAyuda);

        btnAyuda.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){
                Intent intent= new Intent(MenuMainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        btnServicios = (Button)findViewById(R.id.btnPuntosServi);

        btnServicios.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){


                Intent intent= new Intent(MenuMainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}
