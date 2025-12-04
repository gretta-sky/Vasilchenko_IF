package modelsCar;

public class Nissan extends Car {
    private boolean hasTurbo;

    public Nissan(String model, int year, String color, boolean isAutomatic, double price, boolean hasTurbo) {
        super("Nissan", model, year, color, isAutomatic, price);
        this.hasTurbo = hasTurbo;
    }
    public boolean hasTurbo() { return hasTurbo; }
}
