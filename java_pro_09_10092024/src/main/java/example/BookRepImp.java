package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepImp implements BookRepository {
    private List<Book> bookList = new ArrayList<>();


    @Override
    public Optional<Book> findById(String id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).equals(id)) {
                return Optional.ofNullable(bookList.get(i));
            }

        }
        return Optional.empty();
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book save(Book book) {
        bookList.add(book);
        return book;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public boolean existsById(String id) {
        return false;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public List<Book> findContainingTitle(String title) {
        return null;
    }
}
