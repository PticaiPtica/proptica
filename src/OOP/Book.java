package OOP;

import java.time.LocalDate;

public class Book {
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
}