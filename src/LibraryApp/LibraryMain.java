package LibraryApp;

public class LibraryMain {
    public static void main(String[] args) {

        //stworzenie instacji biblioteki "library"
        Library library = new Library();

        //stworzenie instancji książek "book"
        Book book = new Book("Pan Tadeusz", "Adam Miciewicz");
        Book book1 = new Book("Przedwiośnie", "Stefan Żeromski");
        Book book2 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");

        //dodanie metodą addBook(); ksiazek do library
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);

        //stworzenie instancji klienta 'klient'
        Klient klient = new Klient("Jaś Fasola");
        Klient klient1 = new Klient("Jakub Nagiet");
        Klient klient2 = new Klient("Bercik Albert Gwidon Bercicky");
        Klient klient3 = new Klient("Artur Nawałka");

        //dodanie klientow do biblioteki
        library.addKlient(klient);
        library.addKlient(klient1);
        library.addKlient(klient2);
        library.addKlient(klient3);

    }
}


