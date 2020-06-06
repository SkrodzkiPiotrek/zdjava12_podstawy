package exercises;

import java.math.BigInteger;

public class Power {


    static int power(int n) {

        int accumulator = 1;
        for (int i = 1; i <= n; i++) {
            accumulator *= n;
        }

        return accumulator;
    }

    static void bigPowerWhile(BigInteger n) {
     BigInteger accumulator = new BigInteger("1");
     BigInteger i = new BigInteger("1");

     while (i.compareTo(n) <= 0){
         accumulator = accumulator.multiply(i); //    accumulator = accumulator * i


         i = i.add(new BigInteger("1")); //   inkrementacja => i = i + 1


     }
    }

    public static void main(String[] args) {


        }

/*
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");

        BigInteger sum = one.add(two);
        BigInteger difference = one.subtract(two);
        BigInteger product = one.multiply(two);
        BigInteger divideResult = one.divide(two);


        int power = power(10);
        System.out.println(power);
*/
}



