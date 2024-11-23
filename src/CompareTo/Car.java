package CompareTo;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String model;
    private Integer year;
    private String color;

    public Car() {
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "модель ='" + model + '\'' +
                ", год =" + year +
                ", цвет ='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(year, car.year) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color);
    }

    @Override
    public int compareTo(Car o) {
        int sortModel = this.model.compareTo(o.model);

        int sortYear = this.year.compareTo(o.year);
        sortYear = -sortYear;

        int sortColor = this.color.compareTo(o.color);

        if (sortModel != 0) {
            return sortModel;
        }
        if (sortYear != 0) {
            return sortYear;
        }
        return sortColor;
    }
}


