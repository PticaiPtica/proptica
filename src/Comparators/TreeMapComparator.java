package Comparators;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparator {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>();


        map.put(new Student("Dmitriq", 22), 10);
        map.put(new Student("Elena", 32), 10);
        map.put(new Student("Anna", 24), 10);
        map.put(new Student("Boris", 21), 10);

        System.out.println("natural map " + map);

        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
         Map<Student, Integer> studentAgeMap = new TreeMap<>(studentAgeComparator);

         studentAgeMap.put(new Student("Dmitriq", 22), 10);
         studentAgeMap.put(new Student("Elena", 32), 10);
         studentAgeMap.put(new Student("Anna", 24), 10);
         studentAgeMap.put(new Student("Boris", 21), 10);

         System.out.println("mapAge " + studentAgeMap);

    }
}
