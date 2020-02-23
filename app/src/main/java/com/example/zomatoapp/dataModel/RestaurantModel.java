package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestaurantModel {
    @SerializedName("R")
    private RModel R;

    @SerializedName("apikey")
    private String apikey;

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("url")
    private String url;

    @SerializedName("location")
    private LocationModel location;

    @SerializedName("switch_to_order_menu")
    private int switchToOrderMenu;

    @SerializedName("cuisines")
    private String cuisines;

    @SerializedName("timings")
    private String timings;

    @SerializedName("average_cost_for_two")
    private int averageCostForTwo;

    @SerializedName("price_range")
    private int priceRange;

    @SerializedName("currency")
    private String currency;

    @SerializedName("opentable_support")
    private int opentableSupport;

    @SerializedName("is_zomato_book_res")
    private int isZomatoBookRes;

    @SerializedName("mezzo_provider")
    private String mezzoProvider;

    @SerializedName("is_book_form_web_view")
    private int isBookFormWebView;

    @SerializedName("book_form_web_view_url")
    private String bookFormWebViewUrl;

    @SerializedName("book_again_url")
    private String bookAgainUrl;

    @SerializedName("thumb")
    private String thumb;

    @SerializedName("user_rating")
    private UserRatingModel userRating;

    @SerializedName("all_reviews_count")
    private int allReviewsCount;

    @SerializedName("photos_url")
    private String photosUrl;

    @SerializedName("photo_count")
    private int photoCount;

    @SerializedName("menu_url")
    private String menuUrl;

    @SerializedName("featured_image")
    private String featuredImage;

    @SerializedName("has_online_delivery")
    private int hasOnlineDelivery;

    @SerializedName("is_delivering_now")
    private int isDeliveringNow;

    @SerializedName("include_bogo_offers")
    private boolean includeBogoOffers;

    @SerializedName("deeplink")
    private String deeplink;

    @SerializedName("is_table_reservation_supported")
    private int isTableReservationSupported;

    @SerializedName("has_table_booking")
    private int hasTableBooking;

    @SerializedName("events_url")
    private String eventsUrl;

    @SerializedName("phone_numbers")
    private String phoneNumbers;

    @SerializedName("all_reviews")
    private AllReviewsModel allReviews;

    @SerializedName("highlights")
    private List<String> highlights;

    @SerializedName("offers")
    private List<?> offers;

    @SerializedName("photos")
    private List<PhotosModel> photos;

    @SerializedName("establishment")
    private List<String> establishment;

    public RModel getR() {
        return R;
    }

    public void setR(RModel R) {
        this.R = R;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public int getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    public void setSwitchToOrderMenu(int switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public int getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(int averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getOpentableSupport() {
        return opentableSupport;
    }

    public void setOpentableSupport(int opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    public int getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    public void setIsZomatoBookRes(int isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
    }

    public String getMezzoProvider() {
        return mezzoProvider;
    }

    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    public int getIsBookFormWebView() {
        return isBookFormWebView;
    }

    public void setIsBookFormWebView(int isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
    }

    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public UserRatingModel getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRatingModel userRating) {
        this.userRating = userRating;
    }

    public int getAllReviewsCount() {
        return allReviewsCount;
    }

    public void setAllReviewsCount(int allReviewsCount) {
        this.allReviewsCount = allReviewsCount;
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public int getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(int photoCount) {
        this.photoCount = photoCount;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public int getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(int hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public int getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(int isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public boolean isIncludeBogoOffers() {
        return includeBogoOffers;
    }

    public void setIncludeBogoOffers(boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public int getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    public void setIsTableReservationSupported(int isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    public int getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(int hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public AllReviewsModel getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(AllReviewsModel allReviews) {
        this.allReviews = allReviews;
    }

    public List<String> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<String> highlights) {
        this.highlights = highlights;
    }

    public List<?> getOffers() {
        return offers;
    }

    public void setOffers(List<?> offers) {
        this.offers = offers;
    }

    public List<PhotosModel> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosModel> photos) {
        this.photos = photos;
    }

    public List<String> getEstablishment() {
        return establishment;
    }

    public void setEstablishment(List<String> establishment) {
        this.establishment = establishment;
    }
}