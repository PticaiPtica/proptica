package OOP;

public class Author {
    private static String author;


    public static String getAuthorBook() {
        return author();
    }

    private static String author() {
        return author;
    }

    public void setNameSurnameAuthor(String name, String SurnameAuthor) {
        author = name + " " + SurnameAuthor;
    }
}


