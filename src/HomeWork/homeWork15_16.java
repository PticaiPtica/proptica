package HomeWork;

public class homeWork15_16 {
    public static void main(String[] ignoredArgs) {
        task1();
        task2();
        task3();

    }

    static void task1() {
        /*
    1)	Написать код, который подсчитывает количество букв и цифр в строке (как на занятии) – с циклом,
    методом charAt(индекс) и Character.isLetter/isDigit,
    a.	но добавить еще условие, чтобы подсчитывались отдельно цифры от 0 до 4, отдельно от 5 до 9
    b.	для букв так же – считать отдельно большие буквы и маленькие
    (поищите в классе Character подходящие методы, подсказка – они тоже начинаются на is)
    c.	(т.е. должно быть четыре счетчика – два для букв и два для цифр)
*/
        String text = "66666aA446";
        int countLouFour = 0;
        int countFour = 0;
        int countLowerCase = 0;
        int countUpperCase = 0;
        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i)) && (text.charAt(i) <= '4')) {
                ++countLouFour;
            } else if (Character.isDigit(text.charAt(i)) && (text.charAt(i) >= '5')) {
                ++countFour;
            }
            if (Character.isUpperCase(text.charAt(i))) {
                ++countUpperCase;
            } else if (Character.isLowerCase(text.charAt(i))) {
                ++countLowerCase;
            }
        }
        System.out.println("Кол-во маленьких букв-" + countLowerCase);
        System.out.println("Кол-во больших букв-" + countUpperCase);
        System.out.println("Кол-во цифр до 5- " + countLouFour);
        System.out.println("Кол-во цифр- больше 4 -" + countFour);

    }

    static void task2() {
        /*2)	Написать любую строку на ваш вкус (можно “I like Java!!!”), далее
        a.	Распечатать последний символ строки. Используем метод String.charAt().
                b.	Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
                c.	Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
                d.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
                e.	Найти позицию подстроки “Java” в строке “I like Java!!!”.
        f.	Заменить все символы “а” на “о”.
        g.	Преобразуйте строку к верхнему регистру.
                h.	Преобразуйте строку к нижнему регистру.
*/

        String java = "I like Java!!!";

        int lastS = java.length();
        System.out.println(java.charAt(lastS - 1));

        boolean javaEnd = java.endsWith("!!!");
        System.out.println(javaEnd);

        boolean javaStart = java.startsWith("I like");
        System.out.println(javaStart);

        boolean javaCont = java.contains("Java");
        System.out.println(javaCont);

        int index = java.indexOf("Java");
        System.out.println(index);

        String javaRep = "I like Java!!!".replace('a', 'o');
        System.out.println(javaRep);

        System.out.println(java.toLowerCase());

        System.out.println(java.toUpperCase());


    }

    static void task3() {
        // 3)	Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака.
        //  Например, если дана строка "string" –  результат будет "ri", для строки "code" результат "od",
        //  для "Practice" результат "ct" (тут надо взять длину и поиграться с индексами,
        //  чтобы взять тот кусок, который нужен, ну и применять метод substring).
        // Проверьте алгоритм на нескольких строках разной длины
        String Str = "stri43ng";
        System.out.println(Str);
        int lengthStr=Str.length();
        System.out.println(lengthStr);
        int iNdexL= lengthStr/2;
        System.out.println(iNdexL);
        int index1= iNdexL-1;
        System.out.println(index1);
        int index2= iNdexL+1;
        System.out.println(index2);
        System.out.println(Str.substring(index1,index2));




    }
}



