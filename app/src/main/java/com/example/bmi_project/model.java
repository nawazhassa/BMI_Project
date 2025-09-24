package com.example.bmi_project;

public class model {
    int img;
    String Title ,Discription;

    public model(int img, String title, String discription) {
        this.img = img;
        Title = title;
        Discription = discription;
    }

    public int getImg() {
        return img;
    }

    public String getTitle() {
        return Title;
    }

    public String getDiscription() {
        return Discription;
    }
}
