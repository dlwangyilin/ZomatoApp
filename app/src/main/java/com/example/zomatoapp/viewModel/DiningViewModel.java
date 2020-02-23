package com.example.zomatoapp.viewModel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.zomatoapp.activities.RestaurantActivity;
import com.example.zomatoapp.helper.ZomatoDataHelper;

import androidx.databinding.ObservableField;

public class DiningViewModel {

    private Context context;
    private ZomatoDataHelper zomatoDataHelper;

    public DiningViewModel(Context context) {
        this.context = context;
        zomatoDataHelper = new ZomatoDataHelper(context);
    }

    public ObservableField<String> cityName = new ObservableField<>();

    public void onClick(View view) {
        Intent intent = new Intent(context, RestaurantActivity.class);
        context.startActivity(intent);
    }

    public void retrieveRestaurantInfo(int id) {
        zomatoDataHelper.retrieveRestaurant(id);
    }

}
