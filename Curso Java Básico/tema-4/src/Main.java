public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Motorola", "g20", "Android", 8);
        SmartWatch smartWatch = new SmartWatch("Samsung", "y20", 9.0, 150.0, true, false);

        System.out.println(smartPhone);
        System.out.println();
        System.out.println(smartWatch);
    }
}
