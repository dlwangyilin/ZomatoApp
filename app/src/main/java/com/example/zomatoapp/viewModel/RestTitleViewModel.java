package com.example.zomatoapp.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RestTitleViewModel extends ViewModel {

    public MutableLiveData<String> restName = new MutableLiveData<>();

    public MutableLiveData<String> restDescrip = new MutableLiveData<>();

    public MutableLiveData<String> restAddress = new MutableLiveData<>();

    public MutableLiveData<String> restState = new MutableLiveData<>();

    public MutableLiveData<String> restRating = new MutableLiveData<>();

    public MutableLiveData<String> restReviewCount = new MutableLiveData<>();
}
