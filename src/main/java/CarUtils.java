
import java.util.List;
import modelsCar.Car;

public class CarUtils {
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

    public static void printCarsByYear(List<Car> cars, int targetYear, boolean newer) {
        System.out.println("=== Автомобили " + (newer ? "после " : "до ") + targetYear + " года ===");
        for (Car car : cars) {
            if ((newer && car.getYear() > targetYear) ||
                    (!newer && car.getYear() < targetYear)) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println(car.getBrand() + " " + car.getYear() + " - не подходит");
            }
        }
        System.out.println();
    }
    public static void changeColor(List<Car> cars, String oldColor, String newColor) {
        System.out.println("=== Изменение цвета " + oldColor + " на " + newColor + " ===");
        boolean changed = false;
        for (Car car : cars) {
            if (oldColor.equals(car.getColor())) {
                System.out.println("Было: " + car.getFullInfo());
                car.changeColor(newColor);
                System.out.println("Стало: " + car.getFullInfo());
                changed = true;
            }
        }
        if (!changed) {
            System.out.println("Авто цвета '" + oldColor + "' не найдено");
        }
        System.out.println();
    }
}
