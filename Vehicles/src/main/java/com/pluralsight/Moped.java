package com.pluralsight;

public class Moped extends Vehicle{
    private boolean hasHelmetStorage;

    public boolean hasHelmetStorage() {
        return hasHelmetStorage;
    }

    public void storeHelment() {
        this.hasHelmetStorage = true;
    }
}
