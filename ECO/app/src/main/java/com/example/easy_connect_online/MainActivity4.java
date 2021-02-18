package com.example.easy_connect_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity {
    RadioButton radioButton;
    Button ss;
    Button f;
    Button c;
    Button m;
    Button fp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        ss=findViewById(R.id.bt_ss);
        f=findViewById(R.id.bt_py);
        c=findViewById(R.id.bt_c);
        m=findViewById(R.id.bt_m);
        fp=findViewById(R.id.bt_fp);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(i);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity8.class);
                startActivity(i);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(i);
            }
        });
        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity9.class);
                startActivity(i);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity10.class);
                startActivity(i);
            }
        });

        radioButton=findViewById(R.id.et_rb1);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(i);
            }
        });
    }
}