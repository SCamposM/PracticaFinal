package com.example.sergi.practicafinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BaseDatos extends Practica {

    EditText creacionbase;
    Button Crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basedatos);

        creacionbase = (EditText) findViewById(R.id.creacionbase);

        Crear = (Button) findViewById(R.id.Aceptar);

    }

    public void onClickCrear(View view){


        String aux_base = creacionbase.getText().toString();


        if(!aux_base.matches("")) {

            Intent i = new Intent(this, Producto.class);
            i.putExtra("base", aux_base);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "Debe ingresar datos", Toast.LENGTH_SHORT).show();
        }
    }
}
