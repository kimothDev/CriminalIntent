package com.example.criminallntent;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.UUID;

public class CrimeActivity extends FragmentActivity {

    public static final String EXTRA_CRIME_ID = "com.example.criminallntent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("CrimeActivity", "onCreate started");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_xml);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
            fragment = CrimeFragment.newInstance(crimeId);
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}