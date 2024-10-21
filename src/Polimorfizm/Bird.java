package Polimorfizm;

public class Bird extends Animal {
    static String sound = "Чирик-чирик";
    private boolean canFly;

    public Bird(String name, String eat, boolean canFly) {
        super(name, eat);
        this.canFly = canFly;
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


