package com.example.nav_buttom;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.nav_buttom.fragments.Fragment1;
import com.example.nav_buttom.fragments.Fragment2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Fragment1())
                .commit();


    }


    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_item1) {
                        selectedFragment = new Fragment1();
                    } else if (item.getItemId() == R.id.menu_item2) {
                        selectedFragment = new Fragment2();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selectedFragment)
                            .commit();

                    return true;
                }
            };
}