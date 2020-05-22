package com.example.upline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perfil_empresa extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_empresa);
    }

    public void chats (View vista){

        Intent i = new Intent(this, chats.class);
        startActivity(i);

    }
}
