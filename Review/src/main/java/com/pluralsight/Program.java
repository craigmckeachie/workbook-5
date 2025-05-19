package com.pluralsight;

public class Program {

    public static void main(String[] args) {

        Burger burger = new Burger();

        burger.setPrice(10);
        Double price = burger.getPrice();
        System.out.println(price);

        burger.setDescription("Bacon Cheeseburger");
        String description = burger.getDescription();
        System.out.println(description);

        burger.setSize("Large");

        String size = burger.getSize();
        System.out.println(size);
        //OR
        System.out.println(burger.getSize());


        burger.setBunType("Sesame");
        String bunType = burger.getBunType();
        System.out.println(bunType);

//        MenuItem item = new MenuItem()

         Burger burger1 = new Burger(10, "Pretzel Bun Burger", "L", "Sesame");






    }
}
