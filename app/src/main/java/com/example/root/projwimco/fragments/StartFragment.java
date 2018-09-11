package com.example.root.projwimco.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.root.projwimco.R;

/**
 * StartFragment is attached to MainActivity.
 *
 * Usage: Welcome the user, then ask them how to find their car.
 * Either by asking the user provide their license plate, or try
 * to describe their car.
 *
 */

public class StartFragment extends Fragment implements View.OnClickListener{

    private static final String TAG = "StartFragment";
    private static final String BACK_STACK_ROOT_TAG = "root_fragment";

    private Button button_license_plate;
    private Button button_car_description;
    private Button button_help;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        button_license_plate = view.findViewById(R.id.button_license_plate);
        button_car_description = view.findViewById(R.id.button_car_description);
        button_help = view.findViewById(R.id.button_help);

        button_license_plate.setOnClickListener(this);
        button_car_description.setOnClickListener(this);
        button_help.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()){
            case R.id.button_license_plate:
                fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                SearchLicensePlateFragment searchLicensePlateFragment
                        = new SearchLicensePlateFragment();
                fragmentTransaction.replace(R.id.main_layout_holder, searchLicensePlateFragment);
                fragmentTransaction.addToBackStack(BACK_STACK_ROOT_TAG);
                fragmentTransaction.commit();
                break;
            case R.id.button_car_description:
                fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                SearchCarDescriptionFragment searchCarDescriptionFragment
                        = new SearchCarDescriptionFragment();
                fragmentTransaction.replace(R.id.main_layout_holder, searchCarDescriptionFragment);
                fragmentTransaction.addToBackStack(BACK_STACK_ROOT_TAG);
                fragmentTransaction.commit();
                break;
            case R.id.button_help:
                // do something
                break;
        }
    }

}