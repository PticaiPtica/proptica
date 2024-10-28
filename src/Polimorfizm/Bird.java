package Polimorfizm;

public final class Bird extends Animal {
    static String sound = "Чирик-чирик";
    private final boolean canFly;

    /**
     * Конструкт принимающий имя животного(птицы) String
     * +то чем животное питается String
     * + умеет ли летать boolean
     */
    public Bird(String name, String eat, boolean canFly) {
        super(name, eat);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println(getName() + " Летает");
        } else {
            System.out.println(getName() + " не летает");


        }
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук " + sound);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getEat());
    }
}


