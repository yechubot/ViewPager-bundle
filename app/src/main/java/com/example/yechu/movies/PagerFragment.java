package com.example.yechu.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.yechu.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class PagerFragment extends Fragment {
    ImageView image;
    TextView text;

    public PagerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_viewpager_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        image = view.findViewById(R.id.image);
        text = view.findViewById(R.id.text);

        //메인액티비티에서 받아온 텍스트를 텍스트에 세팅
      if(getArguments()!=null){
          Bundle args = getArguments();
          text.setText(args.getString("text"));
      }

    }


}
