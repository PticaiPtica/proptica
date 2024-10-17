package OOP;

public class Main {
    public static void main(String[] args) {
        Author Shakespeare = new Author();
        Author Dostoevsky = new Author();
        Book hamlet = new Book();
        Book crimesAndPunishments = new Book();

        Dostoevsky.setName("Фёдор");
        Dostoevsky.setSurname("Достоевский");

        crimesAndPunishments.setAuthor(String.valueOf(Dostoevsky));
        crimesAndPunishments.setPages(1866);
        crimesAndPunishments.setTitle("Преступление и наказание ");

        System.out.println("Название книги- " + crimesAndPunishments.getTitle());
        System.out.println("Автор- " + crimesAndPunishments.getAuthor());
        System.out.println("год издания- " + crimesAndPunishments.getPages());

        Shakespeare.setName("William");
        Shakespeare.setSurname("Shakespeare");
        hamlet.setAuthor(String.valueOf(Shakespeare));
        hamlet.setPages(1603);
        hamlet.setTitle("Траги́ческая исто́рия о Га́млете, при́нце да́тском");

        System.out.println("Название книги- " + hamlet.getTitle());
        System.out.println("Автор- " + hamlet.getAuthor());
        System.out.println("год издания- " + hamlet.getPages());
    }
}
