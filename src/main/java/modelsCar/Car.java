package modelsCar;

public abstract class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected String color;
    protected boolean isAutomatic;
    protected double price;

    public Car(String brand, String model, int year, String color, boolean isAutomatic, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.price = price;
    }

    public String getFullInfo() {
        return String.format("%s %s %dг. %s %s %.2fR",
                brand, model, year, color, isAutomatic ? "автомат" : "механика", price);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public int getYear() { return year; }
    public String getColor() { return color; }
    public String getBrand() { return brand; }
    public boolean isAutomatic() { return isAutomatic; }
}
