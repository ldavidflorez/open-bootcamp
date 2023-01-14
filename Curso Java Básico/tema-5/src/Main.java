public class Main {
    static CarCRUDInterface carCRUD = new CarImpl();

    public static void main(String[] args) {
        carCRUD.create();
        carCRUD.readOne();
        carCRUD.readAll();
        carCRUD.update();
        carCRUD.delete();
    }
}
