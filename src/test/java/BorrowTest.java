import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library("lib", 5);
        book = new Book("Book_title", "Book_author", "Book_genre");
        borrower = new Borrower("Ian", 5);
        library.addBook(book);
    }

    @Test
    public void borrowerCanBorrow(){
        borrower.addBook(library, book);
        assertEquals(1, borrower.collectionCount());
    }
}