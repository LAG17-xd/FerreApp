package com.example.fereapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Construccion extends AppCompatActivity {
    private EditText Cantidad;
    private Button buttonGuardar;
    private DatabaseHelper databaseHelper;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construccion);

        Cantidad = findViewById(R.id.pala);
        buttonGuardar = findViewById(R.id.button);
    }

    public void Guardar(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("ARTICULOS", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String texto = "Pala";
        int cantidad = Integer.parseInt(Cantidad.getText().toString());
        double precio = 200+cantidad;
        editor.putString("nombre_1", texto);
        editor.putInt("cantidad_1", cantidad);
        editor.putFloat("precio_1", (float) precio);
        editor.apply();
        Toast.makeText(Construccion.this, "Listo en carrito", Toast.LENGTH_SHORT).show();

    }
}