package com.example.zomatoapp.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuItemViewModel extends ViewModel {
    public MutableLiveData<String> menuTitle = new MutableLiveData<>();

    public MutableLiveData<String> menuCategory = new MutableLiveData<>();

    public MutableLiveData<String> menuName = new MutableLiveData<>();

    public MutableLiveData<String> menuDescrip = new MutableLiveData<>();
}
