
//public class Main {
    //it`s Main origin
//}

import java.util.*;
import modelsCar.*;

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

        CarUtils.printCarsAfter2006(cars);
        CarUtils.changeGreenToRed(cars);
        CarUtils.printAutomaticCars(cars);

        CarUtils.printCarsByYear(cars, 2015, true);
        CarUtils.printCarsByYear(cars, 2015, false);
        CarUtils.changeColor(cars, "синий", "красный");
    }
}
