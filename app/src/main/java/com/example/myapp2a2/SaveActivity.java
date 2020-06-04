package com.example.myapp2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaveActivity extends AppCompatActivity {

    private TextView tv_content;
    private Button btn_save, btn_load;
    private EditText edt_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        tv_content = findViewById(R.id.tv_load_text);
        btn_load = findViewById(R.id.btn_load);
        btn_save = findViewById(R.id.btn_save);
        edt_s = findViewById(R.id.edt_save_saisie);
    }
}