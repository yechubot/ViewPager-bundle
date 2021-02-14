package com.example.yechu.movies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.yechu.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;

    private PagerAdapter adapter;
    private ArrayList<String> textLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLists = new ArrayList<>();
        textLists.add("1");
        textLists.add("2");
        textLists.add("3");

        pager = findViewById(R.id.pager);
        adapter = new PagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setClipToPadding(false);

        for(int i =0; i<textLists.size(); i++){
            PagerFragment fragment = new PagerFragment();
            Bundle bundle= new Bundle();
            bundle.putString("text",textLists.get(i));
            fragment.setArguments(bundle);
            adapter.addItem(fragment);
        }
        adapter.notifyDataSetChanged();


    }

    private class PagerAdapter extends FragmentPagerAdapter {

        //뷰페이저에 들어갈 프래그먼트 담을 리스트
        List<Fragment> frags = new ArrayList<>();

        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return frags.get(position);
        }

        @Override
        public int getCount() {
            return frags.size();
        }

        public void addItem(Fragment fra) {
            frags.add(fra);
        }
    }

}
