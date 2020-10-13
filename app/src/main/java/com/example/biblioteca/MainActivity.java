package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;
    private Button log;
    private ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.edit1);
        text2 = (EditText)findViewById(R.id.edit2);
        log = (Button)findViewById(R.id.log_btn);
        progress = (ProgressBar)findViewById(R.id.PB);
        progress.setVisibility(View.INVISIBLE);
        log.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                new task().execute();
            }
        });

    }

    class task extends AsyncTask<String, Void, String> {

        @Override
        public void onPreExecute()
        {
            progress.setVisibility(View.VISIBLE);
        }

        @Override //tarea pesada
        protected String doInBackground(String... strings) {

            for(int i = 0; i <=10; i++)
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        public void onPostExecute(String s)
        {
            progress.setVisibility(View.INVISIBLE);
            Intent i = new Intent(getBaseContext(), Home_act.class);
            startActivity(i);
        }
    }

    public void libros (View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("Farenheith");
        libros.add("Revival");
        libros.add("El Alquimista");

        Intent i = new Intent(this, GitHub_act.class);
        i.putExtra("listaLibros", libros);
        startActivity(i);
    }
}