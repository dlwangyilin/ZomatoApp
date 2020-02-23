package com.example.zomatoapp.eventbus;

import com.example.zomatoapp.dataModel.SearchModel;

public class OnSearchSuccessEvent {
    private SearchModel searchModel;

    public OnSearchSuccessEvent(SearchModel searchModel) {
        this.searchModel = searchModel;
    }

    public SearchModel getSearchModel() {
        return searchModel;
    }
}
