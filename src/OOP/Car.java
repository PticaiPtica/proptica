package OOP;

import java.time.LocalDate;

public class Car {
    //Состояние
    private String model;
    private int year;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year <= LocalDate.now().getYear()) {
            this.year = year;
        } else {
            this.year = -1;
            System.out.println("Year out of range");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start() {
        // Логика для управления двигателем.
        // Логика для отображения машины на карте, изменения ее статуса, уведомления клиента.
        // Пока просто выводим о том что метод выполняется.
        System.out.println("Car is started " + getInfo());
    }

    public void stop() {
        System.out.println("Car is stopped " + getInfo());
    }

    private String getInfo() {
        return model + " " + year + " " + color;
    }

}
