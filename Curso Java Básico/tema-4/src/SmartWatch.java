public class SmartWatch extends SmartDevice{
    Double size;
    Double weight;
    Boolean wifi;
    Boolean bluetooth;


    public SmartWatch(String brand, String model, Double size, Double weight, Boolean wifi, Boolean bluetooth) {
        super(brand, model);
        this.size = size;
        this.weight = weight;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "size=" + size +
                ", weight=" + weight +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
