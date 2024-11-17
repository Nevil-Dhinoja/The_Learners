package com.example.learning.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Get_certificate {
    @SerializedName("get_certificate")
    @Expose
    private List<GetCertificate> getCertificate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<GetCertificate> getGetCertificate() {
        return getCertificate;
    }

    public void setGetCertificate(List<GetCertificate> getCertificate) {
        this.getCertificate = getCertificate;
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

    public class GetCertificate {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("user_email")
        @Expose
        private String userEmail;
        @SerializedName("name")
        @Expose
        private Object name;

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

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }
    }
}
