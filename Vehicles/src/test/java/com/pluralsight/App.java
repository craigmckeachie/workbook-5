package com.pluralsight;

public class App {

    public static void main(String[] args) {
        //Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setColor("black");
        System.out.println(vehicle.getColor());

        //Moped
        Moped moped = new Moped();
        moped.setColor("blue");
        System.out.println(moped.getColor());

        moped.storeHelment();
        System.out.println(moped.hasHelmetStorage());

    }
}
