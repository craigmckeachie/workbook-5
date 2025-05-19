package com.pluralsight;

public class Burger extends MenuItem {
    private String bunType;

    public Burger() {
        super();
    }

    public Burger(double price, String description, String size, String bunType) {
        super(price, description, size);
        this.bunType = bunType;
    }

    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }
}
