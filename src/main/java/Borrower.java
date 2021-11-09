import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }
    public int collectionCount(){
        return collection.size();
    }

    public void addBook(Library library, Book bookToAdd){
        Book book = library.removeBook(bookToAdd);
        collection.add(book);
    }


}
