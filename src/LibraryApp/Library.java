package LibraryApp;


import java.util.Scanner;

public class Library {

    private Book[] books;
    private Klient[] klients;
    private int firstEmptyIndex;
    private int firstEmptyID;

    private static final int MAX_BOOKS_COUNT = 100;
    private static final int MAX_KLIENT_COUNT = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyIndex = 0;
        this.klients = new Klient[MAX_KLIENT_COUNT];
        this.firstEmptyID = 0;
    }

    public void addBook(Book book) {
        //todo a co w przypadku gdy ktos chce dodac 100 ksiązke?
        this.books[firstEmptyIndex] = book;
        firstEmptyIndex++;

    }

    public void printBooks() {

        for (int i = 0; i < firstEmptyIndex; i++) {
            if (books[i] == null) {
                continue;
            } else {
                System.out.println(books[i]);
            }


        }
    }

    public Book[] searchBook(String searchQuerry) {
        Book[] searchResult = new Book[MAX_BOOKS_COUNT];

        int foundBooksCount = 0;


        for (int i = 0; i < this.books.length; i++) {
            Book bookToCheck = this.books[i];

            boolean authorCheck = bookToCheck.getAuthor().contains(searchQuerry);
            boolean titleCheck = bookToCheck.getTitle().contains(searchQuerry);

            if (authorCheck || titleCheck) {
                searchResult[i] = bookToCheck;
                foundBooksCount++;

            }
        }
        int actualIndex = 0;
        //todo ile mamy wyszukanych książek??
        Book[] searchResultToReturn = new Book[foundBooksCount];

        for (int i = 0; i < searchResult.length; i++) {
            if (searchResult[i] != null) {
                searchResultToReturn[actualIndex] = searchResult[i];
                actualIndex++;

            }
        }

        return searchResultToReturn;


    }

    public void addKlient(Klient klient) {
        //todo a co w przypadku gdy ktos chce dodac 100 klienta?
        this.klients[firstEmptyID] = klient;
        firstEmptyID++;

    }

    public void printKlient() {

        for (int i = 0; i < firstEmptyID; i++) {
            if (klients[i] == null) {
                continue;
            } else {
                System.out.println(klients[i]);
            }
        }
    }


    public void addKlient() {
        System.out.println("Podaj dane klienta: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

    }

    public void addBook() {
        System.out.println("");
    }
}


