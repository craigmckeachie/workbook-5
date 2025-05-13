package com.pluralsight;


import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @org.junit.jupiter.api.Test
    void getColor() {
        //arrange
        Vehicle vehicle = new Vehicle();

        vehicle.setColor("black");
        //act
        String color = vehicle.getColor();
        //assert
        assertEquals(color, "black");


    }

    @org.junit.jupiter.api.Test
    void setColor() {
    }
}