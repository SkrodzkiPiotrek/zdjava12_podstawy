package exercises;

public class BubbleSort {
    public static void main(String[] args) {
        int[] test = {6, 4, 2, 3, 5, 1};

//        BubbleSort(test);
        print(test);

    }
    
    private static void print(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int left = j;
                int right = j + 1;


                if (arr[left] > arr[right]) {
//                    swap(arr, left, right);
                }

            }

            
        }
        
    }
//    private static void swap();
    
    
}
