package com.example.dhktpm15_appstore_nhom8.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.dhktpm15_appstore_nhom8.R;
import com.example.dhktpm15_appstore_nhom8.entity.Cart;
import com.example.dhktpm15_appstore_nhom8.gui.adapter.CartAdapter;

import java.util.ArrayList;
import java.util.List;

public class CartDetail extends AppCompatActivity {

    ListView lvCart;
    List<Cart> listCart;
    CartAdapter adapter;
    int position = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_detail);
        lvCart = findViewById(R.id.lv_item1);

        mapping ();

        adapter = new CartAdapter(this, R.layout.item_cart, listCart);
        lvCart.setAdapter(adapter);
    }

    public void mapping () {
        listCart = new ArrayList<Cart>();
        listCart.add(new Cart(1, 3));
        listCart.add(new Cart(2, 3));
    }
}