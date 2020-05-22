package com.example.upline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registro extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);
    }

    public void publicaciones (View vista){

        Intent i = new Intent(this, publicacion.class);
        startActivity(i);

    }

}
