package com.example.lab01;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class bottom extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.bottom, container, false);
        return view;
    }


    public void display(String messagge,TextView text) {

        if (text.getText().toString().equals("")) {
            text.setText(messagge);
            text.append("\n");
        }
        else {
            text.append(messagge);
            text.append("\n");}
    }

}
