package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

public class CollectionModel {
    @SerializedName("collection_id")
    private int collectionId;
    @SerializedName("res_count")
    private int resCount;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("url")
    private String url;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("share_url")
    private String shareUrl;

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getResCount() {
        return resCount;
    }

    public void setResCount(int resCount) {
        this.resCount = resCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }
}
