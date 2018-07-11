package com.digitaldna.supplier.network.beans;


import android.support.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginSupplierBean {
    @Nullable
    @JsonProperty("Title")
    private String mTitle;

    @Nullable
    @JsonProperty("Email")
    private String mEmail;

    @Nullable
    @JsonProperty("ProfilePictureURL")
    private String mProfilePictureURL;

    @Nullable
    @JsonProperty("Ticket")
    private String mTicket;

    @Nullable
    @JsonProperty("CountryID")
    private Integer mCountryID;

    @Nullable
    @JsonProperty("PhoneNumber")
    private String mPhoneNumber;


    @Nullable
    @JsonProperty("isPhoneNumberVerified")
    private Boolean mIsPhoneNumberVerified;

    @Nullable
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(@Nullable String title) {
        mTitle = title;
    }

    @Nullable
    public String getEmail() {
        return mEmail;
    }

    public void setEmail(@Nullable String email) {
        mEmail = email;
    }


    @Nullable
    public String getProfilePictureURL() {
        return mProfilePictureURL;
    }

    public void setProfilePictureURL(@Nullable String pictureURL) {
        mProfilePictureURL = pictureURL;
    }

    @Nullable
    public String getTicket() {
        return mTicket;
    }

    public void setTicket(@Nullable String ticket) {
        mTicket = ticket;
    }

   /* @Nullable
    public Long getLanguage() {
        return mLanguage;
    }

    public void setLanguage(@Nullable Long language) {
        mLanguage = language;
    }*/

    @Nullable
    public Integer getCountryID() {
        return mCountryID;
    }

    @Nullable
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    @Nullable
    public Boolean getIsPhoneNumberVerified() {
        return mIsPhoneNumberVerified;
    }

    public void setIsPhoneNumberVerified(@Nullable Boolean isPhoneNumberVerified) {
        mIsPhoneNumberVerified = isPhoneNumberVerified;
    }
}


