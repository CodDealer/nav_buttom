package com.example.nav_buttom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tabungActivity extends AppCompatActivity {

    EditText editTextTinggi;
    EditText editTextJari;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        editTextTinggi = findViewById(R.id.editTextTinggi);
        editTextJari = findViewById(R.id.editTextJari);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegipanjang();
            }
        });
    }

    private void hitungLuasPersegipanjang() {
        String tinggiString = editTextTinggi.getText().toString().trim();
        String jariString = editTextJari.getText().toString().trim();

        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan panjang persegi");
            return;
        }
        if (jariString.isEmpty()) {
            editTextTinggi.setError("Masukkan lebar persegi");
            return;
        }

        try {
            double tinggi = Double.parseDouble(tinggiString);
            double jari = Double.parseDouble(jariString);

            double luas = Math.PI * Math.pow(jari, 2) * tinggi;

            textViewHasil.setText("" + luas);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            textViewHasil.setText("Error: Masukkan angka yang valid");
        }
    }
}
