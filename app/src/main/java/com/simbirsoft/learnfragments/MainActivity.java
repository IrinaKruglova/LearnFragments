package com.simbirsoft.learnfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simbirsoft.learnfragments.dynamic.DynamicFragmentActivity;
import com.simbirsoft.learnfragments.navigation.NavigationActivity;
import com.simbirsoft.learnfragments.static_fragment.StaticFragmentActivity;
import com.simbirsoft.learnfragments.viewpager.ViewPagerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.static_fragment)
    View staticView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.static_fragment)
    public void staticClicked(){
        startActivity(new Intent(this, StaticFragmentActivity.class));
    }

    @OnClick(R.id.dynamic_fragment)
    public void dynamicClicked(){
        startActivity(new Intent(this, DynamicFragmentActivity.class));
    }

    @OnClick(R.id.navigation_menu)
    public void navigationClicked(){
        startActivity(new Intent(this, NavigationActivity.class));
    }

    @OnClick(R.id.viewpager)
    public void pagerClicked(){
        startActivity(new Intent(this, ViewPagerActivity.class));
    }
}
