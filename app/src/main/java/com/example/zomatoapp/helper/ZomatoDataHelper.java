package com.example.zomatoapp.helper;

import android.content.Context;
import android.location.Location;

import com.example.zomatoapp.dataModel.CityModel;
import com.example.zomatoapp.dataModel.CollectionListModel;
import com.example.zomatoapp.dataModel.RestaurantModel;
import com.example.zomatoapp.dataModel.SearchModel;
import com.example.zomatoapp.eventbus.OnCitySuccessEvent;
import com.example.zomatoapp.eventbus.OnCollectionsSuccessEvent;
import com.example.zomatoapp.eventbus.OnRestaurantsSuccessEvent;
import com.example.zomatoapp.eventbus.OnSearchSuccessEvent;
import com.example.zomatoapp.network.ApiService;
import com.example.zomatoapp.network.RetrofitApiCallback;
import com.example.zomatoapp.network.RetrofitErrorModel;
import com.example.zomatoapp.utils.StaticValues;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Response;

public class ZomatoDataHelper {
    private static final String TAG = ZomatoDataHelper.class.getName();

    private Context mContext;
    private ApiService apiService;

    public ZomatoDataHelper(Context context) {
        mContext = context;
        apiService = ApiService.getInstance();
    }

    public void retrieveCollection(int cityId) {
        apiService.retrieveCollections(new RetrofitApiCallback<>(
                new RetrofitApiCallback.OnActionHandleListener<CollectionListModel>() {
                    @Override
                    public void onBeforeHandling() {

                    }

                    @Override
                    public void onSuccess(Response<CollectionListModel> response) {
                        CollectionListModel collectionModelList = response.body();
                        EventBus.getDefault().post(new OnCollectionsSuccessEvent(collectionModelList));
                    }

                    @Override
                    public void onError(RetrofitErrorModel errors) {

                    }

                    @Override
                    public void onTechIssueError(Throwable t) {

                    }
                }), cityId);
    }

    public void retrieveRestaurant(int id){
        apiService.retrieveRestaurant(new RetrofitApiCallback<>(
                new RetrofitApiCallback.OnActionHandleListener<RestaurantModel>() {
                    @Override
                    public void onBeforeHandling() {

                    }

                    @Override
                    public void onSuccess(Response<RestaurantModel> response) {
                        RestaurantModel restaurantModel = response.body();
                        EventBus.getDefault().post(new OnRestaurantsSuccessEvent(restaurantModel));
                    }

                    @Override
                    public void onError(RetrofitErrorModel errors) {

                    }

                    @Override
                    public void onTechIssueError(Throwable t) {

                    }
                }), id);
    }

    public void getSearchResult(int cityId, Location location) {
        apiService.retrieveSearchResult(new RetrofitApiCallback<>(
                new RetrofitApiCallback.OnActionHandleListener<SearchModel>() {
                    @Override
                    public void onBeforeHandling() {

                    }

                    @Override
                    public void onSuccess(Response<SearchModel> response) {
                        SearchModel searchModel = response.body();
                        EventBus.getDefault().post(new OnSearchSuccessEvent(searchModel));
                    }

                    @Override
                    public void onError(RetrofitErrorModel errors) {

                    }

                    @Override
                    public void onTechIssueError(Throwable t) {

                    }
                }), getSearchInputParams(cityId, 0, 5, location));
    }

    public void getCityInfo(Location location) {
        apiService.retrieveCityInfo(new RetrofitApiCallback<>(
                new RetrofitApiCallback.OnActionHandleListener<CityModel>() {
                    @Override
                    public void onBeforeHandling() {

                    }

                    @Override
                    public void onSuccess(Response<CityModel> response) {
                        CityModel cityModel = response.body();
                        EventBus.getDefault().post(new OnCitySuccessEvent(cityModel));
                    }

                    @Override
                    public void onError(RetrofitErrorModel errors) {

                    }

                    @Override
                    public void onTechIssueError(Throwable t) {

                    }
                }), getCityInputParams(location));
    }

    private Map<String, Object> getCityInputParams(Location location) {
        Map<String, Object> map = new HashMap<>();
        map.put(StaticValues.CityApiKey.Q_KEY, "");
        map.put(StaticValues.CityApiKey.COUNT_KEY, 1);
        map.put(StaticValues.LocationKey.LAT_KEY, location.getLatitude());
        map.put(StaticValues.LocationKey.LON_KEY, location.getLongitude());

        return map;
    }

    private Map<String, Object> getSearchInputParams(int cityId, int start, int count, Location location) {
        Map<String, Object> map = new HashMap<>();
        map.put(StaticValues.SearchApiKey.ENTITY_ID_KEY, cityId);
        map.put(StaticValues.SearchApiKey.ENTITY_TYPE_KEY, "city");
        map.put(StaticValues.SearchApiKey.Q_KEY, "");
        map.put(StaticValues.SearchApiKey.START_KEY, start);
        map.put(StaticValues.SearchApiKey.COUNT_KEY, count);
        map.put(StaticValues.LocationKey.LAT_KEY, location.getLatitude());
        map.put(StaticValues.LocationKey.LON_KEY, location.getLongitude());
        map.put(StaticValues.SearchApiKey.RADIUS_KEY, 100000);
        map.put(StaticValues.SearchApiKey.CUISINES_KEY, "");
        map.put(StaticValues.SearchApiKey.ESTABLISHMENT_TYPE_KEY, 31);
        map.put(StaticValues.SearchApiKey.COLLECTION_ID_KEY, 1);
        map.put(StaticValues.SearchApiKey.CATEGORY_KEY, 3);
        map.put(StaticValues.SearchApiKey.SORT_KEY, "rating");
        map.put(StaticValues.SearchApiKey.ORDER_KEY, "desc");

        return map;
    }
}
