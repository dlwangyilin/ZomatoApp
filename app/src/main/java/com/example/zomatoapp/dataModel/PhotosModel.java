package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

public class PhotosModel {
    @SerializedName("photo")
    private PhotoModel photo;

    public PhotoModel getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoModel photo) {
        this.photo = photo;
    }

    public static class PhotoModel {

        @SerializedName("id")
        private String id;
        @SerializedName("url")
        private String url;
        @SerializedName("thumb_url")
        private String thumbUrl;
        @SerializedName("user")
        private PhotoModel.UserModel user;
        @SerializedName("res_id")
        private int resId;
        @SerializedName("caption")
        private String caption;
        @SerializedName("timestamp")
        private int timestamp;
        @SerializedName("friendly_time")
        private String friendlyTime;
        @SerializedName("width")
        private int width;
        @SerializedName("height")
        private int height;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public PhotoModel.UserModel getUser() {
            return user;
        }

        public void setUser(PhotoModel.UserModel user) {
            this.user = user;
        }

        public int getResId() {
            return resId;
        }

        public void setResId(int resId) {
            this.resId = resId;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getFriendlyTime() {
            return friendlyTime;
        }

        public void setFriendlyTime(String friendlyTime) {
            this.friendlyTime = friendlyTime;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public static class UserModel {
            @SerializedName("name")
            private String name;
            @SerializedName("zomato_handle")
            private String zomatoHandle;
            @SerializedName("foodie_level")
            private String foodieLevel;
            @SerializedName("foodie_level_num")
            private int foodieLevelNum;
            @SerializedName("foodie_color")
            private String foodieColor;
            @SerializedName("profile_url")
            private String profileUrl;
            @SerializedName("profile_image")
            private String profileImage;
            @SerializedName("profile_deeplink")
            private String profileDeeplink;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getZomatoHandle() {
                return zomatoHandle;
            }

            public void setZomatoHandle(String zomatoHandle) {
                this.zomatoHandle = zomatoHandle;
            }

            public String getFoodieLevel() {
                return foodieLevel;
            }

            public void setFoodieLevel(String foodieLevel) {
                this.foodieLevel = foodieLevel;
            }

            public int getFoodieLevelNum() {
                return foodieLevelNum;
            }

            public void setFoodieLevelNum(int foodieLevelNum) {
                this.foodieLevelNum = foodieLevelNum;
            }

            public String getFoodieColor() {
                return foodieColor;
            }

            public void setFoodieColor(String foodieColor) {
                this.foodieColor = foodieColor;
            }

            public String getProfileUrl() {
                return profileUrl;
            }

            public void setProfileUrl(String profileUrl) {
                this.profileUrl = profileUrl;
            }

            public String getProfileImage() {
                return profileImage;
            }

            public void setProfileImage(String profileImage) {
                this.profileImage = profileImage;
            }

            public String getProfileDeeplink() {
                return profileDeeplink;
            }

            public void setProfileDeeplink(String profileDeeplink) {
                this.profileDeeplink = profileDeeplink;
            }
        }
    }
}
