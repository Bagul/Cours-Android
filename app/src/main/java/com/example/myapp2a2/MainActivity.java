package com.example.myapp2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button choix1;
    private Button choix2;
    private Button choix3;
    private EditText edit_saisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choix1 = findViewById(R.id.choix_1_btn);
        choix2 = findViewById(R.id.choix_2_btn);
        choix3 = findViewById(R.id.choix_3_btn);
        edit_saisie = findViewById(R.id.edit_saisie);

        choix1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Executé lors du clic
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });

        choix2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.title_dialog)
                        .setMessage(R.string.message_dialog)
                        .setPositiveButton(R.string.oui_dialog, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton(R.string.non_dialog, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setCancelable(false)
                        .show();
            }
        });

        choix3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edit_saisie.getText().toString().length() == 0){
                    edit_saisie.setError("Veuillez saisir votre texte");
                    return;
                }
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("SAISIE", edit_saisie.getText().toString());
                startActivity(i);
            }
        });

    }
}
