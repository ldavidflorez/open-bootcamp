package com.openbootcamptest;

public class Functions {
    public static void main(String[] args) {
        String name = "Luis D";
        String result = helloPerson(name);
        System.out.println(result);

        int a = 5;
        int b = 3;
        int sum = addTwoNumbers(a, b);
        System.out.println("The final result is" + " " + sum);

        float c = 5.0f;
        float d = 3.0f;
        float res = addTwoNumbers(c, d);
        System.out.println("The float result (after overload the function) is" + " " + res);
    }

    // only run into the SAME class
    private static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // overload
    private static float addTwoNumbers(float a, float b) {
        return a + b;
    }

    // run from into the SAME and EXTERNAL class
    public static String helloPerson(String name) {
        return "Hello" + " " + name;
    }

    // run into files from the SAME PACKAGE
    protected static void printSome() {
        System.out.println("I am printing some...");
    }
}
