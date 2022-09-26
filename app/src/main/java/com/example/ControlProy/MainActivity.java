package com.example.ControlProy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox seleccionarChk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionarChk = (CheckBox)
        findViewById(R.id.chkSeleccionar);
    }

    public void btnChek (View v) {
        if (seleccionarChk.isChecked()) {
            Intent intent = new Intent(this,Spinner.class);
            startActivity(intent);
        }
        else{
            String mensaje = "Debes seleccionar para avanzar";
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        }
    }



}