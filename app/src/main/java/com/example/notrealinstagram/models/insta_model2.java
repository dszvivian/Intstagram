package com.example.notrealinstagram.models;

public class insta_model2 {
    int pic;
    String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public insta_model2(int pic , String id) {
        this.pic = pic;
        this.id = id ;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
