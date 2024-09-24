package HomeWork;

public class Home_Work17_18 {
    public static void main(String[] Args) {
        /*  Задание по Урокам 17 - 18 Строки
        1)Реализовать проверку строки на палиндром двумя способами:
        a.С помощью СтрингБилдера получить реверс строки
        (строку в обратном порядке символов)и сравнить её с исходной строкой
        b.Анализировать посимвольно строку –сравнивать первый
        символ с последним, второй с предпоследним и т.д.
                c. * подумать –как можно проверить на палиндром число, например 1234321
*/
        String Str = "1234321";
        StringBuilder text1 = new StringBuilder(Str);
        System.out.println(text1);
        StringBuilder text2 = text1.reverse();
        System.out.println(text2);
        if (!Str.contentEquals(text2)) {
            System.out.println("Не Палиндром");
        } else {
            System.out.println("Палиндром");
        }


        String str22 = "qwerrewq";
        boolean isPalindrom = true;
        for (int i = 0; i < (str22.length() / 2); i++) {
            if (str22.charAt(i) == str22.charAt((str22.length() - 1) - i)) {
                continue;
            }
            isPalindrom = false;
            break;
        }
        if (isPalindrom) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
    }
}
