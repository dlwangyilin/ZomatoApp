package com.example.zomatoapp.viewModel;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

public class RestaurantItemViewModel {
    public interface OnRestaurantSelectListener {
        void onRestaurantSelect(int id);
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> rating = new ObservableField<>();

    public ObservableField<String> description = new ObservableField<>();

    public ObservableField<String> status = new ObservableField<>();

    public ObservableField<String> location = new ObservableField<>();

    public ObservableField<String> price = new ObservableField<>();

    public ObservableField<String> imageUrl = new ObservableField<>();

    private OnRestaurantSelectListener listener;

    public RestaurantItemViewModel() {

    }

    public void setListener(OnRestaurantSelectListener listener) {
        this.listener = listener;
    }

    @BindingAdapter({"restaurantImageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

    public void onItemSelected(View view) {
        if (listener != null) {
            listener.onRestaurantSelect(id);
        }
    }
}
