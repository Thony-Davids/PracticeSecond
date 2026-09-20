package com.example.practicesecond;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practicesecond.seller_bottom_nav.SellerProductsFragment;
import com.example.practicesecond.seller_bottom_nav.SellerProfileFragment;
import com.example.practicesecond.seller_bottom_nav.SellerShopFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.seller_navigation);
        bottomNavigationView.setOnItemSelectedListener(item->{
            int id = item.getItemId();

            if(id == R.id.seller_shop_navigation){
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_containerView, new SellerShopFragment())
                        .commit();
            }
            else if(id == R.id.seller_product_list){
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_containerView, new SellerProductsFragment())
                        .commit();
            }
            else if(id == R.id.seller_profile){
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragment_containerView, new SellerProfileFragment())
                        .commit();
            }
            return true;
        });
        bottomNavigationView.setSelectedItemId(R.id.seller_shop_navigation);
    }
}