package com.example.zomatoapp.ui;

import com.example.zomatoapp.R;
import com.example.zomatoapp.ui.common.CommonRecyclerAdapter;
import com.example.zomatoapp.viewModel.HighlightItemViewModel;

import java.util.List;

public class HighlightListAdapter extends CommonRecyclerAdapter<HighlightItemViewModel> {

    public HighlightListAdapter(List<HighlightItemViewModel> data) {
        super(data);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.layout_highlight_item;
    }
}
