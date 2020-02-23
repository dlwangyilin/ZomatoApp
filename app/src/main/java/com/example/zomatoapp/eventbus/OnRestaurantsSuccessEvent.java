package com.example.zomatoapp.eventbus;

import com.example.zomatoapp.dataModel.RestaurantModel;

public class OnRestaurantsSuccessEvent {
    private RestaurantModel restaurantModel;

    public OnRestaurantsSuccessEvent(RestaurantModel restaurantModel) {
        this.restaurantModel = restaurantModel;
    }

    public RestaurantModel getRestaurantModel() {
        return restaurantModel;
    }
}
