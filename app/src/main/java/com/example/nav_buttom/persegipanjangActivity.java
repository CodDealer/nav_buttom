package com.example.nav_buttom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegipanjangActivity extends AppCompatActivity {

    EditText editTextPanjang;
    EditText editTextLebar;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

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

        if (panjangString.isEmpty()) {
            editTextPanjang.setError("Masukkan panjang persegi");
            return;
        }
        if (lebarString.isEmpty()) {
            editTextLebar.setError("Masukkan lebar persegi");
            return;
        }

        try {
            double panjang = Double.parseDouble(panjangString);
            double lebar = Double.parseDouble(lebarString);

            double luas = panjang * lebar;

            textViewHasil.setText("" + luas);
        } catch (NumberFormatException e) {
            // Handle non-numeric input
            textViewHasil.setText("Error: Masukkan angka yang valid");
        }
    }
}
