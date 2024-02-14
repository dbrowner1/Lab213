/**
 * Class: 2150 ITEC
 * * @author D'Quavious Browner
 * * @version 1.0
 * * Course: ITEC 2150 Fall 2024
 * * Written: feb 12, 2024
 * *
 * * This class
 */
public class Textbook {
    //instance variables
    private String title;
    private String author;
    private int numberOfPages;

    //No argument constructor
    public Textbook() {
        this.title = "Happy Time";
        this.author = "JayB";
        this.numberOfPages = 298;
    }

    // Parameters constructor
    public Textbook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Getters "3"
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Setters "3"
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    //instance method displaying BookInfo
    public void displayBookInfo() {
        System.out.println("Book Info: Title = " + title + ", author = " + author + ", Pages in book = " + numberOfPages);
    }

    //toString method override
    @Override
    public String toString() {
        return "Textbook Info: Title = " + title + ", author = " + author + ", Pages in book = " + numberOfPages;
    }
}
