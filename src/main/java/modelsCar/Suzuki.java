package modelsCar;

public class Suzuki extends Car {
    private boolean isAllWheelDrive;

    public Suzuki(String model, int year, String color, boolean isAutomatic, double price, boolean isAllWheelDrive) {
        super("Suzuki", model, year, color, isAutomatic, price);
        this.isAllWheelDrive = isAllWheelDrive;
    }
    public boolean isAllWheelDrive() { return isAllWheelDrive; }
}