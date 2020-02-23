package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class ReviewsModel {
    @SerializedName("review")
    private List<?> review;

    public List<?> getReview() {
        return review;
    }

    public void setReview(List<?> review) {
        this.review = review;
    }
}
