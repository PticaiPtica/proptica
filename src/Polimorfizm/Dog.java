package Polimorfizm;

public class Dog extends Animal implements Pet {
    static String sound = "Гав-гав";

    /**
     * Конструкт принимающий имя животного(Собака) String+
     * то чем животное питается String
     */
    public Dog(String name, String eat) {
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
    public void beFriendly() {
        System.out.println(getName() + " выглядит дружелюбно");

    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с вами");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает");
    }
}
