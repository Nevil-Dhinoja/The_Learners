package com.example.learning.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Get_user {
    @SerializedName("get_user")
    @Expose
    private List<GetUser> getUser;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<GetUser> getGetUser() {
        return getUser;
    }

    public void setGetUser(List<GetUser> getUser) {
        this.getUser = getUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public class GetUser {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("user_email")
        @Expose
        private String userEmail;
        @SerializedName("user_device")
        @Expose
        private String userDevice;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserDevice() {
            return userDevice;
        }

        public void setUserDevice(String userDevice) {
            this.userDevice = userDevice;
        }

    }
}
