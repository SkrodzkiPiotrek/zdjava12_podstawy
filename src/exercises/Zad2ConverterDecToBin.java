package exercises;
import java.util.Scanner;

public class Zad2ConverterDecToBin {


    String decimalToBinary(int x) {

        String result = "";
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Wpisz liczbę którą chcesz przekonwertować na typ binarny: ");
         x = scanner.nextInt();


        while (x >= 1) {
            System.out.println("tekst");
            x  = x % 2;


        return result;

    }



}
