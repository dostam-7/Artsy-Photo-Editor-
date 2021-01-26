package com.dostam.artsy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.dostam.artsy.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        binding = ActivityResultBinding.inflate (getLayoutInflater ());
        setContentView (binding.getRoot ());

        binding.image.setImageURI (getIntent().getData ());
    }
}