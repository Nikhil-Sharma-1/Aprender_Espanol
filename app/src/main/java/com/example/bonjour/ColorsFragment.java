package com.example.bonjour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_colors, container, false);

        RecyclerView colorList = rootView.findViewById(R.id.colorList);
        colorList.setLayoutManager(new LinearLayoutManager(getActivity()));



        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Red", "Rojo", R.drawable.color_red, R.raw.rojo));
        words.add(new Word("Green", "Verde", R.drawable.color_green, R.raw.verde));
        words.add(new Word("Brown", "Marrón", R.drawable.color_brown, R.raw.marron));
        words.add(new Word("Gray", "Gris", R.drawable.color_gray, R.raw.gris));
        words.add(new Word("Black", "Negro", R.drawable.color_black, R.raw.negro));
        words.add(new Word("White", "Blanco", R.drawable.color_white, R.raw.blanco));
        words.add(new Word("Dusty Yellow", "Amarilla polvorienta", R.drawable.color_dusty_yellow, R.raw.amarillapolvorienta));
        words.add(new Word("Mustard Yellow", "Amarilla mostaza", R.drawable.color_mustard_yellow, R.raw.amarillamostaza));
        words.add(new Word("Yellow", "Amarillo", R.drawable.color_yellow, R.raw.amarillo));
        words.add(new Word("Blue", "Azul", R.drawable.color_blue, R.raw.azul));
        words.add(new Word("Teal", "Verde azulado", R.drawable.color_teal, R.raw.verdeazulado));
        words.add(new Word("Silver", "Plata", R.drawable.color_silver, R.raw.plata));
        words.add(new Word("Purple", "Morado", R.drawable.color_purple, R.raw.morado));
        words.add(new Word("Navy Blue", "Azul Marino", R.drawable.color_navy, R.raw.azulmarino));
        words.add(new Word("Orange", "Naranja", R.drawable.color_orange, R.raw.naranja));
        words.add(new Word("Cyan", "Cian", R.drawable.color_cyan, R.raw.cian));



        colorList.setAdapter(new WordAdapter(words));

        return rootView;
    }
}