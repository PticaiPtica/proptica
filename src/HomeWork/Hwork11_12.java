package HomeWork;

import java.util.Scanner;

public class Hwork11_12{
    public static void main(String[] Args) {
        task1();
        task2();
        task3();
    }
    static void task1() {
        /*       1 Напишите программу, которая определяет, в какое учреждение необходимо отправить человека в зависимости от его возраста.
•	Если человеку от 2 до 6 лет, программа должна подсказать, что он должен ходить в детский сад.
•	Если возраст человека находится в диапазоне от 7 до 18 лет, программа должна указать, что ему нужно посещать школу.
•	Если человеку больше 18, но меньше 24 лет, программа сообщит, что ему следует учиться в университете.
•	Если человеку больше 24 лет, программа сообщит, что ему пора идти на работу.
                Программа должна выводить сообщения в следующем формате: «Если возраст человека равен …, то ему …», где в зависимости от возраста будет указано соответствующее учреждение.
                Требования:
•	Переменные должны быть правильно инициализированы.
•	Названия переменных должны соответствовать данным.
•	Условные операторы должны корректно решать задачу.
•	Результат должен выводиться в консоль.
•	В решении должна использоваться конструкция else.
•	Не пропустить ни одного значения возраста (использовать не только операторы больше/меньше, но и больше или равно / меньше или равно)
*/
        Scanner SSS = new Scanner(System.in);
        int age = SSS.nextInt();
        if (age <= 1) {
            System.out.println("Грудничок");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Возраст человека равен " + age + "  ему в садик");
        } else if (age > 7 && age <= 18) {
            System.out.println("Возраст человека равен " + age + "  ему нужно посещать школу");
        } else if (age >= 19 && age <= 24) {
            System.out.println("Возраст человека равен " + age + "  ему следует учиться в университете");
        } else if (age >= 25) {
            System.out.println("Возраст человека равен " + age + " пора идти на работу");
        }
    }
    /*
    Вам поставили задачу автоматизировать повышение зарплаты для сотрудников:
•	Диана получает 66 660 рублей в месяц.
•	Андрей получает 77 770 рублей в месяц.
•	Мария получает 88 880 рублей в месяц.
        Каждому нужно увеличить зарплату на 15% от текущей.
        Также нужно посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Выведите в консоль информацию по каждому сотруднику. Например: «… теперь получает ... рублей.
        Годовой доход вырос на ... рублей».
*/
    static void task2() {

        int payDayDiana = 66_660;
        int payDayAndrey = 77_770;
        int payDayMarya = 88_880;
        int payDayDianaPoW = (int) (payDayDiana * 1.15);
        int payDayDianaYear = payDayDiana * 12;
        int payDayDianaYearPoW = payDayDianaPoW * 12;
        int payDayDianawRaznica = payDayDianaYearPoW - payDayDianaYear;
        System.out.println("Диана теперь получает " + payDayDianaPoW);
        System.out.println("Годовой доход вырос на " + payDayDianawRaznica + " рублей");

        int payDayAndreyPoW = (int) (payDayAndrey * 1.15);
        int payDayAndreyYear = payDayAndrey * 12;
        int payDayAndreyYearPoW = payDayAndreyPoW * 12;
        int payDayAndreyRaznica = payDayAndreyYearPoW - payDayAndreyYear;
        System.out.println("Андре теперь получает " + payDayAndreyPoW);
        System.out.println("Годовой доход вырос на " + payDayAndreyRaznica + " рублей");

        int payDayMaryaPoW = (int) (payDayMarya * 1.15);
        int payDayMaryaYear = payDayMarya * 12;
        int payDayMaryaYearPoW = payDayMaryaPoW * 12;
        int payDayMaryaRaznica = payDayMaryaYearPoW - payDayMaryaYear;
        System.out.println("Мария теперь получает " + payDayMaryaPoW);
        System.out.println("Годовой доход вырос на " + payDayMaryaRaznica + " рублей");

    }
    static void task3() {
        /*(Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch.
        Для обозначения номера месяца используйте переменную monthNumber.
        Обратите внимание, что в switch должно быть четыре case!
        Т.е. некоторые месяцы надо объединить внутри кейсов
*/
        Scanner SSS = new Scanner(System.in);
        int monthNumber = SSS.nextInt();
        {
            switch (monthNumber) {
                case (12), (1), (2) -> System.out.println("зима");
                case (3), (4), (5) -> System.out.println("весна");
                case (6), (7), (8) -> System.out.println("лето");
                case (9), (10), (11) -> System.out.println("осень");

            }


        }
    }
}


















