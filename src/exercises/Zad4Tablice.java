package exercises;

public class Zad4Tablice {

    public static void main(String[] args) {
        int[] testArray = {12, 32, 45, 55, 65, 74, 434};

        showArray(testArray);

    }

    private static void showArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

          //  System.out.println(array[start]);
            if (start != end) {
              //  System.out.println(array[end]);
            }
            start++;
            end--;


        }


    }

    private static void printPairSum(int[] arr) {
        int[] testArray = {12, 32, 45, 55, 65, 74, 434};

        int left = 0;
        int right = 1;


        if (arr.length % 2 == 0 && arr.length > 1) {
            while (right < arr.length) {
                System.out.println(testArray[left] + testArray[right]);

                right += 2;
                left += 2;
            }

        } else {
            System.out.println("Tablica ma nieparzystą ilość elemetów");
        }
    }
}