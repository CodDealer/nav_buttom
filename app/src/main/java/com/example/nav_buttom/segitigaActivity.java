package com.example.nav_buttom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitigaActivity extends AppCompatActivity {

    EditText editTextAlas;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegiTiga();
            }
        });
    }

    private void hitungLuasSegiTiga() {
        String alasString = editTextAlas.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (alasString.isEmpty()) {
            editTextAlas.setError("Masukkan panjang Segitiga");
            return;
        }
        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan lebar Segitiga");
            return;
        }

        try {
            double alas = Double.parseDouble(alasString);
            double tinggi = Double.parseDouble(tinggiString);

            double luas = 0.5 * alas * tinggi;

            textViewHasil.setText("" + luas);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            textViewHasil.setText("Error: Masukkan angka yang valid");
        }
    }
}
