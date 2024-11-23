package Collections;


import java.util.*;

public class Queues {
    public static void main(String[] args) {

        //Deque<String> names = new LinkedList<>();
        //Deque<String> names = new ArrayDeque<>();
        Queue<String> names = new PriorityQueue<>();


        //stack:
        System.out.println("stack");
/*        names.push("John");
        names.push("Jane");
        names.push("Bob");
        names.push("Alice");
        System.out.println(names);

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());*/

        System.out.println();

        System.out.println("queue");
        names.offer("John");
        names.offer("Jane");
        names.offer("Bob");
        names.offer("Alice");
        System.out.println(names);

        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());


    }
}
