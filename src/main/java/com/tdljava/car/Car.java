package com.tdljava.car;

public class Car {

    //Member Variables...
    private String brand;
    private String model;

    private String color;

    private String type;


    //CONSTRUCTOR
    public Car(String brand, String model, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    //GETTER AND SETTER
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString() method....
    @Override
    public String toString() {
        return "Car Details = {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
