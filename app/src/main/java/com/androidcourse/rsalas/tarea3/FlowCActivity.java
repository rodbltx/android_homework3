package com.androidcourse.rsalas.tarea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlowCActivity extends AppCompatActivity {

    private Button buttonRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_c);

        buttonRegresar = (Button) findViewById(R.id.buttonRegresar);

        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FlowCActivity.this, FlowBActivity.class);
                startActivity(i);
            }
        });


    }
}
