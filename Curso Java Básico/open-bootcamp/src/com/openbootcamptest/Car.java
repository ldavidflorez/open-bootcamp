package com.openbootcamptest;

public class Car {
    // attributes
    String color;
    String builder;
    String model;
    Double weight;
    Double large;
    Integer speed = 0;

    // constructor
    public Car(String color, String builder, String model, Double weight, Double large) {
        this.color = color;
        this.builder = builder;
        this.model = model;
        this.weight = weight;
        this.large = large;
    }

    public  Car() {
    }

    // methods
    public void accelerate(Integer quantity) {
        this.speed += quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                ", speed=" + speed +
                '}';
    }
}
