package com.example.nav_buttom.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nav_buttom.R;
import com.example.nav_buttom.balokActivity;
import com.example.nav_buttom.kubusActivity;
import com.example.nav_buttom.persegiActivity;
import com.example.nav_buttom.prismaActivity;
import com.example.nav_buttom.jajargenjangActivity;
import com.example.nav_buttom.segitigaActivity;
import com.example.nav_buttom.tabungActivity;

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment2, container, false);

        CardView PersegiCard = root.findViewById(R.id.PersegiCard);
        PersegiCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), persegiActivity.class);
            startActivity(intent);
        });

        CardView SegipanjangCard = root.findViewById(R.id.SegipanjangCard);
        SegipanjangCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), jajargenjangActivity.class);
            startActivity(intent);
        });

        CardView SegilimaCard = root.findViewById(R.id.SegilimaCard);
        SegilimaCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), jajargenjangActivity.class);
            startActivity(intent);
        });

        CardView SegitigaCard = root.findViewById(R.id.SegitigaCard);
        SegitigaCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), segitigaActivity.class);
            startActivity(intent);
        });

        CardView KubusCard = root.findViewById(R.id.KubusCard);
        KubusCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), kubusActivity.class);
            startActivity(intent);
        });

        CardView BalokCard = root.findViewById(R.id.BalokCard);
        BalokCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), balokActivity.class);
            startActivity(intent);
        });

        CardView TabungCard = root.findViewById(R.id.TabungCard);
        TabungCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), tabungActivity.class);
            startActivity(intent);
        });

        CardView PrismaCard = root.findViewById(R.id.PrismaCard);
        PrismaCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), prismaActivity.class);
            startActivity(intent);
        });



        return root; // Return the inflated view that contains the CardView
    }

}