package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.LineHeightSpan;
import android.view.View;
import android.widget.Button;

import com.example.bmicalculator.model.InputNum;

public class MainActivity extends AppCompatActivity {

    private InputNum mInputNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mInputNum = new InputNum();

        Button bnt = (Button) findViewById(R.id.button_cal);

    }



    }

