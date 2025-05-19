package com.pluralsight;

public class Programs {
    public static void main(String[] args) {

        Clothing clothing = new Clothing();
        clothing.setPrice(100);
        System.out.println(clothing.getPrice());

        clothing.setSize("Medium");
        System.out.println(clothing.getSize());
    }

}
