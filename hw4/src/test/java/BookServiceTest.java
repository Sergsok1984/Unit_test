import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BookServiceTest {

    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        Book expectedBook = new Book("1", "Book 1", "Author 1");
        when(bookRepository.findById("1")).thenReturn(expectedBook);

        Book result = bookService.findBookById("1");

        assertEquals(expectedBook, result);
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book 1", "Author 1"));
        expectedBooks.add(new Book("2", "Book 2", "Author 2"));

        when(bookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> result = bookService.findAllBooks();

        assertEquals(expectedBooks, result);
    }
}
