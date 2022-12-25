package com.openbootcamptest;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("name1");
        names.add("name2");
        names.add("name3");

        System.out.println(names);

        System.out.println();

        for (String name :
                names) {
            System.out.println(name);
        }

        List<Car> cars = new ArrayList<>();

        cars.add(new Car());
        cars.add(new Car());

        System.out.println();

        System.out.println(cars);
    }
}
