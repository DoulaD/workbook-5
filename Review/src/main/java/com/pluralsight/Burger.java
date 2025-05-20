package com.pluralsight;

public class Burger extends MenuItem {

    private String bunType;

    public Burger(double price, String description, String size) {
        super(price, description, size);
    }

    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }


}
