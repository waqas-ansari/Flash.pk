package com.waqasansari.flashpk.model;

/**
 * Created by WaqasAhmed on 12/1/2016.
 */

public class ItemObjects {
    private String name;
    private int photo;

    public ItemObjects(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }
}
