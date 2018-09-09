package com.example.root.projwimco.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.projwimco.R;

/**
 * SearchLicensePlateFragment is linked with the MainActivity.
 *
 * Usage: Ask the user to enter their license plate number. After
 * that, the fragment will connect with the database and will give
 * the result back to the user.
 *
 */

public class SearchLicensePlateFragment extends Fragment implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_license_plate, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //button_back = view.findViewById(R.id.button_back);

        //button_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.button_license_plate:
                // do something
                break;
            case R.id.button_car_description:
                // do something
                break;
            case R.id.button_help:
                // do something
                break;
        }
    }

}