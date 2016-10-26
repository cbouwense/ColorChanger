package com.example.christian.colorchanger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.example.christian.colorchanger.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    RelativeLayout background;
    Button b_btn, g_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (RelativeLayout) findViewById(R.id.activity_main);
        b_btn = (Button) findViewById(R.id.b_btn_id);
        g_btn = (Button) findViewById(R.id.g_btn_id);

        b_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#0000FF"));
            }
        });

        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#00FF00"));
            }
        });

    }
}
