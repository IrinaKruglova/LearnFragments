package com.simbirsoft.learnfragments.viewpager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.simbirsoft.learnfragments.R;
import com.simbirsoft.learnfragments.dynamic.DynamicFragmentOne;
import com.simbirsoft.learnfragments.dynamic.DynamicFragmentTwo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        ButterKnife.bind(this);

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new DynamicFragmentOne();
            } else {
                return new DynamicFragmentTwo();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
