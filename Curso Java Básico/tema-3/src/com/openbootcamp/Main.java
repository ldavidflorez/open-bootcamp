package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        String[] names = {"name 1", "name 2", "name 3"};
        StringBuilder result = new StringBuilder();
        for (String name: names) {
            result.append(" ").append(name);
        }
        System.out.println("result:" + " " + result);
    }
}
