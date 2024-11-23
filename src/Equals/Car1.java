package Equals;

import java.time.LocalDate;
import java.util.Objects;

public class Car1 {
    //Состояние
    private String model;
    private Integer year;
    //private String color;

    public Car1(String model, Integer year) {
        this.model = model;
        this.year = year;
        //this.color = color;
    }


    private String getInfo() {
        return model + " " + year + " ";
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        //return year.equals(car1.year) && model.equals(car1.model);
        return Objects.equals(year, car1.year) && Objects.equals(model, car1.model);

    }*/

    @Override
    public boolean equals(Object otherCar) {
        if (this == otherCar) return true;
        if (otherCar == null || getClass() != otherCar.getClass()) return false;
        Car1 car1 = (Car1) otherCar;
        return Objects.equals(model, car1.model) && Objects.equals(year, car1.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
