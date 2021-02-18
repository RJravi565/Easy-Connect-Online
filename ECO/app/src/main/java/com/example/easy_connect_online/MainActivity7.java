package com.example.easy_connect_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button bai,bml,biot,bds,br,bcnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        bai=findViewById(R.id.bt_ai);
        bml=findViewById(R.id.bt_ml);
        biot=findViewById(R.id.bt_iot);
        bds = findViewById(R.id.bt_ds);
        br = findViewById(R.id.bt_r);
        bcnn=findViewById(R.id.bt_cnn);
        bai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/JMUxmLyrhSk");
            }
        });
        bml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/GwIo3gDZCVQ");
            }
        });
        biot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/h0gWfVCSGQQ");
            }
        });
        bds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/-ETQ97mXXF0");
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/MBl-3Yb30FA");
            }
        });
        bcnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://youtu.be/L3ZzkOTDins");
            }
        });




    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}