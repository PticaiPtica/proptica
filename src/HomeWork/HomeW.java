package HomeWork;

import java.util.Objects;
import java.util.Scanner;

public class HomeW {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Подходим к магазину");
        String yes = "да";
        String no = "нет";
        System.out.println("Хотите войти ?");
        System.out.println("(да или нет)");
        String Sc = sc.next();
        if (Objects.equals(Sc, yes)) {
            System.out.println("Входим");
        } else System.exit(0);
        System.out.println("Подходим к стенду с шинами");
        System.out.println("Производим оценку");
        System.out.println("Подходящая шина №1 ?");
        System.out.println("(да или нет)");
        String Shina1 = sc.next();
        if (Objects.equals(Shina1, yes)) {
            System.out.println("Покупаем шину");
            System.out.println("Получаем удовольствие");
            System.exit(0);
        } else if (Objects.equals(Shina1, no))
            System.out.println("Переходим к следующей");
        System.out.println("Подходящая шина №2 ?");
        System.out.println("(да или нет)");
        String Shina2 = sc.next();
        if (Objects.equals(Shina2, yes)) {
            System.out.println("Покупаем шину");
            System.out.println("Получаем удовольствие");
            System.exit(0);
        } else if (Objects.equals(Shina2, no))
            System.out.println("Переходим к следующей");
        System.out.println("Подходящая шина №3 ?");
        System.out.println("(да или нет)");
        String Shina3 = sc.next();
        if (Objects.equals(Shina3, yes)) {
            System.out.println("Покупаем шину");
            System.out.println("Получаем удовольствие");
            System.exit(0);
        } else if (Objects.equals(Shina3, no))
            System.out.println("Огорчаемся");
        System.exit(0);
    }

}
