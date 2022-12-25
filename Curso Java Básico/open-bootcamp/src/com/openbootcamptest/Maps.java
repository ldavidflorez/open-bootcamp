package com.openbootcamptest;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<>();

        persons.put(1036964594, "Luis F.");
        persons.put(121519542, "Luis Junior");
        persons.put(43717366, "Leela");

        System.out.println(persons);
        System.out.println(persons.get(1036964594));

        System.out.println();

        for (Integer key :
                persons.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        for (String value :
                persons.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry<Integer, String> pair :
                persons.entrySet()) {
            System.out.println(pair.getKey() + " --> " + pair.getValue());
        }
    }
}
