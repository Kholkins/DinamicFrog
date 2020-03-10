package com.example.dinamicfragment;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.dinamicfragment.fragment.OneFragment;
import com.example.dinamicfragment.fragment.TwoFragment;

public class MainActivity extends FragmentActivity {

    private OneFragment oneFragment = new OneFragment();
    private TwoFragment twoFragment = new TwoFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
