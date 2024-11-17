package com.example.learning.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Get_course {
    @SerializedName("get_course")
    @Expose
    private List<GetCourse> getCourse;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<GetCourse> getGetCourse() {
        return getCourse;
    }

    public void setGetCourse(List<GetCourse> getCourse) {
        this.getCourse = getCourse;
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.getCourse == null)? 0 :this.getCourse.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Get_course) == false) {
            return false;
        }
        Get_course rhs = ((Get_course) other);
        return ((((this.getCourse == rhs.getCourse)||((this.getCourse!= null)&&this.getCourse.equals(rhs.getCourse)))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }
    public class GetCourse {

        @SerializedName("id")
        @Expose
        private String id;
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

        @Override
        public int hashCode() {
            int result = 1;
            result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
            result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
            result = ((result* 31)+((this.enrollStatus == null)? 0 :this.enrollStatus.hashCode()));
            result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
            result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
            result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
            result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
            return result;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if ((other instanceof GetCourse) == false) {
                return false;
            }
            GetCourse rhs = ((GetCourse) other);
            return ((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.enrollStatus == rhs.enrollStatus)||((this.enrollStatus!= null)&&this.enrollStatus.equals(rhs.enrollStatus))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
        }

    }
}
