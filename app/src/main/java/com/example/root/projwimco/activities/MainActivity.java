package com.example.root.projwimco.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.root.projwimco.R;
import com.example.root.projwimco.fragments.StartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            StartFragment startFragment = new StartFragment();
            transaction.add(R.id.main_layout_holder, startFragment);
            transaction.commit();
        }

    }
}
