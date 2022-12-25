package com.openbootcamptest;

public class Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        int[] numbers = new int[]{1, 2, 3};
        Car[] cars = new Car[2];

        names[0] = "Luis";
        names[1] = "Juan";
        names[2] = "David";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
