package com.example.zomatoapp.ui;

import com.example.zomatoapp.R;
import com.example.zomatoapp.ui.common.CommonRecyclerAdapter;
import com.example.zomatoapp.viewModel.CollectionItemViewModel;

import java.util.List;

public class CollectionListAdapter extends CommonRecyclerAdapter<CollectionItemViewModel> {
    public CollectionListAdapter(List<CollectionItemViewModel> data) {
        super(data);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.layout_item_collection;
    }
}
