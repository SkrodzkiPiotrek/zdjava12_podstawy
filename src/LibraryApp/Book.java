package LibraryApp;

public class Book {

    //modyfikatory dostępu pól i metod : ptivate, public, (protected)

    private String title;
    private String author;
    private String bookID;
    //todo w przyszlosci dodac czytenika;
    //todo w przyszlosci dodac date do kiedy ma byc oddana ksiązka

    private static int idCounter = 0;


    public Book(String title, String author, String bookID) {
        this.bookID = idCounter;
        idCounter++;
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookID() {
        return bookID;
    }

}







