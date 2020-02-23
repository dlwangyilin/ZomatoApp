package com.example.zomatoapp.ui;

import com.example.zomatoapp.R;
import com.example.zomatoapp.ui.common.CommonRecyclerAdapter;
import com.example.zomatoapp.viewModel.RestaurantItemViewModel;

import java.util.List;

public class RestaurantListAdapter extends CommonRecyclerAdapter<RestaurantItemViewModel> {
    public RestaurantListAdapter(List<RestaurantItemViewModel> data) {
        super(data);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.layout_item_restaurant;
    }
}
