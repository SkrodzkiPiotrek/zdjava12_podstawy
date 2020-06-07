package LibraryApp;

public class LibraryMain {
    public static void main(String[] args) {
    Book book1 = new Book("Nniezwyciężony", "Stanisław Lem", 0);
    Book book2 = new Book("Wojna i Pokój","Lew Tołstoj");
    Book book3 = new Book("Ogniem i Mieczem", "Henryk SIenkiewicz");


    Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printBooks();

        Book[] searchResult = library.searchBook("Ogni")

        for (Book foundBook : searchResult) {

            System.out.println(foundBook);
        }
    }
    }

}
