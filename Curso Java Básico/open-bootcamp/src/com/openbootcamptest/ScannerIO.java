package com.openbootcamptest;

import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println();

        System.out.println("Introduce a number: ");
        int num = scanner.nextInt();
        System.out.println("The number is: " + num);
    }
}
