package com.febrian.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    private TextView tv_name;
    private Button btn_activity1;
    private String getName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn_activity1 = findViewById(R.id.btn_activity1);
        tv_name = findViewById(R.id.tv_name2);
        getName = getIntent().getStringExtra(MainActivity.EXTRA_NAME);
        tv_name.setText(getName);
        btn_activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}