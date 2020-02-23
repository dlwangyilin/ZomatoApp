package com.example.zomatoapp.dataModel;

import java.util.List;

public class CollectionListModel {
    private int hasMore;
    private String shareUrl;
    private String displayText;
    private int hasTotal;
    private boolean userHasAddresses;

    public int getHasMore() {
        return hasMore;
    }

    public void setHasMore(int hasMore) {
        this.hasMore = hasMore;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public int getHasTotal() {
        return hasTotal;
    }

    public void setHasTotal(int hasTotal) {
        this.hasTotal = hasTotal;
    }

    public boolean isUserHasAddresses() {
        return userHasAddresses;
    }

    public void setUserHasAddresses(boolean userHasAddresses) {
        this.userHasAddresses = userHasAddresses;
    }

    private List<Collections> collections;


    public List<Collections> getCollections() {
        return collections;
    }

    public void setCollections(List<Collections> collections) {
        this.collections = collections;
    }

    public static class Collections {
        private CollectionModel collection;

        public CollectionModel getCollection() {
            return collection;
        }

        public void setCollection(CollectionModel collection) {
            this.collection = collection;
        }
    }
}
