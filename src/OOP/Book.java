package OOP;

import java.time.LocalDate;

public class Book {

    private Author author; //Автор
    private String title; //название
    private Integer pages; // дата публикации

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public Book() {
    }

    public Book(Author author, Integer pages, String title) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }


    public void setPages(Integer pages) {
=======
    private String title;
    private Integer pages;

    public String getAuthor() {
        return Author.getAuthorBook();
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        if (pages <= LocalDate.now().getYear()) {
            this.pages = pages;
        } else {
            this.pages = -1;
            System.out.println("Year out of range");
        }

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Название книги - " + title + "\n" +
                "Год публикации: " + pages + "\n" +
                "Автор " + author.toString();
    }

}