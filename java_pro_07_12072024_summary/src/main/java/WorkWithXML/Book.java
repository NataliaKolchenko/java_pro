package WorkWithXML;

public class Book {
    private String bookTitle;
    private String author;
    private int year;

    public Book(String bookTitle, String author, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
