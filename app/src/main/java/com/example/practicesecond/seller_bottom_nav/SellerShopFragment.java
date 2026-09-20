package com.example.practicesecond.seller_bottom_nav;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicesecond.R;
import com.example.practicesecond.adapters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class SellerShopFragment extends Fragment {
public SellerShopFragment() {
        // Required empty public constructor
    super(R.layout.fragment_seller_shop);
    }

    ViewPager2 vp;
    TabLayout tabLayout;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vp = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.seller_tabLayout);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        vp.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, vp, (tab, position)->{
            if(position == 0) tab.setText("Food");
            if(position == 1) tab.setText("Beverages");
            if(position == 2) tab.setText("Clothes");
            if(position == 3) tab.setText("Electronics");
        }).attach();
    }
}