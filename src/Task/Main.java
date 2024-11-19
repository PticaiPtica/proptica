package Task;

import Collections.Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task taskBug1 = new Task.Builder().
                name("Задача № 1").
                priority(1).
                category("Bug").
                build();

        Task taskFeature1 = new Task.Builder().
                name("Задача № 2").
                priority(2).
                category("Feature").
                build();

        Task taskDocumentation1 = new Task.Builder().
                name("Задача № 3").
                priority(2).
                category("Documentation").
                build();

        Task taskBug2 = new Task.Builder().
                name("Задача № 4").
                priority(2).
                category("Bug").
                build();

        Task taskFeature2 = new Task.Builder().
                name("Задача № 5").
                priority(3).
                category("Feature").
                build();

        Task taskDocumentation2 = new Task.Builder().
                name("Задача № 6").
                priority(1).
                category("Documentation").
                build();
        Task taskBug3 = new Task.Builder().
                name("Задача № 7").
                priority(2).
                category("Bug").
                build();

        Task taskFeature3 = new Task.Builder().
                name("Задача № 8").
                priority(3).
                category("Feature").
                build();

        Task taskDocumentation3 = new Task.Builder().
                name("Задача № 9").
                priority(1).
                category("Documentation").
                build();

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(taskBug1);
        tasks.add(taskFeature1);
        tasks.add(taskBug2);
        tasks.add(taskFeature2);
        tasks.add(taskDocumentation1);
        tasks.add(taskDocumentation2);
        tasks.add(taskBug3);
        tasks.add(taskFeature3);
        tasks.add(taskDocumentation3);


        for (Task task : tasks) {
            System.out.println(task);

        }
        Collections.sort(tasks);

        System.out.println();

        for (Task task : tasks) {
            System.out.println(task);

        }
    }
}
