package com.example.tourguide.ui.home;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.tourguide.Adapter;
import com.example.tourguide.Model;
import com.example.tourguide.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors =null;
    ArgbEvaluator argbEvaluator=new ArgbEvaluator();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        models=new ArrayList<>();
        models.add(new Model(R.drawable.cxcxcxccxcxcxc,"RAJASTHAN","YOU CAN DO IT"));
        models.add(new Model(R.drawable.dsdsdsds,"UttarPradesh",""));
        models.add(new Model(R.drawable.goa,"Goa",""));
        models.add(new Model(R.drawable.manalo,"HimachalPradesh","i dssdgffdf gfgfgf fgf fgfgf fg fgfgf  fgf f fsg fsgf fd s s s s s s s s s "));

        adapter =new Adapter(models,getContext());
        viewPager=root.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(10,0,10,0);
        Integer[] colors_temp={
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };
        colors=colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<adapter.getCount()-1&&position<colors.length-1){
                    viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position+1]));

                }
                else {
                    viewPager.setBackgroundColor(colors[colors.length-1]);

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return root;
    }
}