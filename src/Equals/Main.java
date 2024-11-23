package Equals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car1 car1 = new Car1("Lada", 2012);
        Car1 car2 = new Car1("UAZ", 2002);
        Car1 car3 = new Car1("Volga", 2010);


        List<Car1> cars1 = new ArrayList<>();
        cars1.add(car1);
        cars1.add(car2);
        cars1.add(car3);

        Car1 car4 = new Car1("UAZ", 2002);
        System.out.println( cars1.contains(car4));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println(car4.hashCode());
    }
}
