
//public class Main {
    //it`s Main origin
//}
import java.util.List;
import java.util.ArrayList;

abstract class Car {
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
        return String.format("%s %s %dy. %s %s %.2fR",
                brand, model, year, color, isAutomatic ? "автомат" : "механика", price);
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public int getYear() { return year; }
    public String getColor() { return color;}
    public String getBrand() { return brand; }
    public boolean isAutomatic() { return isAutomatic; }
}

class Toyota extends Car {
    private boolean hasHybridEngine;

    public Toyota(String model, int year, String color, boolean isAutomatic, double price, boolean hasHybridEngine) {
        super("Toyota", model, year, color, isAutomatic, price);
        this.hasHybridEngine = hasHybridEngine;
    }
    public boolean hasHybridEngine() { return hasHybridEngine; }
}

class Suzuki extends Car {
    private boolean isAllWheelDrive;

    public Suzuki(String model, int year, String color, boolean isAutomatic, double price, boolean isAllWheelDrive) {
        super("Suzuki", model, year, color, isAutomatic, price);
        this.isAllWheelDrive = isAllWheelDrive;
    }
    public boolean isAllWheelDrive() { return isAllWheelDrive; }
}

class Honda extends Car {
    private boolean hasVTEC;

    public Honda(String model, int year, String color, boolean isAutomatic, double price, boolean hasVTEC) {
        super("Honda", model, year, color, isAutomatic, price);
        this.hasVTEC = hasVTEC;
    }
    public boolean hasVTEC() {return hasVTEC; }
}
class Nissan extends Car {
    private boolean hasTurbo;

    public Nissan(String model, int year, String color, boolean isAutomatic, double price, boolean hasTurbo) {
        super("Nissan", model, year, color, isAutomatic, price);
        this.hasTurbo = hasTurbo;
    }
    public boolean hasTurbo() { return hasTurbo; }
}

class Mazda extends Car {
    private boolean hasSkyactiv;
    public Mazda(String model, int year, String color, boolean isAutomatic, double price, boolean hasSkyactiv) {
        super("Mazda", model, year, color, isAutomatic, price);
        this.hasSkyactiv = hasSkyactiv;
    }
    public boolean hasSkyactiv() { return hasSkyactiv; }
}

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Toyota("Camry", 2020, "черный", true, 2500000, true));
        cars.add(new Suzuki("Vitara", 2018, "зеленый", true, 2000000, true));
        cars.add(new Honda("Civic", 2005, "синий", false, 800000, true));
        cars.add(new Nissan("Qashqai", 2015, "зеленый", true, 1800000, false));
        cars.add(new Mazda("CX-5", 2022, "красный", true, 2800000, true));
        cars.add(new Toyota("Corolla", 2010, "белый", false, 1200000, false));
        cars.add(new Suzuki("Swift", 2007, "зеленый", false, 900000, false));
        cars.add(new Honda("Accord", 2021, "серый", true, 3000000, false));
        cars.add(new Nissan("X-Trail", 2004, "желтый", true, 700000, false));
        cars.add(new Mazda("3", 2019, "синий", true, 2200000, true));

        printCarsAfter2006(cars);
        changeGreenToRed(cars);
        printAutomaticCars(cars);
    }

    public static void printCarsAfter2006(List<Car> cars) {System.out.println("=== Автомобили после 2006 года ===");
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println(car.getBrand() + " " + car.getYear() + " устаревший авто");
            }
        }
        System.out.println();
    }

    public static void changeGreenToRed(List<Car> cars) {
        System.out.println(" Изменение зеленого цвета на красный ");
        for (Car car : cars) {
            if ("зеленый".equals(car.getColor())) {
                System.out.println("Было: " + car.getFullInfo());
                car.changeColor("красный");
                System.out.println("Стало: " + car.getFullInfo());
            }
        }
        System.out.println();
    }
    public static void printAutomaticCars(List<Car> cars) {
        System.out.println(" Автомобили с автоматической коробкой ");
        for (Car car : cars) {
            if (car.isAutomatic()) {
                System.out.println(car.getFullInfo());
            }
        }
    }
}
