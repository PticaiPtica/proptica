import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число :");
        int Num = sc.nextInt();
        System.out.println("Введите второе число :");
        int Numsts = sc.nextInt();
        short aSr = 30000;
        byte bt = 125;
        long lls = 2_000_000;
        char ch = 3_000;
        float fl = 0.4F;
        double db = 0.5;
        boolean bl = true;
        int SumD = Num + Numsts;
        int subtractionD = Num - Numsts;
        int multiplicationD = Num * Numsts;
        int divisionD = Num / Numsts;
        int remainder = Num % Numsts;

        System.out.println(Num);
        System.out.println(Numsts);
        System.out.println(Numsts);
        System.out.println(aSr);
        System.out.println(bt);
        System.out.println(lls);
        System.out.println(ch);
        System.out.println(fl);
        System.out.println(db);
        System.out.println("Сумма " +SumD);
        System.out.println("Вычитание "+subtractionD);
        System.out.println("Умножение "+multiplicationD);
        System.out.println("Деление "+divisionD);
        System.out.println("Остаток "+remainder);

        /* int allFeedBackcount = 189;
        int goodFeedBackcount = 109;
        int badFeedBackcount = 80;*/

        System.out.println("Введите общее числло отзывов :");
            int allFeedBackcount = sc.nextInt();
        System.out.println("Введите  число хороших отзывов :");
            int goodFeedBackcount = sc.nextInt();
            int badFeedBackcount =allFeedBackcount-goodFeedBackcount ;


        double goodFeedBackPercent = goodFeedBackcount * 100.0 / allFeedBackcount;
            String goodFeedBackPercentW = String.format("%.0f",goodFeedBackPercent);

        double badFeedBackPercent = badFeedBackcount * 100.0 / allFeedBackcount;
            String badFeedBackPercentW = String.format("%.0f",badFeedBackPercent);

        int goodFeedBackPercentInt = Integer.parseInt(goodFeedBackPercentW);
        int badFeedBackPercentInt = Integer.parseInt(badFeedBackPercentW);

        System.out.println("ВСего отзывов - " + allFeedBackcount +
                "\nХороших отзывов (double) - " + goodFeedBackPercentW + "%." +
                "\nПлохих отзывов (double) - " + badFeedBackPercentW + "%." +
                "\nХороших отзывов (Int) - " + goodFeedBackPercentInt + "%" +
                "\nПлохих отзывов (Int) - " + badFeedBackPercentInt + "%");

        /*  2)	Использовать класс Random для генерации нескольких четырех случайных чисел,
                которые после этого привести к типу char и вывести их в консоль в одно слово (метод print)*/

        Random randomS = new Random();
        int a = randomS.nextInt(65,90);
            char Ca = (char) a ;
        int b = randomS.nextInt(65,90);
            char Cb = (char) b ;
        int d = randomS.nextInt(65,90);
            char Cd = (char) d ;
        int c = randomS.nextInt(65,90);
            char Cc = (char) c ;

        System.out.print(Ca);
        System.out.print(Cb);
        System.out.print(Cd);
        System.out.println(Cc);

        /*3)	Сделать переполнение типа int (привести тип long к типу int), вывести в консоль long и полученный переполненный int*/
int Max= 2147483647;
int MaxL= Max + 2147483647;
System.out.println(MaxL);
long MaxLs = (long) Max + 2147483647;
System.out.println(MaxLs);
    }

}

