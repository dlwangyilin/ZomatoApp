package com.example.zomatoapp.viewModel;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

public class CollectionItemViewModel {
    public ObservableField<String> collectionTitle = new ObservableField<>();

    public ObservableField<String> imageUrl = new ObservableField<>();

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
