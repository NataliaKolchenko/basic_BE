package org.example;

public class FindMaxNumber {
    public static void main(String[] args) {

        int [] arr = {1,3,5,7,9,-5,0,-234};
        System.out.println(findMax(arr));

    }

    public static Integer findMax(int[] arr) {
        if(arr == null) {
            return null;
        }
        int maxNum = arr[0];
        for (int j = 0; j < arr.length; j++){
            if (arr[j] > maxNum) {
                maxNum = arr[j];
            }
        }
        return maxNum;

    }
}
