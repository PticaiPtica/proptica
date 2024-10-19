package OOP;

public class Main {
    public static void main(String[] args) {
        Author Shakespeare = new Author("William", "Shakespeare");
        Author Dostoevsky = new Author("Фёдор", "Достоевский");

        Book crimesAndPunishments = new Book(Dostoevsky, 1866, "Преступление и наказание ");
        Book hamlet = new Book(Shakespeare, 1603, "Траги́ческая исто́рия о Га́млете, при́нце да́тском");

        System.out.println(crimesAndPunishments);
        System.out.println(hamlet);

        Author William = new Author("William","William");

        crimesAndPunishments.setTitle("Преступление");
        crimesAndPunishments.setPages(1234);

        hamlet.setAuthor(William);

        System.out.println("Новое название " + crimesAndPunishments.getTitle());
        System.out.println("Новое год издания " + crimesAndPunishments.getPages());
        System.out.println("Новый автор " + hamlet.getAuthor());


    }
}
