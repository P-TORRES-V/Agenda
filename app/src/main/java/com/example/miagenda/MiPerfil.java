package com.example.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.Serializable;

public class MiPerfil extends AppCompatActivity {
    public ImageButton btnGuardar;
    private EditText edtNombre, edtApellido, edtCelular, edtDireccion;
    Context ctx = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_perfil);
        btnGuardar = findViewById(R.id.btnAgregar);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtCelular = findViewById(R.id.edtCelular);
        edtDireccion = findViewById(R.id.edtDireccion);

    }

    public void Guardar(View view) {
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

        Intent i = new Intent(ctx, Buscar.class);
        i.putExtra("nom", dat.getNombre());
        i.putExtra("app", dat.getApellido());
        i.putExtra("cel", dat.getCelular());
        i.putExtra("dir", dat.getDireccion());
        startActivity(i);

    }
}

