package com.febrian.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView tv_name, tv_institution;
    private Button btn_activity3;
    private String getName, getInstitution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv_name = findViewById(R.id.tv_name);
        tv_institution = findViewById(R.id.tv_institution);
        btn_activity3 = findViewById(R.id.btn_activity3);

        getName = getIntent().getStringExtra(MainActivity.EXTRA_NAME);
        getInstitution = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUTION);

        tv_name.setText(getName);
        tv_institution.setText(getInstitution);

        btn_activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                intent.putExtra(MainActivity.EXTRA_NAME, getName);
                startActivity(intent);
            }
        });
    }
}