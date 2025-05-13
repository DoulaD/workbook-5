package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("black");
        System.out.println(vehicle.getColor());

        Moped moped = new Moped();
        moped.setColor("blue");
        System.out.println(moped.getColor());

        moped.storeHelmet();
        System.out.println(moped.hasHelmetStorage);

        Car car = new Car();
        car.setMakeOfVehicle("Mercedes");

    }

}