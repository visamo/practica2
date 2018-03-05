package com.example.cv.practica2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonGuardar;
    private EditText editTextNombre;
    private EditText editTextEmail;
    private SeekBar seekBarEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGuardar=(Button) findViewById(R.id.buttonGuardar);
        editTextEmail=(EditText)findViewById(R.id.txtEmail);
        editTextNombre=(EditText)findViewById(R.id.txtNombre);
        //buttonGuardar.setOnClickListener();

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Crear un intent hacia el Activity OtroActivity
                Intent myIntent = new Intent(MainActivity.this,
                        Pantalla2Activity.class);

                //Se envia el mensaje por medio de LLAVE_TEXTO
                myIntent.putExtra("Nombre", editTextNombre.getText());

                //Se envia el intent
                startActivity(myIntent);
            }
        });


    }



}
