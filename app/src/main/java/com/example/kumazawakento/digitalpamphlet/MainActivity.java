package com.example.kumazawakento.digitalpamphlet;


import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends AppCompatActivity {

    private MainFragmentPagerAdapter mAdapter;
    private ViewPager mPager;
    private TitlePageIndicator mIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------------------ウィジェット紐付け
        Button gainButton = (Button)findViewById(R.id.button_gain);
        Button sendaiButton = (Button)findViewById(R.id.button_sendai);
        //---------------------------------------




        //------------------------pager
        mAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        TitlePageIndicator indicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0x18FF0000);
        indicator.setFooterColor(0xFFAA2222);
        indicator.setFooterLineHeight(1 * density); //1dp
        indicator.setFooterIndicatorHeight(3 * density); //3dp
        indicator.setFooterIndicatorStyle(TitlePageIndicator.IndicatorStyle.Underline);
        indicator.setTextColor(0xAA000000);
        indicator.setSelectedColor(0xFF000000);
        indicator.setSelectedBold(true);
        //-----------------------------------------------------------------------------


        //------------- buttonListener gain
        gainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), gainTestActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------


        //------------- buttonListener sendai
        sendaiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), sendaiTestActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------

    }
}
