package Polimorfizm;

public abstract class Animal {
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


    /**
     * Метод выдает звук животного
     */
    public abstract void makeSound();
    /**
     * Метод выдает как животное передвигается
     */

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод выдает что кушает животное
     */
    public abstract void eat();
}
