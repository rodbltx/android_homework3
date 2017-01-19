package com.androidcourse.rsalas.tarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FlowAActivity extends AppCompatActivity {

    private ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_a);

        imagen1 = (ImageView) findViewById(R.id.imageView1);
        imagen2 = (ImageView) findViewById(R.id.imageView2);
        imagen3 = (ImageView) findViewById(R.id.imageView3);
        imagen4 = (ImageView) findViewById(R.id.imageView4);
        imagen5 = (ImageView) findViewById(R.id.imageView5);
        imagen6 = (ImageView) findViewById(R.id.imageView6);
        imagen7 = (ImageView) findViewById(R.id.imageView7);
        imagen8 = (ImageView) findViewById(R.id.imageView8);
        imagen9 = (ImageView) findViewById(R.id.imageView9);
        imagen10 = (ImageView) findViewById(R.id.imageView10);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

        imagen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowAActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });

    }

}
