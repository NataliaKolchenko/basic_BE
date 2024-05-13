package Sort;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 1, 0, 22, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    public static int [] bubbleSort (int[] arr) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
