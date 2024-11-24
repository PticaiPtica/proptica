package GC;

public class GCexample {
    public static void main(String[] args) throws InterruptedException {
        GarbageDemo[] garbageDemos = new GarbageDemo[20];
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                garbageDemos[i] = new GarbageDemo(i);
            }
            new GarbageDemo(i);

        }
        System.out.println("Объекты созданы");

        System.gc();

        Thread.sleep(1000);
        System.out.println("Завершение");
        System.out.println(garbageDemos);
        System.out.println(garbageDemos);
    }
}
