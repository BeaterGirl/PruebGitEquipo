package com.example.amartineza.pruebagitequipo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDeActivity extends AppCompatActivity {

    TextView tv_DatosNombre;
    TextView tv_DatosEscuela;
    TextView tv_DatosAcerca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        tv_DatosNombre = (TextView) findViewById(R.id.tv_nombre);
        tv_DatosEscuela = (TextView) findViewById(R.id.tv_escuela);
        tv_DatosAcerca = (TextView) findViewById(R.id.tv_acecade);

    }
}
