package com.example.administrator.mobileshopliufangnan.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.mobileshopliufangnan.R;

public class HomeFragment extends BaseFragment {

    @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        return view;
    }
}
