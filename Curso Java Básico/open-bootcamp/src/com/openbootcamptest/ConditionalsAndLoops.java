package com.openbootcamptest;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        int check = 10;

        if (check == 1) {
            System.out.println("Is 1");
        } else if (check == 2) {
            System.out.println("Is 2");
        } else {
            System.out.println("Is other value");
        }

        System.out.println();

        switch (check) {
            case 1:
                System.out.println("Check is 1");
                break;
            case 2:
                System.out.println("Check is 2");
                break;
            case 3:
                System.out.println("Check is 3");
                break;
            default:
                System.out.println("Check is other value");
                break;
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("The i value is" + " " + i);
            if (i == 5) {
                break;
            }
        }

        System.out.println();

        while (check > 0) {
            check--;
            if (check == 5) continue;
            System.out.println("Check is" + " " + check);
        }
    }
}

