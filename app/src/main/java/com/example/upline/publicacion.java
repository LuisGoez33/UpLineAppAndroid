package com.example.upline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class publicacion extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publicaciones);
}

    public void main_activity (View vista){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void chats (View vista){

        Intent i = new Intent(this, chats.class);
        startActivity(i);

    }

    public void desarrollador_perfil (View vista){

        Intent i = new Intent(this, perfil_desarrollador.class);
        startActivity(i);

    }

    public void empresa_perfil (View vista){

        Intent i = new Intent(this, perfil_empresa.class);
        startActivity(i);

    }
}
