package Polimorfizm;

public class Cat extends Animal implements Pet {
    static String sound = "Мяу";

    /**
     * Конструкт принимающий имя животного(кота) String+
     * то чем животное питается String
     */
    public Cat(String name, String eat) {
        super(name, eat);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " издает звук " + sound);
    }

    public void eat() {
        System.out.println(getName() + " кушает " + getEat());
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " выглядит дружелюбно");

    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с вами");

    }
}