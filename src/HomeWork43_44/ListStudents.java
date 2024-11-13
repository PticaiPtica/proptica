package HomeWork43_44;

import java.util.List;

public class ListStudents {
    public static void main(String[] args) {

        List<String> students = new java.util.ArrayList<>();
        List<String> students2 = new java.util.ArrayList<>();
        students.add("Alex");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Ellie");

        students2.addAll(students);

        students2.add(3, "Test1");
        students2.add(2, "Test2");
        System.out.println(students);
        System.out.println(students2);

        students2.remove("Test1");
        System.out.println(students2);
        students2.remove(2);
        System.out.println(students2);
        System.out.println(students2.contains("Test2"));
        System.out.println(students2.contains("David"));

        List<String> testStudents = new java.util.ArrayList<>();

        testStudents.add("Alex");
        testStudents.add("Bob");
        testStudents.add("Charlie");

        System.out.println(testStudents.containsAll(students));
        testStudents.add("David");
        testStudents.add("Ellie");

        System.out.println(testStudents.containsAll(students));

        System.out.println(testStudents.size());
        System.out.println(testStudents.isEmpty());

        testStudents.clear();
        System.out.println(testStudents.isEmpty());
    }
}
