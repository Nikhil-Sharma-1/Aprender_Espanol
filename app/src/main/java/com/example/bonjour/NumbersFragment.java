package com.example.bonjour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {



    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_numbers, container, false);

        RecyclerView numberList = rootView.findViewById(R.id.numberList);
        numberList.setLayoutManager(new LinearLayoutManager(getActivity()));




        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One", "Uno", R.drawable.number_one, R.raw.uno));
        words.add(new Word("Two", "dos", R.drawable.number_two, R.raw.dos));
        words.add(new Word("Three", "tres", R.drawable.number_three, R.raw.tres));
        words.add(new Word("Four", "cuatro", R.drawable.number_four, R.raw.cuatro));
        words.add(new Word("Five", "cinco", R.drawable.number_five, R.raw.cinco));
        words.add(new Word("Six", "seis", R.drawable.number_six, R.raw.seis));
        words.add(new Word("Seven", "siete", R.drawable.number_seven, R.raw.siete));
        words.add(new Word("Eight", "ocho", R.drawable.number_eight, R.raw.ocho));
        words.add(new Word("Nine", "nueve", R.drawable.number_nine, R.raw.nueve));
        words.add(new Word("Ten", "diez", R.drawable.number_ten, R.raw.diez));


        numberList.setAdapter(new WordAdapter(words));



        return rootView;
    }
}