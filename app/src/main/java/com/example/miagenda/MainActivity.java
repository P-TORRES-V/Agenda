package com.example.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public ImageButton btnVerContactos, btnAgregar;
    Context ctx=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVerContactos=findViewById(R.id.btnVerContactos);
        btnAgregar=findViewById(R.id.btnAgregar);

        btnVerContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ctx, ListaContactos.class);
                startActivity(i);

            }

        });

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ctx, MiPerfil.class);
                startActivity(i);

            }
        });





    }
}