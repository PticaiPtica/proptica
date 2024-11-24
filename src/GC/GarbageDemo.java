package GC;

public class GarbageDemo {
    private int id;

    public GarbageDemo(int id) {
        this.id = id;
        System.out.println("Created GarbageDemo with id: " + id);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Collected object: " + id);
    }
}
