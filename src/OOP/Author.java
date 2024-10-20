package OOP;

public class Author {


    private String surname;
    private String name;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }


    public Author(String surname, String name) {
        this.name = name;
        this.surname = surname;


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;

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


