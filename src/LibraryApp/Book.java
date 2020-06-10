package LibraryApp;

public class Book {

    //modyfikatory dostępu pól i metod : ptivate, public, (protected)

    private String title;
    private String author;
    private int bookID;
    //todo w przyszlosci dodac czytenika;
    //todo w przyszlosci dodac date do kiedy ma byc oddana ksiązka

    private static int idCounter = 0;

    public Book() {
        this.bookID = idCounter;
        idCounter++;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookID = idCounter;
        idCounter++;
    }


    public void setBookId(int bookId) {
        this.bookID = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookID;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookId=" + bookID +
                '}';
    }
}







