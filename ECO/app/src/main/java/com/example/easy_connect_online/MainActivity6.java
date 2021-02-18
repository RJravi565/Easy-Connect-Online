package com.example.easy_connect_online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button bcl, bD, bm1, bc, bpy, bee, bdr, bm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        bcl = findViewById(R.id.bt_cl);
        bD = findViewById(R.id.bt_dss);
        bm1 = findViewById(R.id.bt_m1);
        bc = findViewById(R.id.bt_c);
        bpy = findViewById(R.id.bt_py);
        bee = findViewById(R.id.bt_bee);
        bdr = findViewById(R.id.bt_dr);
        bm2 = findViewById(R.id.bt_m2);
        bcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.geeksforgeeks.org/c-programming-language/");
            }
        });
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.javatpoint.com/data-structure-tutorial");
            }
        });
        bm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("http://menso88.weebly.com/uploads/1/7/5/8/17586891/textbook_og_engineering_matematics.pdf");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.grandinetti.org/general-chemistry-tutorial");
            }
        });
        bpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.physicsclassroom.com/class");
            }
        });
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("http://www.griet.ac.in/nodes/BEEE.pdf");
            }
        });
        bdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://bharatskills.gov.in/pdf/E_books/Engineering_Drawing_1st_Sem_Final.pdf");
            }
        });
        bm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("http://www.tndte.gov.in/site/wp-content/uploads/2016/08/Engineering-Mathematics-II.pdf");
            }
        });


    }


    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}