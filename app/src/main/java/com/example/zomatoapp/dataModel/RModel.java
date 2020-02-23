package com.example.zomatoapp.dataModel;

import com.google.gson.annotations.SerializedName;

public class RModel {
    /**
     * has_menu_status : {"delivery":-1,"takeaway":-1}
     * res_id : 16774318
     */

    @SerializedName("has_menu_status")
    private HasMenuStatusModel hasMenuStatus;
    @SerializedName("res_id")
    private int resId;

    public HasMenuStatusModel getHasMenuStatus() {
        return hasMenuStatus;
    }

    public void setHasMenuStatus(HasMenuStatusModel hasMenuStatus) {
        this.hasMenuStatus = hasMenuStatus;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public static class HasMenuStatusModel {
        /**
         * delivery : -1
         * takeaway : -1
         */

        @SerializedName("delivery")
        private int delivery;
        @SerializedName("takeaway")
        private int takeaway;

        public int getDelivery() {
            return delivery;
        }

        public void setDelivery(int delivery) {
            this.delivery = delivery;
        }

        public int getTakeaway() {
            return takeaway;
        }

        public void setTakeaway(int takeaway) {
            this.takeaway = takeaway;
        }
    }
}
