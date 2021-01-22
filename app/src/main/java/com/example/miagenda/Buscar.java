package com.example.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Buscar extends AppCompatActivity {
    TextView tv1;
    ImageButton btnVerContactos;
    private EditText edtNombre, edtApellido, edtCelular, edtDireccion;
    Context ctx = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtCelular = findViewById(R.id.edtCelular);
        edtDireccion = findViewById(R.id.edtDireccion);

        recibirDatos();

    }

    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("nom");
        String d2 = extras.getString("app");
        String d3 = extras.getString("cel");
        String d4 = extras.getString("dir");
        String person = d1 + "\n" + d2 + "\n" + d3 + "\n" + d4;


        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(person);

        List<Persona>milista = new ArrayList<>();
       for(Persona per:milista){
           System.out.println(per.getNombre()+ " "+ per.getApellido()+ per.getCelular());


       }

       public void vercontactos(View v){
            String nombre = edtNombre.getText().toString();
            String apellido = edtApellido.getText().toString();
            String celular = edtCelular.getText().toString();
            String direccion = edtDireccion.getText().toString();

            SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
            SharedPreferences.Editor obj_editor = preferencias.edit();
            obj_editor.putString("nombre", nombre);
            obj_editor.putString("apellido", apellido);
            obj_editor.putString("celular", celular);
            obj_editor.putString("direccion", direccion);
            obj_editor.commit();
            Toast.makeText(this, "guardado", Toast.LENGTH_LONG).show();

            Datos dat = new Datos(
                    edtNombre.getText().toString().trim(),
                    edtApellido.getText().toString().trim(),
                    edtCelular.getText().toString().trim(),
                    edtDireccion.getText().toString().trim());

            Intent i = new Intent(ctx, MiPerfil.class);
            i.putExtra("nom", dat.getNombre());
            i.putExtra("app", dat.getApellido());
            i.putExtra("cel", dat.getCelular());
            i.putExtra("dir", dat.getDireccion());
            startActivity(i);

        }









    }










    }

