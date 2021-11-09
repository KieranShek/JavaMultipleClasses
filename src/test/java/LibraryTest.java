import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library("lib", 1 );
        Book book = new Book("Book_title", "Book_author", "Book_genre");
        library.addBook(book);
    }

    @Test
    public void libraryHasBooks(){
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookNotAtCapacity(){
        Book book_1 = new Book("Book_title", "Book_author", "Book_genre");
        library.addBook(book_1);
        assertEquals(1, library.bookCount());
    }


//    @Test
//    public void canEatSalmon(){
//        bear.eat(river);
//        assertEquals(1, bear.foodCount());
//    }

//    @Test
//    public void shouldEvacuateBowels(){
//        bear.eat(river);
//        bear.layACable();
//        assertEquals(0, bear.foodCount());
//    }
}
