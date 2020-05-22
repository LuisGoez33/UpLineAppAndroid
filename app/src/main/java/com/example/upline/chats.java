package com.example.upline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chats extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chats);
    }

    public void chat (View vista){

        Intent i = new Intent(this, chat.class);
        startActivity(i);

    }
}
