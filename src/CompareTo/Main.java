package CompareTo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Lada", 2024, "Black"));
        listCar.add(new Car("Lada", 2024, "White"));
        listCar.add(new Car("Lada", 2024, "Red"));
        listCar.add(new Car("Lada", 2023, "Gray"));
        listCar.add(new Car("Volga", 2024, "Black"));
        listCar.add(new Car("Volga", 2023, "White"));
        listCar.add(new Car("Volga", 2022, "Red"));
        listCar.add(new Car("Audi", 2020, "Red"));

        for (Car car : listCar) {
            System.out.println(car);
        }
        System.out.println();

        Collections.sort(listCar);

        for (Car car : listCar) {
            System.out.println(car);
        }
    }
}
