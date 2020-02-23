package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

public class UserRatingModel {
    /**
     * aggregate_rating : 4.4
     * rating_text : Very Good
     * rating_color : 5BA829
     * rating_obj : {"title":{"text":"4.4"},"bg_color":{"type":"lime","tint":"700"}}
     * votes : 567
     */

    @SerializedName("aggregate_rating")
    private String aggregateRating;
    @SerializedName("rating_text")
    private String ratingText;
    @SerializedName("rating_color")
    private String ratingColor;
    @SerializedName("rating_obj")
    private RatingObjModel ratingObj;
    @SerializedName("votes")
    private String votes;

    public String getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public RatingObjModel getRatingObj() {
        return ratingObj;
    }

    public void setRatingObj(RatingObjModel ratingObj) {
        this.ratingObj = ratingObj;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    public static class RatingObjModel {
        /**
         * title : {"text":"4.4"}
         * bg_color : {"type":"lime","tint":"700"}
         */

        @SerializedName("title")
        private RatingObjModel.TitleModel title;
        @SerializedName("bg_color")
        private RatingObjModel.BgColorModel bgColor;

        public RatingObjModel.TitleModel getTitle() {
            return title;
        }

        public void setTitle(RatingObjModel.TitleModel title) {
            this.title = title;
        }

        public RatingObjModel.BgColorModel getBgColor() {
            return bgColor;
        }

        public void setBgColor(RatingObjModel.BgColorModel bgColor) {
            this.bgColor = bgColor;
        }

        public static class TitleModel {
            /**
             * text : 4.4
             */

            @SerializedName("text")
            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }

        public static class BgColorModel {
            /**
             * type : lime
             * tint : 700
             */

            @SerializedName("type")
            private String type;
            @SerializedName("tint")
            private String tint;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTint() {
                return tint;
            }

            public void setTint(String tint) {
                this.tint = tint;
            }
        }
    }
}
