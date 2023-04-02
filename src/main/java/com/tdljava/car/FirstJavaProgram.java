package com.tdljava.car;

public class FirstJavaProgram {

    public static void main(String[] args) {

        Car mahiCar = new Car("Audi","Q7","Black","SUV");
        System.out.println(mahiCar.toString());

        Car mahanthiCar = new Car("Subaru","Outback",null, null);
        System.out.println(mahanthiCar.toString());
    }

}