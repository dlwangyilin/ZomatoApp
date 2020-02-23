package com.example.zomatoapp.viewModel;

import android.app.Application;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.zomatoapp.dataModel.LocationModel;
import com.example.zomatoapp.helper.ZomatoDataHelper;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class RestActivityViewModel extends AndroidViewModel {
    private ZomatoDataHelper zomatoDataHelper;

    public MutableLiveData<String> restImageUrl = new MutableLiveData<>();
    public MutableLiveData<LocationModel> location = new MutableLiveData<>();
    public RestTitleViewModel titleViewModel;
    public RestMenuViewModel menuViewModel;
    public RestDetailViewModel detailViewModel;

    public RestActivityViewModel(@NonNull Application application) {
        super(application);
        zomatoDataHelper = new ZomatoDataHelper(application);
    }

    public void retrieveSpecRestaurantInfo(int id) {
        zomatoDataHelper.retrieveRestaurant(id);
    }

    @BindingAdapter({"restImageUrl"})
    public static void loadRestImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
