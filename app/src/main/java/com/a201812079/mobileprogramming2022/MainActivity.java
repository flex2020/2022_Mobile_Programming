package com.a201812079.mobileprogramming2022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();
        viewPager2 = findViewById(R.id.viewPager2);



        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, 1, fragments);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager2.setCurrentItem(2);
            }
        });
    }

    class ViewPagerAdapter extends FragmentStateAdapter {
        public int mCount;
        ArrayList<Fragment> list;

        public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, int cnt, ArrayList<Fragment> list) {
            super(fragmentActivity);
            this.mCount = cnt;
            this.list = list;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            int index = getRealPosition(position);
            if(index == 0) return list.get(0);
            else if(index == 1) return list.get(1);
            else return list.get(2);
        }

        @Override
        public int getItemCount() {
            return 0;
        }
        public int getRealPosition(int position) {
            return position % mCount;
        }
    }
}