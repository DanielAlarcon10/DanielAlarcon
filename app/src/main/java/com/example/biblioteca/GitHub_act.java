package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Precios;

public class GitHub_act extends AppCompatActivity {

    private Spinner spin;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub_act);

        spin = (Spinner)findViewById(R.id.spn_github);
        tv = (TextView)findViewById(R.id.TV_github);

        ArrayList<String> Libros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Libros);
        spin.setAdapter(adapt);
    }

    public void precio(View v)
    {
        String biblioteca = spin.getSelectedItem().toString();

        Precios valor = new Precios();

        valor.setPrecioFarenheith(7000);
        valor.setPrecioRevival(22000);

        if(biblioteca.equals("Farenheith"))
        {
            tv.setText("el precio de Farenheith es: " + valor.getPrecioFarenheith());
        }

        if(biblioteca.equals("Revival"))
        {
            tv.setText("el precio de Revival es: " + valor.getPrecioRevival());
        }

        if(biblioteca.equals("El Alquimista"))
        {
            tv.setText("el precio de El Alquimista es: " + valor.getPrecioAlquimista());
        }

        if(biblioteca.equals("El Poder"))
        {
            tv.setText("el precio de El Poder es: " + valor.getPrecioElPoder());
        }

        if(biblioteca.equals("Despertar"))
        {
            tv.setText("El precio de Despertar es: " + valor.getPrecioDespertar());
        }

    }
}