package Polimorfizm;

public class Main {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Шарик", "Кость");
        Animal dog2 = new Dog("Бобик", "Сухой Корм");
        Animal cat1 = new Cat("Пушок", "Рыбу");
        Animal cat2 = new Cat("Персик", "Корм");
        Animal bird1 = new Bird("Кеша", "Семечки", true);
        Animal bird2 = new Bird("Петух", "Зерна", false);

        Animal[] animals = {dog1, dog2, cat1, cat2, bird1, bird2};
        for (Animal animal : animals) {
            if (animal instanceof Pet) {
                ((Pet) animal).play();
                ((Pet) animal).beFriendly();
            }
            animal.makeSound();
            animal.eat();
            animal.move();
            System.out.println();

        }
    }

}
