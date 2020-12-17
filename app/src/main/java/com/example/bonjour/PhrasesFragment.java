package com.example.bonjour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_phrases, container, false);


        RecyclerView phrasesList = rootView.findViewById(R.id.phrasesList);
        phrasesList.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "¿A dónde vas?", R.raw.adondevas));
        words.add(new Word("What is your name?", "¿Cuál es su nombre?", R.raw.cualessunombre));
        words.add(new Word("My name is...", "Me llamo...", R.raw.mellamo));
        words.add(new Word("How are you feeling?", "¿Como te sientes?", R.raw.comotesientes));
        words.add(new Word("I’m feeling good.", "Me siento bien.", R.raw.mesientobien));
        words.add(new Word("Are you coming?", "¿Vienes?", R.raw.vienes));
        words.add(new Word("Yes, I’m coming.", "Si, voy para allá.", R.raw.sivoyparaalla));
        words.add(new Word("I’m coming.", "Ya voy.", R.raw.yavoy));
        words.add(new Word("Let’s go.", "Vamonos.", R.raw.vamonos));
        words.add(new Word("Come here.", "Ven aca", R.raw.venaca));
        words.add(new Word("Hello", "Hola", R.raw.hola));
        words.add(new Word("How are you", "Cómo estás", R.raw.comoestas));
        words.add(new Word("Good", "Bien", R.raw.bien));
        words.add(new Word("Not so good", "No tan bien", R.raw.notanbien));
        words.add(new Word("Nice to meet you", "Encantada de conocerte", R.raw.encantadadeconocerte));
        words.add(new Word("Thank you", "Gracias", R.raw.gracias));
        words.add(new Word("I’m sorry", "Lo siento", R.raw.losiento));
        words.add(new Word("Happy birthday!", "¡Feliz cumpleaños!", R.raw.ifelizcumpleanos));
        words.add(new Word("Good luck!", "¡Buena suerte!", R.raw.ibuenasuerte));



        phrasesList.setAdapter(new WordAdapter(words));

        return rootView;
    }
}