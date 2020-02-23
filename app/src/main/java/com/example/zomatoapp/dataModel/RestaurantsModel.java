package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

public class RestaurantsModel {

    @SerializedName("restaurant")
    private RestaurantModel restaurant;

    public RestaurantModel getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantModel restaurant) {
        this.restaurant = restaurant;
    }
}
