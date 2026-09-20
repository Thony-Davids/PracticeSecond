package com.example.practicesecond.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practicesecond.seller_shop_categories.BeveragesFragment;
import com.example.practicesecond.seller_shop_categories.ClothesFragment;
import com.example.practicesecond.seller_shop_categories.ElectronicsFragment;
import com.example.practicesecond.seller_shop_categories.FoodFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new FoodFragment();
        if(position == 1) return new BeveragesFragment();
        if(position == 2) return new ClothesFragment();
        return new ElectronicsFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
