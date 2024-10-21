package Polimorfizm;

public class Animal {
    private String name;
    private String eat;

    public Animal(String name, String eat) {
        this.name = name;
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Кушает");
    }
}
