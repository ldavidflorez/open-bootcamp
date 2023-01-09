public class SmartPhone extends SmartDevice{
    String operatingSystem;
    Integer ram;

    public SmartPhone(String brand, String model, String operatingSystem, Integer ram) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
