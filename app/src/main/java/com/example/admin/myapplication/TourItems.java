package com.example.admin.myapplication;

/**
 * Created by Admin on 7/18/2017.
 */

public class TourItems  {

    private String title;
    private String eventDesc;
    private String location;
    private String image;

    public TourItems(String title, String eventDesc, String location, String image) {
        this.title = title;
        this.eventDesc = eventDesc;
        this.location = location;
        this.image = image;
    }

    public TourItems(String title, String location, String eventDesc) {
        this.title = title;
        this.location = location;
        this.eventDesc = eventDesc;
    }

    public TourItems(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
