package modelsCar;

public class Mazda extends Car {
    private boolean hasSkyactiv;
    public Mazda(String model, int year, String color, boolean isAutomatic, double price, boolean hasSkyactiv) {
        super("Mazda", model, year, color, isAutomatic, price);
        this.hasSkyactiv = hasSkyactiv;
    }
    public boolean hasSkyactiv() { return hasSkyactiv; }
}
