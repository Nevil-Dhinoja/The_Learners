package com.example.learning.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Get_score {
    @SerializedName("get_quiz_score")
    @Expose
    private List<GetQuizScore> getQuizScore;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<GetQuizScore> getGetQuizScore() {
        return getQuizScore;
    }

    public void setGetQuizScore(List<GetQuizScore> getQuizScore) {
        this.getQuizScore = getQuizScore;
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

    public class GetQuizScore {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("user_email")
        @Expose
        private String userEmail;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("total_score")
        @Expose
        private String totalScore;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTotalScore() {
            return totalScore;
        }

        public void setTotalScore(String totalScore) {
            this.totalScore = totalScore;
        }
    }
}
