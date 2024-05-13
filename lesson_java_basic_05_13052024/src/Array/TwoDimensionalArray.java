package Array;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int [][] arr = new int [3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = (i+1) * (j + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((Arrays.toString(arr[i])));
        }

    }

    //трехмерные массивы
//    int [][][] arr = new int[8][5][3];
//for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            for (int k = 0; k < arr[i][j].length; k++) {
//                arr[i][j][k] = (i + 1) * (j + 1) * (k + 1);
//            }
//        }
//    }
//
//for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            for (int k = 0; k < arr[i][j].length; k++) {
//                System.out.print(arr[i][j][k] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
}

