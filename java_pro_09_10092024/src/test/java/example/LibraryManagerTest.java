package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LibraryManagerTest {
    @Mock
    BookRepository bookRepository;
    @InjectMocks
    LibraryManager libraryManager;


    private static final Book TEST_BOOK = new Book("TEST_BOOK", "TEST_BOOK", "TEST_BOOK");

    @Test
    void findBookByIdTest() {
        Optional<Book> expectedBook = Optional.of(TEST_BOOK);
        when(bookRepository.findById("TEST_BOOK")).thenReturn(expectedBook);
        Optional<Book> actualBook = libraryManager.findBookById("TEST_BOOK");

        assertAll(
                () -> verify(bookRepository).findById(TEST_BOOK.getId()),
                () -> assertEquals(expectedBook, actualBook),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBookByIdEmptyBookTest() {
        Optional<Book> expectedBook = Optional.empty();
        when(bookRepository.findById("TEST")).thenReturn(expectedBook);
        Optional<Book> actualBook = libraryManager.findBookById("TEST");

        assertAll(
                () -> verify(bookRepository).findById("TEST"),
                () -> assertEquals(expectedBook, actualBook),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findAllBooksTest() {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(TEST_BOOK, TEST_BOOK));
        List<Book> books = libraryManager.findAllBooks();
        assertAll(
                () -> verify(bookRepository).findAll(),
                () -> assertEquals(2, books.size()),
                () -> assertTrue(books.contains(TEST_BOOK)),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findAllBooksEmptyStorageTest() {
        when(bookRepository.findAll()).thenReturn(List.of());
        List<Book> books = libraryManager.findAllBooks();
        assertAll(
                () -> verify(bookRepository).findAll(),
                () -> assertEquals(0, books.size()),
                () -> assertTrue(books.isEmpty()),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void addBookTest() {
        when(bookRepository.save(TEST_BOOK)).thenReturn(TEST_BOOK);
        Book expectedBook = libraryManager.addBook(TEST_BOOK);
        assertAll(
                () -> verify(bookRepository).save(TEST_BOOK),
                () -> assertEquals("TEST_BOOK", TEST_BOOK.getTitle()),
                () -> assertEquals("TEST_BOOK", TEST_BOOK.getAuthor()),
                () -> assertNotNull(expectedBook),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void addBookTitleNullTest() {
        Book bookTitleNull = new Book("1", null, "test_author");
        assertThrows(IllegalArgumentException.class, () -> libraryManager.addBook(bookTitleNull));
    }

    @Test
    void addBookAuthorNullTest() {
        Book bookAuthorNull = new Book("2", "test_title", null);
        assertThrows(IllegalArgumentException.class, () -> libraryManager.addBook(bookAuthorNull));
    }


    //CHECK
    @Test
    void deleteBookTest() {
        when(bookRepository.findById(anyString())).thenReturn(Optional.empty());
        libraryManager.deleteBook(TEST_BOOK.getId());
        Optional<Book> expectedBook = Optional.empty();

        assertEquals(expectedBook, bookRepository.findById(TEST_BOOK.getId()));
    }

    @Test
    void updateBookTest() {
        Book updatedBook = new Book(TEST_BOOK.getId(), "New_Test_Title", "New_Test_A");

        when(bookRepository.existsById(TEST_BOOK.getId())).thenReturn(true);
        when(bookRepository.save(any(Book.class))).thenReturn(updatedBook);

        Book resultBook = libraryManager.updateBook(TEST_BOOK.getId(), updatedBook);

        assertAll(
                () -> assertEquals("New_Test_Title", resultBook.getTitle()),
                () -> assertEquals("New_Test_A", resultBook.getAuthor()),
                () -> verify(bookRepository).existsById(anyString()),
                () -> verify(bookRepository).save(any(Book.class)),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void updateBookNotExistBookTest() {
        assertThrows(IllegalArgumentException.class, () -> libraryManager.updateBook("TEST", TEST_BOOK));
    }

    @Test
    void findBookByAuthorTest() {
        when(bookRepository.findByAuthor("TEST_BOOK")).thenReturn(Arrays.asList(TEST_BOOK));
        List<Book> books = libraryManager.findBooksByAuthor("TEST_BOOK");

        assertAll(
                () -> verify(bookRepository).findByAuthor("TEST_BOOK"),
                () -> assertEquals(1, books.size()),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBookByAuthorEmptyStorageTest() {
        when(bookRepository.findByAuthor("TEST")).thenReturn(List.of());
        List<Book> books = libraryManager.findBooksByAuthor("TEST");

        assertAll(
                () -> verify(bookRepository).findByAuthor("TEST"),
                () -> assertEquals(0, books.size()),
                () -> assertTrue(books.isEmpty()),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBookByTitleTest() {
        Optional<Book> expectedBook = Optional.of(TEST_BOOK);
        when(bookRepository.findByTitle("TEST_BOOK")).thenReturn(Optional.of(TEST_BOOK));
        Optional<Book> actualBook = libraryManager.findBookByTitle("TEST_BOOK");

        assertAll(
                () -> verify(bookRepository).findByTitle("TEST_BOOK"),
                () -> assertEquals(expectedBook, actualBook),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBookByTitleEmptyStorageTest() {
        Optional<Book> expectedBook = Optional.empty();
        when(bookRepository.findByTitle("Title")).thenReturn(expectedBook);
        Optional<Book> actualBook = libraryManager.findBookByTitle("Title");

        assertAll(
                () -> verify(bookRepository).findByTitle("Title"),
                () -> assertEquals(expectedBook, actualBook),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBooksContainingTitleTest() {
        when(bookRepository.findContainingTitle("TEST_BOOK")).thenReturn(Arrays.asList(TEST_BOOK));
        List<Book> books = libraryManager.findBooksContainingTitle("TEST_BOOK");

        assertAll(
                () -> verify(bookRepository).findContainingTitle("TEST_BOOK"),
                () -> assertEquals(1, books.size()),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }

    @Test
    void findBooksContainingTitleEmptyStorageTest() {
        when(bookRepository.findContainingTitle("TEST")).thenReturn(List.of());
        List<Book> books = libraryManager.findBooksContainingTitle("TEST");

        assertAll(
                () -> verify(bookRepository).findContainingTitle("TEST"),
                () -> assertEquals(0, books.size()),
                () -> assertTrue(books.isEmpty()),
                () -> verifyNoMoreInteractions(bookRepository)
        );
    }


    @Test
    void lendBookIfPresentTest() {
        when(bookRepository.findById(anyString())).thenReturn(Optional.of(TEST_BOOK));
        libraryManager.lendBook(TEST_BOOK.getId(), "123");
        assertAll(
                () -> assertTrue(TEST_BOOK.isLent()),
                () -> verify(bookRepository).findById(TEST_BOOK.getId()),
                () -> verify(bookRepository).save(TEST_BOOK),
                () -> verifyNoMoreInteractions(bookRepository)
        );

    }

    //CHECK
    @Test
    void lendBookIfAlreadyLentTest() {
        TEST_BOOK.setLent(true);
        when(bookRepository.findById("test_bookId")).thenReturn(Optional.of(TEST_BOOK));
        assertThrows(IllegalStateException.class,
                () -> libraryManager.lendBook("test_bookId", "123"));
    }

    //CHECK
    @Test
    void returnBookIfPresentTest() {
        when(bookRepository.findById(anyString())).thenReturn(Optional.of(TEST_BOOK));
        TEST_BOOK.setLent(true);
        libraryManager.returnBook(TEST_BOOK.getId());
        assertAll(
                () -> assertFalse(TEST_BOOK.isLent()),
                () -> verify(bookRepository).findById(TEST_BOOK.getId()),
                () -> verify(bookRepository).save(TEST_BOOK),
                () -> verifyNoMoreInteractions(bookRepository)
        );

    }

    //CHECK
    @Test
    void returnBookExceptionTest() {
        TEST_BOOK.setLent(false);
        when(bookRepository.findById("test_bookId")).thenReturn(Optional.of(TEST_BOOK));
        assertThrows(IllegalStateException.class,
                () -> libraryManager.returnBook("test_bookId"));
    }


}