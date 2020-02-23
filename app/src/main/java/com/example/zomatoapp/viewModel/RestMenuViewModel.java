package com.example.zomatoapp.viewModel;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class RestMenuViewModel extends AndroidViewModel {

    private List<MenuItemViewModel> menuList = new ArrayList<>();

    public RestMenuViewModel(@NonNull Application application) {
        super(application);
    }

    public List<MenuItemViewModel> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuItemViewModel> menuList) {
        this.menuList = menuList;
    }

    public void addMenuItem(MenuItemViewModel item) {
        menuList.add(item);
    }
}
