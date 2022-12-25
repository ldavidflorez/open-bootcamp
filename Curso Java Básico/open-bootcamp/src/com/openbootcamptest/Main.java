package com.openbootcamptest;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("black", "ferrari", "f-50", 2100.0, 3.0);
        System.out.println(car);
        car.accelerate(50);
        car.weight = 1950.0;
        car.color = "red";
        System.out.println(car);
        System.out.println();

        ElectricCar electricCar = new ElectricCar("black", "ferrari", "f-50", 2100.0, 3.0, "123-abc");
        System.out.println(electricCar);
        electricCar.accelerate(50);
        System.out.println(electricCar);
        System.out.println();

        // polymorphism
        Car car2 = new ElectricCar();
        if (car2 instanceof Car) {
            System.out.println("Is a normal car");
        }
        if (car2 instanceof ElectricCar) {
            System.out.println("Is a electric car too");
        }
    }
}
