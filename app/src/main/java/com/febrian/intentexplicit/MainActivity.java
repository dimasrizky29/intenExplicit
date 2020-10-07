package com.febrian.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_NAME = "name";
    public final static String EXTRA_INSTITUTION = "institution";

    private EditText edt_name, edt_institution;
    private Button btn_switch_with_data, btn_switch_wthout_data;
    private String getName, getInstitution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.edt_name);
        edt_institution = findViewById(R.id.edt_institution);
        btn_switch_with_data = findViewById(R.id.btn_switch_with_data);
        btn_switch_wthout_data = findViewById(R.id.btn_switch_without_data);

        btn_switch_with_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getName = edt_name.getText().toString();
                getInstitution = edt_institution.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra(EXTRA_NAME, getName);
                intent.putExtra(EXTRA_INSTITUTION, getInstitution);
                startActivity(intent);
            }
        });

        btn_switch_wthout_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            }
        });
    }
}