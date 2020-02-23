package com.example.zomatoapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zomatoapp.R;
import com.example.zomatoapp.databinding.FragmentNightlifeLayoutBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class NightLifeFragment extends Fragment {
    private FragmentNightlifeLayoutBinding mBinding;

    public static NightLifeFragment newInstance() {
        return new NightLifeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_nightlife_layout, container, false);
        return mBinding.getRoot();
    }
}
