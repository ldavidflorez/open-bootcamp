public class CarImpl implements CarCRUDInterface{
    @Override
    public void create() {
        System.out.println("Creating new car");
    }

    @Override
    public void readOne() {
        System.out.println("Reading one car");
    }

    @Override
    public void readAll() {
        System.out.println("Reading all available cars");
    }

    @Override
    public void update() {
        System.out.println("Updating one car");
    }

    @Override
    public void delete() {
        System.out.println("Deleting one car");
    }
}
