package com.testinformation.testinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        String msg = i.getStringExtra("p1");
        Data data = (Data) getIntent().getSerializableExtra("p2");
        Log.d("LOS MENSAJES", "El mensaje es "+ msg);
        Log.d("LOS MENSAJES", data.a + ":"+ data.b);

    }
}
