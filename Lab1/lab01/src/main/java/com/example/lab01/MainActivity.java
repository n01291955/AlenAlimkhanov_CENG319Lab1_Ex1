package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView text;
    bottom bottom = new bottom();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.MyText);
        bottom.display(getString(R.string.MainActivity), text); //показывает Mainactivity
        bottom.display(getString(R.string.onCreate),text); //показывает onCreate
    }

    protected void onStart() {
        super.onStart();
        bottom.display(getString(R.string.onStart),text);
    }

}
