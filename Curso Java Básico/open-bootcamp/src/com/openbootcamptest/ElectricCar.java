package com.openbootcamptest;

public class ElectricCar extends Car {
    String electricMotor;

    public ElectricCar() {
    }

    public ElectricCar(String electricMotor) {
        this.electricMotor = electricMotor;
    }

    public ElectricCar(String color, String builder, String model, Double weight, Double large, String electricMotor) {
        super(color, builder, model, weight, large);
        this.electricMotor = electricMotor;
    }

    @Override
    public void accelerate(Integer quantity) {
        Integer newQuantity = quantity * 2;
        super.accelerate(newQuantity);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "electricMotor='" + electricMotor + '\'' +
                ", color='" + color + '\'' +
                ", builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                ", speed=" + speed +
                '}';
    }
}
