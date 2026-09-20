package com.example.practicesecond.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.practicesecond.Products;
import com.example.practicesecond.R;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter {
    List<Products> productsArrayList = new ArrayList<>();
    Context context;

    public MyCustomAdapter(@NonNull Context context) {
        super(context, R.layout.seller_custom_layout, new ArrayList<>());
    }

    public void setProducts(ArrayList<Products> productsArrayList){
        this.productsArrayList = productsArrayList;
        notifyDataSetChanged();
    }


    public static class MyViewHolder{
        ImageView product_image;
        TextView product_name;
        TextView product_price;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Products products = (Products) getItem(position);
        MyViewHolder myViewHolder;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.seller_custom_layout,
                    parent,
                    false);

            myViewHolder.product_image = convertView.findViewById(R.id.product_image);
            myViewHolder.product_name = convertView.findViewById(R.id.product_name);
            myViewHolder.product_price = convertView.findViewById(R.id.product_price);
            convertView.setTag(myViewHolder);
        }

        else{
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.product_image.setImageResource(products.getProduct_image());
        myViewHolder.product_name.setText(products.getProduct_name());
        myViewHolder.product_price.setText(products.getProduct_price());
        return convertView;
    }
}
