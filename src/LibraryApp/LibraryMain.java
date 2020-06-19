package LibraryApp;

import java.util.Scanner;

public class LibraryMain {

    public static void menu(Library library) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj!");

        System.out.println("MENU\n" +
                "\t Wybierz z poniższyh opcji: \n" +
                "1. Wypożyczalnia \n" +
                "2. Klient\n " +
                "3. Stan Biblioteki \n " +
                "4. Szukaj Książki\n" );


        int choose = scanner.nextInt();

        switch (choose) {
            case 1: {
                System.out.println("MENU WYPOŻYCZALNIA\n" +
                        "\t Wybierz z poniższyh opcji: \n" +
                        "1. Wypożycz \n" +
                        "2. Oddaj\n " +
                        "3. Szukaj Książki\n" +
                        "0. Powrót");
                int bibliotekaWybor = scanner.nextInt();
                switch (bibliotekaWybor) {
                    case 1: {

                        //todo wypożycz ksiązke
                        break;
                    }
                    case 2: {
                        //todo oddaj książke
                        break;
                    }
                    case 3: {
                        // szukaj książki
                        System.out.println("Wpisz frazę");
                        String fraza = scanner.nextLine();

                        library.searchBook(fraza);

                        Book[] searchResult = library.searchBook(fraza);

                        for (Book value : searchResult) {
                            System.out.println(value);
                            break;
                        }
                    }
                    case 0: {
                        // todo powrót jak to zrobić?
                        break;


                    }

                }

                break;
            }
            case 2: {
                System.out.println("MENU KLIENT\n" +
                        "\t Wybierz z poniższyh opcji: \n" +
                        "1. Lista klientów \n" +
                        "2. Dodaj klienta\n " +
                        "3. Usuń klienta\n" +
                        "0. Powrót");
                int bibliotekaWybor = scanner.nextInt();
                switch (bibliotekaWybor) {
                    case 1: {

                        library.printKlient();
                        //pokaz klientów
                        break;
                    }
                    case 2: {
                        library.addKlient();
                        //dodanie klienta
                        break;
                    }

                    case 3: {
                        //usun klienta
                        break;
                    }
                    case 0: {
                        // todo powrót jak to zrobić?

                        break;
                    }

                }
                break;
            }

            case 3: {
                System.out.println("MENU STAN BIBLIOTEKI\n" +
                        "\t Wybierz z poniższyh opcji: \n" +
                        "1. Dostępne książki \n" +
                        "2. Dodaj książkę\n " +
                        "3. Usuń książkę \n" +
                        "4. Szukaj książki\n" +
                        "0. Powrót");
                int stanWybor = scanner.nextInt();

                switch (stanWybor) {
                    case 1: {
                        //dostępne książki
                        library.printBooks();
                        break;
                    }
                    case 2: {
                        //dodaj książkę
                        library.addBook();
                        break;

                    }
                    case 3: {
                        //todo usuń książkę

                        break;
                    }
                    case 4: {
                        //wyszukaj książkę
                    }
                    System.out.println("Wpisz frazę");
                    String fraza = scanner.nextLine();

                    library.searchBook(fraza);

                    Book[] searchResult = library.searchBook(fraza);

                    for (Book value : searchResult) {
                        System.out.println(value);

                    }
                    break;

                    case 0: {
                        //powrót
                        break;
                    }
                }

            }
            break;


            case 4: {
                //wyszukaj książke
                System.out.println("Wpisz frazę");
                String fraza = scanner.nextLine();

                library.searchBook(fraza);

                Book[] searchResult = library.searchBook(fraza);

                for (Book value : searchResult) {
                    System.out.println(value);


                }
                break;
            }
        }
    }

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



