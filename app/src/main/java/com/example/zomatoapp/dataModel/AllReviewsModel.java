package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllReviewsModel {
    @SerializedName("reviews")
    private List<ReviewsModel> reviews;

    public List<ReviewsModel> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewsModel> reviews) {
        this.reviews = reviews;
    }

    public static class ReviewsModel {
        @SerializedName("review")
        private List<String> review;

        public List<String> getReview() {
            return review;
        }

        public void setReview(List<String> review) {
            this.review = review;
        }
    }
}
