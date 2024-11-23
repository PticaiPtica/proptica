package HomeWork43_44;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class ArrayList {
    static int countE = 1_000_000;

    static int randomCount = 100_000;
    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList<>();

        System.out.println("Arraylist в начало " + addInStart(arrayList));
        arrayList.clear();
        System.out.println("Arraylist в конец " + addInEnd(arrayList));

        System.out.println("выбирает из заполненного списка элемент " + randomResult(arrayList));
    }

    public static long addInStart(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.addFirst(i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        return time.toMillis();
    }

    public static long addInEnd(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.add(i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);

        return time.toMillis();

    }
    public static long randomResult(List<Integer> list) {
        Random rand = new Random();
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < randomCount; i++) {
            int randomNum = rand.nextInt(list.size());
            Integer i1 = list.get(randomNum);
            System.out.println("i1: " + i1);
        }
        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);

        return time.toMillis();
    }

}
