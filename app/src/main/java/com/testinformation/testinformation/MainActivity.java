package com.testinformation.testinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    TextView salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.editText);
        salida = (TextView) findViewById(R.id.textView);
    }

    public void onClickButton(View view) {
        Toast.makeText(this,texto.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void onClickButton2(View view) {
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("p1",texto.getText().toString());
        i.putExtra("p2", new Data(2,5));
        startActivity(i);
    }
}
