package com.example.easy_connect_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {
    Button btc,bte,btee,btci,btm,btml,bta,bti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btc=findViewById(R.id.et_c);
        bte=findViewById(R.id.et_e);
        btee=findViewById(R.id.et_ee);
        btci=findViewById(R.id.et_ci);
        btm=findViewById(R.id.et_m);
        btml=findViewById(R.id.et_ml);
        bta=findViewById(R.id.et_a);
        bti=findViewById(R.id.et_i);

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);

                startActivity(i);
            }
        });
        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        btee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);

                startActivity(i);
            }
        });
        btci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        btml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        bti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
    }
}