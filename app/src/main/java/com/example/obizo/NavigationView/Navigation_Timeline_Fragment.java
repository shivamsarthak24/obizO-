package com.example.obizo.NavigationView;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.obizo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Navigation_Timeline_Fragment extends Fragment {


    public Navigation_Timeline_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation__timeline_, container, false);
    }

}
