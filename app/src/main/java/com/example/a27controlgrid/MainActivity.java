package com.example.a27controlgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.GridView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView lblMensaje;
    GridView grdOpciones;
    private String[] datos = new String[25];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 1; i <= 25; i++)
            datos[i - 1] = "A " + i;

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);

        this.lblMensaje = (TextView) findViewById(R.id.LblMensaje);

        this.grdOpciones = (GridView) findViewById(R.id.GridOpciones);

        grdOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                lblMensaje.setText("Seleccionado: " + datos[pos]);
            }
        });
        grdOpciones.setAdapter(adaptador);
    }
}

