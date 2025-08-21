package com.example.farnuture.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.farnuture.R;

public class CartList_Fragment extends Fragment {

    public CartList_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // ربط الـ Fragment بالتصميم craft_fragment.xml
        return inflater.inflate(R.layout.fragment_cart_list, container, false);
    }
}
