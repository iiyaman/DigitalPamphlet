package com.example.kumazawakento.digitalpamphlet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Tab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        //TabHost tabHost = getTabHost();
        TextView view = new TextView(this);
        view.setText("slack botで遊ぼう2");
        setContentView(view);
        System.out.println("testtab1");
    }
}
