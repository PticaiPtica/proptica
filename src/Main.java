public class Main {
    public static void main(String[] ignoredArgs) {
        int Num = 30;
        int Numsts = 20;
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
        System.out.println(bl);
        System.out.println("Сумма " +SumD);
        System.out.println("Вычитание "+subtractionD);
        System.out.println("Умножение "+multiplicationD);
        System.out.println("Деление "+divisionD);
        System.out.println("Остаток "+remainder);

    }
}
