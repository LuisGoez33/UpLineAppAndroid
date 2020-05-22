package com.example.upline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar (View vista){

        Intent i = new Intent(this, registro.class);
        startActivity(i);

    }

    public void publicaciones (View vista){

        Intent i = new Intent(this, publicacion.class);
        startActivity(i);

    }
}
