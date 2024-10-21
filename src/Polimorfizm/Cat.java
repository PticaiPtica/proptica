package Polimorfizm;

public class Cat extends Animal {
    static String sound = "Мяу";

    public Cat(String name, String eat) {
        super(name, eat);
    }

    public void makeSound() {
        System.out.println(getName() + " издает звук " + sound);
    }

    public void eat() {
        System.out.println(getName() + " кушает " + getEat());
    }
}