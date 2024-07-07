package example.Collectors.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Преобразовать список книг, каждая из которых имеет список авторов, в один список всех авторов.
public class Ex13 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Book_Name_1", List.of("a1, A2, a3")));
        bookList.add(new Book("Book_Name_2", List.of("a4, A5, a6")));
        bookList.add(new Book("Book_Name_1", List.of("a7, 82, a8")));

        bookList.stream()
                .map(Book::getAuthorsList)
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class Book {
    private String bookName;
    public List<String> authorsList;

    public Book(String bookName, List<String> authorsList) {
        this.bookName = bookName;
        this.authorsList = authorsList;
    }

    public String getBookName() {
        return bookName;
    }

    public List<String> getAuthorsList() {
        return authorsList;
    }
}
