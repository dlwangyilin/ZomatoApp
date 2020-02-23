package com.example.zomatoapp.eventbus;

import com.example.zomatoapp.dataModel.CityModel;

public class OnCitySuccessEvent {
    private CityModel cityModel;

    public OnCitySuccessEvent(CityModel cityModel) {
        this.cityModel = cityModel;
    }

    public CityModel getCityModel() {
        return cityModel;
    }
}
