package com.example.swipeviews;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //actionBar
    private ActionBar actionBar;

    //UI Views
    private ViewPager viewPager;

    private ArrayList<MyModel> modelArrayList;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init actionbar
        actionBar = getSupportActionBar();

        //init UI views
        viewPager = findViewById(R.id.viewPager);
        modelArrayList = MyModel.loadCards();
        //setup adapter
        myAdapter = new MyAdapter(this,modelArrayList);

        //set adapter to view pager
        viewPager.setAdapter(myAdapter);

        //set default padding from left/right
        viewPager.setPadding(100,0,100,0);
        viewPager.addOnPageChangeListener(onPageChangeListener());
    }
    private ViewPager.OnPageChangeListener onPageChangeListener(){
        return new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //Will just change the title of actionbar
                String title = modelArrayList.get(position).getTitle();
                actionBar.setTitle(title);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        };
    }
}