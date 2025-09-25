package com.example.bmi_project;

public class model {
    int img;
    String Title ,Discription;

    public model(int img, String Title, String Discription) {
        this.img = img;
        this.Title = Title;
        this.Discription = Discription;
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
