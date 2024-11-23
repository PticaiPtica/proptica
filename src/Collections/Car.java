package Collections;

import java.time.LocalDate;
import java.util.Comparator;

public class Car {
    //Состояние
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String getInfo() {
        return model + " " + year;
    }

    public int compareTo(Car car) {

        return Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear)
                .compare(this, car);
    }
}
