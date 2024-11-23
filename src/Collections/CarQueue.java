package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CarQueue {
    public static void main(String[] args) {
        Queue<Car> carQueue = new PriorityQueue<>();

        carQueue.offer(new Car("BMW", 40));
        carQueue.offer(new Car("Audi", 30));
        carQueue.offer(new Car("Mercedes", 20));
        carQueue.offer(new Car("Honda", 10));
        carQueue.offer(new Car("Audi", 30));

        System.out.println(carQueue.poll());
        System.out.println(carQueue.poll());
        System.out.println(carQueue.poll());
        System.out.println(carQueue.poll());
        System.out.println(carQueue.poll());



    }
}
