package com.example.amartineza.pruebagitequipo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.amartineza.pruebagitequipo.R;

/**
 * Created by lrodriguez on 3/2/2018.
 */

public class ActivityForm extends AppCompatActivity implements View.OnClickListener{


    EditText etNombre, etSexo, etApellido;
    Button btnSave, btnClear;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etSexo = (EditText) findViewById(R.id.etSexo);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnClear.setOnClickListener(this);
        btnSave.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.btnClear:
                limpiarCampos();
                break;
            case R.id.btnSave:
                guardar();
                break;


            default:
        }
    }

    public void guardar(){
        Toast.makeText(this, etNombre.getText().toString() + " ha sido agregado.", Toast.LENGTH_LONG).show();
        limpiarCampos();
    }

    public void limpiarCampos(){
        etSexo.setText("");
        etNombre.setText("");
        etApellido.setText("");
    }


}
