package com.openbootcamptest;

public class Exception {
    public static void main(String[] args) {
        try {
            int result = 5 / 5;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Kill running processes (close opened resources)...");
        }

        System.out.println("End");
    }
}
