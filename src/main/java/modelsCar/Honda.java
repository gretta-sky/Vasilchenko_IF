package modelsCar;

public class Honda extends Car {
    private boolean hasVTEC;

    public Honda(String model, int year, String color, boolean isAutomatic, double price, boolean hasVTEC) {
        super("Honda", model, year, color, isAutomatic, price);
        this.hasVTEC = hasVTEC;
    }
    public boolean hasVTEC() {return hasVTEC; }
}
