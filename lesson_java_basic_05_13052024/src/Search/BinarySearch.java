package Search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
//        int num = 10;
//        int[] arr = {3, 5, 10, 1, 0, 22, 50};
//        1) сортировка по возрастанию [0,1,3,5,10,22,50]
//        2) разделение пополам
//                index = arr.length / 2 = 3;
//                num == arr[index]
//        [0,1,3,5] [10,22,50]
//        3)[10,22,50] => index = 1
//        4) [10] [22,50]


        int num = 22;
        int[] arr = {3, 5, 10, 1, 0, 22, 50};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch1(arr, num));
    }
    public static int binarySearch1 (int [] arr, int num){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2; //находим индекс по середине массива
            if (arr[middleIndex] == num) {
                return middleIndex;
            } else if (arr[middleIndex]  < num) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > num) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

}
