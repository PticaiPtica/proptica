package HomeWork43_44;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class LinkedList {
    static int countE = 1_000_000;

    static int randomCount = 100_000;

    public static void main(String[] args) {
        List<Integer> linkedList = new java.util.LinkedList<>();
        List<Integer> arrayList = new java.util.ArrayList<>();
        System.out.println(randomResult(linkedList, arrayList));
    }
    public static String randomResult(List<Integer> list1, List<Integer> list2) {
        Random rand = new Random();
        LocalTime startTime1 = LocalTime.now();
        for (int i = 0; i < randomCount; i++) {
            int randomNum = rand.nextInt(list1.size());
            Integer i1 = list1.get(randomNum);
        }
        LocalTime endTime1 = LocalTime.now();

        Duration time1 = Duration.between(startTime1, endTime1);

        LocalTime startTime2 = LocalTime.now();

        for (int i = 0; i < randomCount; i++) {
            int randomNum = rand.nextInt(list2.size());
            Integer i1 = list2.get(randomNum);
        }
        LocalTime endTime2 = LocalTime.now();

        Duration time2 = Duration.between(startTime2, endTime2);


        if (time2.toMillis() > time1.toMillis()) {
            return "Выборка наугад дольше " + "linkedList";
        } else {
            return "Выборка наугад дольше " + "arrayList";
        }

    }
}
