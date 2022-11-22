package com.example.bkt2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MoTa extends AppCompatActivity {
    TextView txt_tenkhoahoc,txt_tenthuong, txt_dactinh;
    ImageView imgAnhmota, arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta);
        arrow = (ImageView) findViewById(R.id.arrow);
        imgAnhmota =(ImageView) findViewById(R.id.img_mota) ;
        txt_tenkhoahoc =(TextView) findViewById(R.id.txt_tenkhoahoc) ;
        txt_tenthuong =(TextView) findViewById(R.id.txt_tenthuong) ;
        txt_dactinh =(TextView) findViewById(R.id.txt_dactinh);
        Intent intent  = getIntent();
        imgAnhmota.setImageResource(intent.getIntExtra("key1",0));
        txt_tenkhoahoc.setText(intent.getStringExtra("key2"));
        txt_tenthuong.setText(intent.getStringExtra("key3"));
        txt_dactinh.setText(intent.getStringExtra("key4"));

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MoTa.this, Home.class));
            }
        });
    }
}