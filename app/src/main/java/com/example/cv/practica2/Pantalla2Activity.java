package com.example.cv.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla2Activity extends AppCompatActivity {
    private Button buttonRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        buttonRegresar=(Button) findViewById(R.id.buttonRegresar);
        //buttonGuardar.setOnClickListener();

        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent hacia el Activity OtroActivity
                Intent myIntent = new Intent(
                        Pantalla2Activity.this,MainActivity.class);

                //Se envia el mensaje por medio de LLAVE_TEXTO
                //myIntent.putExtra(Constantes.LLAVE_TEXTO, mensaje);

                //Se envia el intent
                startActivity(myIntent);
            }
        });

    }
}
