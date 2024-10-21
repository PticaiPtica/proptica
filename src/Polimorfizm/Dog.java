package Polimorfizm;

public class Dog extends Animal {
    static String sound = "Гав-гав";

    public Dog(String name, String eat) {
        super(name, eat);
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук " + sound);
    }

    public void eat() {
        System.out.println(getName() + " кушает " + getEat());

    }
}
