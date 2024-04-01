package com.example.nav_buttom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class balokActivity extends AppCompatActivity {

    EditText editTextPanjang;
    EditText editTextLebar;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextTinggi = findViewById(R.id.editTextTinggi);
        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
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
        String panjangString = editTextPanjang.getText().toString().trim();
        String lebarString = editTextLebar.getText().toString().trim();
        String tinggiString = editTextTinggi.getText().toString().trim();

        if (panjangString.isEmpty()) {
            editTextPanjang.setError("Masukkan panjang persegi");
            return;
        }
        if (lebarString.isEmpty()) {
            editTextLebar.setError("Masukkan lebar persegi");
            return;
        }
        if (tinggiString.isEmpty()) {
            editTextTinggi.setError("Masukkan lebar persegi");
            return;
        }

        try {
            double panjang = Double.parseDouble(panjangString);
            double lebar = Double.parseDouble(lebarString);
            double tinggi = Double.parseDouble(tinggiString);

            double luas = 2*(panjang * lebar)+(panjang * lebar)+(tinggi * lebar);

            textViewHasil.setText(" " + luas);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            textViewHasil.setText("Error: Masukkan angka yang valid");
        }
    }
}
