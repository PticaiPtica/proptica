package Collections;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListSpeedOperations {

    static int countE = 50_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Arraylist в конец " + addInEnd(arrayList));
        System.out.println("Linkedlist в конец " + addInEnd(linkedList));
        System.out.println("***");

        System.out.println("Arraylist в начало " + addInStart(arrayList));
        System.out.println("Linkedlist в начало " + addInStart(linkedList));
        System.out.println("***");

        System.out.println("Arraylist в середину " + addInMiddle(arrayList));
        System.out.println("Linkedlist в середину " + addInMiddle(linkedList));
        System.out.println("***");

        System.out.println("Arraylist получение с Get " + getByIndex(arrayList));
        System.out.println("Linkedlist получение с Get " + getByIndex(linkedList));
        System.out.println("***");

        System.out.println("Arraylist получение с getByIterator " + getByIterator(arrayList));
        System.out.println("Linkedlist получение с getByIterator " + getByIterator(linkedList));
        System.out.println("***");


    }

    public static long addInEnd(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.add(i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        list.clear();
        return duration;

    }

    public static long addInStart(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.addFirst(i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        list.clear();
        return duration;
    }

    public static long addInMiddle(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.add(i / 2, i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        return duration;
    }

    public static long getByIndex(List<Integer> list) {
        LocalTime startTime = LocalTime.now();

        for (int i = 0; i < countE; i++) {
            list.get(i);
        }

        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        return duration;

    }

    public static long getByIterator(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        LocalTime endTime = LocalTime.now();

        Duration time = Duration.between(startTime, endTime);
        long duration = time.toMillis();
        list.clear();
        return duration;

    }
}