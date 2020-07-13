package com.example.aaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import static com.example.aaa.R.*;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    ViewPager pager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout dr  =findViewById(id.);


        bottomNavigationView =findViewById(id.bottom_navigation);
        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        MypagerAdapter adapter = new MypagerAdapter(getSupportFragmentManager());
        adapter.addItem(fragment1);
        adapter.addItem(fragment2);
        adapter.addItem(fragment3);
        pager.setAdapter(adapter);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.tab1:{
                        pager.setCurrentItem(0);
                        return true;
                    }
                    case R.id.tab2:{
                        pager.setCurrentItem(1);
                        return true;
                    }
                    case R.id.tab3:{
                        pager.setCurrentItem(2);
                        return true;
                    } default: return false;
                }
            }
        });
    }

    class MypagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment> ();
        public MypagerAdapter(FragmentManager fm){
            super(fm);
        }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }
        @Override
        public int getCount() {
            return items.size();
        }
        public void addItem(Fragment item){
            items.add(item);
        }

    }
}