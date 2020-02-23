package com.example.zomatoapp.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HighlightItemViewModel extends ViewModel {
    public MutableLiveData<String> highlighName = new MutableLiveData<>();
}
