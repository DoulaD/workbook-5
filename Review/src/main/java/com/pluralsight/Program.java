package com.pluralsight;

import java.awt.*;

public class Program {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.setPrice(10);
        System.out.println(burger.getPrice());


        burger.setDescription("Smash Burger");
        String description = burger.getDescription();
        System.out.println(description);

        burger.setSize("Large");
        System.out.println(burger.getSize());

        System.out.println(burger.getBunType());

        Burger burger1 = new Burger(10,"Pretzal Bun Burger","Large" );

    }



}
