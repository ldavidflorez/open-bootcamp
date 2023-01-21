import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // reverse a string
        String txt = "Hello world!";
        String newTxt = reverse(txt);
        System.out.println("Original text: " + txt);
        System.out.println("Reverse text: " + newTxt);
        System.out.println();

        // exercise 1
        printStringArray();
        System.out.println();

        // exercise 2
        printBidArray();
        System.out.println();

        // exercise 3
        vectors();
        System.out.println();

        // exercise 5
        iterateOverLists();
        System.out.println();

        // exercise 6
        deletePairs();
        System.out.println();

        // exercise 7
        try {
            int result = divideByZero(10, 0);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println();
        }

        // exercise 8
        String inPath = "/home/luisf/Desktop/open-bootcamp/Curso Java Básico/tema-7 8 9 10/src/in.txt";
        String outPath = "/home/luisf/Desktop/open-bootcamp/Curso Java Básico/tema-7 8 9 10/src/out.txt";
        copyContent(inPath, outPath);
        System.out.println();

        // exercise 9
        inPath = "/home/luisf/Desktop/open-bootcamp/Curso Java Básico/tema-7 8 9 10/src/in.txt";
        outPath = "/home/luisf/Desktop/open-bootcamp/Curso Java Básico/tema-7 8 9 10/src/out.txt";
        String sep = "\t";
        transformFile(inPath, outPath, sep);
        System.out.println();
    }

    // function to reverse a string
    public static String reverse(String txt) {
        StringBuilder newTxt = new StringBuilder();
        for (int i = txt.length(); i > 0; i--) {
            newTxt.append(txt.charAt(i - 1));
        }
        return newTxt.toString();
    }

    // exercise 1
    public static void printStringArray() {
        String[] arr = {"Hello", "world", "!"};
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // exercise 2
    public static void printBidArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }

    // exercise 3
    public static void vectors() {
        Vector<String> vec = new Vector<>();

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        vec.add("Bird");

        vec.remove(1);
        vec.remove(1);

        System.out.println(vec);
    }

    // exercise 5
    public static void iterateOverLists() {
        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Tiger");
        l1.add("Lion");
        l1.add("Dog");
        l1.add("Elephant");

        LinkedList<String> l2 = new LinkedList<>(l1);

        System.out.println("For l1:");
        for (String l : l1) {
            System.out.println(l);
        }

        System.out.println("For l2:");
        for (String l : l2) {
            System.out.println(l);
        }
    }

    // exercise 6
    public static void deletePairs() {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> filterArr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }

        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                filterArr.add(integer);
            }
        }

        System.out.println(filterArr);
    }

    // exercise 7
    public static int divideByZero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // exercise 8
    public static void copyContent(String inPath, String outPath) {
        try {
            InputStream in = new FileInputStream(inPath);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(outPath);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // exercise 9
    public static void transformFile(String inPath, String outPath, String sep) {
        try {
            InputStream in = new FileInputStream(inPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            String line;
            HashMap<String, String> data = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                data.put(parts[0], parts[1]);
            }

            in.close();
            reader.close();

            PrintStream out = new PrintStream(outPath);

            String newline;
            for (String k : data.keySet()) {
                newline = k + sep + data.get(k) + "\n";
                out.write(newline.getBytes());
            }

            out.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
