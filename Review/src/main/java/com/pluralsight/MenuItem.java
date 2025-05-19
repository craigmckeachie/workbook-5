package com.pluralsight;

public class MenuItem {
    private double price = 0;
    private String description;
    private String size;

    public MenuItem(){

    }

    public MenuItem(double price, String description, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
