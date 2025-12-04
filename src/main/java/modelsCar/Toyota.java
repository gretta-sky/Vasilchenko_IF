package modelsCar;


public class Toyota extends Car {
    private boolean hasHybridEngine;

    public Toyota(String model, int year, String color, boolean isAutomatic, double price, boolean hasHybridEngine) {
        super("Toyota", model, year, color, isAutomatic, price);
        this.hasHybridEngine = hasHybridEngine;
    }
    public boolean hasHybridEngine() { return hasHybridEngine; }
}