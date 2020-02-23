package com.example.zomatoapp.viewModel;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class RestDetailViewModel extends AndroidViewModel {

    public MutableLiveData<String> cuisines = new MutableLiveData<>();
    public MutableLiveData<String> averageCost = new MutableLiveData<>();

    private List<HighlightItemViewModel> highlightItemViewModels = new ArrayList<>();

    public RestDetailViewModel(@NonNull Application application) {
        super(application);
    }

    public List<HighlightItemViewModel> getHighlightItemViewModels() {
        return highlightItemViewModels;
    }

    public void setHighlightItemViewModels(List<HighlightItemViewModel> highlightItemViewModels) {
        this.highlightItemViewModels = highlightItemViewModels;
    }

    public void addHighlightItem(HighlightItemViewModel highlightItemViewModels) {
        this.highlightItemViewModels.add(highlightItemViewModels);
    }
}
