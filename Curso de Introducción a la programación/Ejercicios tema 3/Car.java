public class Car {
    int doorsNumber;

    public Car(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int addDoor() {
        this.doorsNumber += 1;
        return doorsNumber;
    }
}
