package com.example.zomatoapp.retrofitInterface;

import com.example.zomatoapp.dataModel.RestaurantModel;
import com.example.zomatoapp.dataModel.SearchModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RestaurantApi {

    @GET("{apiVersion}/restaurant")
    Call<RestaurantModel> getRestaurant(
            @Path("apiVersion") String apiVersion,
            @Query("res_id") int restaurantId
    );

    @GET("{apiVersion}/search")
    Call<SearchModel> getSearchResult(
            @Path("apiVersion") String apiVersion,
            @QueryMap Map<String, Object> params
    );
}
