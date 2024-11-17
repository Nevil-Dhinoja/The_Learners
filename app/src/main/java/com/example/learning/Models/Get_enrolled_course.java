package com.example.learning.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class  Get_enrolled_course {

    @SerializedName("get_enroll_course")
    @Expose
    private List<GetEnrollCourse> getEnrollCourse;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<GetEnrollCourse> getGetEnrollCourse() {
        return getEnrollCourse;
    }

    public void setGetEnrollCourse(List<GetEnrollCourse> getEnrollCourse) {
        this.getEnrollCourse = getEnrollCourse;
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
    public class GetEnrollCourse {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("cat_name")
        @Expose
        private String catName;
        @SerializedName("user_email")
        @Expose
        private String userEmail;
        @SerializedName("enrooll_course_id")
        @Expose
        private String enroollCourseId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("level")
        @Expose
        private String level;
        @SerializedName("enroll_status")
        @Expose
        private String enrollStatus;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("status")
        @Expose
        private String status;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCatName() {
            return catName;
        }

        public void setCatName(String catName) {
            this.catName = catName;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getEnroollCourseId() {
            return enroollCourseId;
        }

        public void setEnroollCourseId(String enroollCourseId) {
            this.enroollCourseId = enroollCourseId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getEnrollStatus() {
            return enrollStatus;
        }

        public void setEnrollStatus(String enrollStatus) {
            this.enrollStatus = enrollStatus;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
