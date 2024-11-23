package OOP;

import java.lang.reflect.Array;

public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Lada");
        car.setYear(2020);
        car.setColor("red");
        car.start();
        car.stop();
        // данные поступают из БД или от клиента (фронтенд или другой сервис)
        //валидация значений
        Car car2 = new Car();
        car2.setModel("UAZ");
        car2.setYear(2015);
        car2.setColor("blue");
        car2.start();
        car2.stop();

        Watch watch = new Watch();
        watch.setHours(25);
        watch.setMinutes(66);
        System.out.println(watch.getTimeInfo());
    }

}