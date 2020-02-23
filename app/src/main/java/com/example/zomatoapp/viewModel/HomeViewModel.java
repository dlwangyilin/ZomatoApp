package com.example.zomatoapp.viewModel;

import android.content.Context;
import android.location.Location;

import com.example.zomatoapp.helper.LocationHelper;
import com.example.zomatoapp.helper.ZomatoDataHelper;

public class HomeViewModel {
    private static final String TAG = "HomeViewModel";

    private ZomatoDataHelper zomatoDataHelper;

    public HomeViewModel(Context context) {
        zomatoDataHelper = new ZomatoDataHelper(context);
    }

    public void retrieveCollections(int cityId) {
        zomatoDataHelper.retrieveCollection(cityId);
    }

    public void getCityInfo() {
        zomatoDataHelper.getCityInfo(LocationHelper.getInstance().getCurrentLocation());
    }

    public void getSearchResult(int cityId, Location location) {
        zomatoDataHelper.getSearchResult(cityId, location);
    }
}
