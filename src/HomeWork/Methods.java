package HomeWork;

public class Methods {
    /*1.
    Создайте метод  square, который принимает
    одно целое число и  возвращает его квадрат,
    затем вызовите
    его с  разными значениями
    и выведите  результат*/
    public static int square(int first) {
        return first * first;
    }

    public static String printFullName(String Name, String Family) {
        return Name + " " + Family;
    }

    public static String[] cornerValuesArray(String[] ValuesArray) {
        int max = ValuesArray[0].length();

        String[] MinMAx = new String[2];

        for (String s : ValuesArray) {

            if (s.length() < max) {
                MinMAx[0] = s;
                max = s.length();
            } else if (s.length() == max) {
                MinMAx[1] = s;
            }
        }
        return MinMAx;
    }
}




