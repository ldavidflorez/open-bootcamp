package com.openbootcamptest;

public class Strings {
    public static void main(String[] args) {
        String text = " I am a random text ";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());

        String otherText = "I am a random text";

        if (otherText.equals(text)) {
            System.out.println("Equal");
        } else {
            System.out.println("No equal");
        }
    }
}
