import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return books.size();
    }

    public void addBook(Book book) {
        if (books.size() < this.capacity) {
            this.books.add(book);
        }
    }
    public Book removeBook(Book book){
        return this.books.remove(this.books.indexOf(book));
    }

    public void genreCheck(){
        HashMap genres = new HashMap<String, String>();
        for (int i = 0; i < bookCount(); i++) {
            if (genres.containsKey(this.books.get(i).genre)){
                genres.put(this.books.get(i).genre, genres.get(this.books.get(i).genre) + 1);
            }else{
                genres.put(this.books.get(i).genre, 1);
            }
        }
    }


//    public void pickUP(Destination river){
//        Book book = river.removeFish();
//        books.add(book);
//    }
//
//    public void layACable(){
//        belly.clear();

}
