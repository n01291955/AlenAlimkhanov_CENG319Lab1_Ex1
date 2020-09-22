package com.example.lab01;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;
import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class top extends ListFragment {

    TextView tvAI, tvVR;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top,container,false);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.ActivityList));
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        top fragment = (top) getFragmentManager().findFragmentById(R.id.ai);

        fragment.display("check");
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

    public void display(String activity){
        tvAI.setText(activity);
    }

}
