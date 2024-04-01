package com.example.nav_buttom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class prismaActivity extends AppCompatActivity {
    
    EditText editTextAlas;
    EditText editTextTinggi;
    EditText editTextKelilingAlas;
    Button buttonHitung;
    TextView textViewHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);

        editTextTinggi = findViewById(R.id.editTextTinggi);
        editTextAlas = findViewById(R.id.editTextAlas);
        editTextKelilingAlas = findViewById(R.id.editTextKelilingAlas);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPrisma();
            }
        });
    }

    private void hitungLuasPrisma() {
        String alasString = editTextAlas.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();
        String kelilingalasString = editTextKelilingAlas.getText().toString().trim();


        if (alasString.isEmpty()) {
            editTextAlas.setError("Masukkan alas persegi");
            return;
        }
        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan tinggi persegi");
            return;
        }
        if (kelilingalasString.isEmpty()) {
            editTextKelilingAlas.setError("Masukkan Keliling Alas persegi");
            return;
        }


        try {
            double Alas = Double.parseDouble(alasString);
            double tinggi = Double.parseDouble(tinggiString);
            double kelilingalas = Double.parseDouble(kelilingalasString);


            double luas = (2*0.5*Alas*tinggi)+(kelilingalas*tinggi);

            textViewHasil.setText("" + luas);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            textViewHasil.setText("Error: Masukkan angka yang valid");
        }
    }
}
