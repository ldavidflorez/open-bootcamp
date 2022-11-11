public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4);
        int totalDoors = myCar.addDoor();
        System.out.println("My car has " + totalDoors + " doors");
    }
}
