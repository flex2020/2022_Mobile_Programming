package com.a201812079.mobileprogramming2022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    BlankFragment1 blankFragment1;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blankFragment1 = new BlankFragment1();
        blankFragment2 = new BlankFragment2();
        blankFragment3 = new BlankFragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment1).commit();

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("통화기록"));
        tabLayout.addTab(tabLayout.newTab().setText("스팸기록"));
        tabLayout.addTab(tabLayout.newTab().setText("연락처"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int pos = tab.getPosition();

                if(pos == 0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment1).commit();

                } else if (pos == 1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment2).commit();

                } else if (pos == 2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment3).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.menu1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment1).commit();

                } else if (id == R.id.menu2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment2).commit();

                } else if (id == R.id.menu3) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, blankFragment3).commit();
                }
                return true;
            }
        });

    }


}