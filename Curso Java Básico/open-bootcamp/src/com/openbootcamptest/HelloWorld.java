package com.openbootcamptest;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }

    public static class Functions {
        public static void main(String[] args) {
            String result = helloWorld();
            System.out.println(result);
        }

        private static String helloWorld() {
            return "Hello world again!!!";
        }
    }
}
