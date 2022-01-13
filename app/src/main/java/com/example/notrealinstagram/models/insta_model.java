package com.example.notrealinstagram.models;

public class insta_model {

    int profilePic;
    int uploadPic;
    String instaId;
    String place;

    public insta_model(int profilePic, int uploadPic, String instaId, String place) {
        this.profilePic = profilePic;
        this.uploadPic = uploadPic;
        this.instaId = instaId;
        this.place = place;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public int getUploadPic() {
        return uploadPic;
    }

    public void setUploadPic(int uploadPic) {
        this.uploadPic = uploadPic;
    }

    public String getInstaId() {
        return instaId;
    }

    public void setInstaId(String instaId) {
        this.instaId = instaId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
