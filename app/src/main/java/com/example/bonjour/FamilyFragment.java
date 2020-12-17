package com.example.bonjour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_family, container, false);


        RecyclerView familyList = rootView.findViewById(R.id.familyList);
        familyList.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Father", "Padre", R.drawable.family_father, R.raw.padre));
        words.add(new Word("Mother", "Madre", R.drawable.family_mother, R.raw.madre));
        words.add(new Word("Son", "Hijo", R.drawable.family_son, R.raw.hijo));
        words.add(new Word("Daughter", "Hija", R.drawable.family_daughter, R.raw.hija));
        words.add(new Word("Older Brother", "Hermano Mayor", R.drawable.family_older_brother, R.raw.hermanamayor));
        words.add(new Word("Younger Brother", "Hermano más joven", R.drawable.family_younger_brother, R.raw.hermanomasjoven));
        words.add(new Word("Older Sister", "Hermana Mayor", R.drawable.family_older_sister, R.raw.hermanamayor));
        words.add(new Word("Younger Sister", "Hermana Menor", R.drawable.family_younger_sister, R.raw.hermanamenor));
        words.add(new Word("Grandmother", "Abuela", R.drawable.family_grandmother, R.raw.abuela));
        words.add(new Word("Grandfather", "Abuelo", R.drawable.family_grandfather, R.raw.abuelo));
        words.add(new Word("Father-in-law", "Suegro", R.drawable.family_father, R.raw.suegro));
        words.add(new Word("Mother-in-law", "Suegra", R.drawable.family_mother, R.raw.suegra));
        words.add(new Word("Brother-in-law", "Cuñado", R.drawable.family_older_brother, R.raw.cunado));
        words.add(new Word("Sister-in-law", "Cuñada", R.drawable.family_older_sister, R.raw.cunada));
        words.add(new Word("Husband", "Marido", R.drawable.family_father, R.raw.marido));
        words.add(new Word("Wife", "Mujer", R.drawable.family_mother, R.raw.mujer));



        familyList.setAdapter(new WordAdapter(words));

        return rootView;
    }
}