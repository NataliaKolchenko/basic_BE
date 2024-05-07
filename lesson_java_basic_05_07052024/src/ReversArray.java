//        Создайте массив из всех нечётных чисел от 1 до 99.
//        Выведите его на экран в строку в обратном порядке



public class ReversArray {
    //version 1
//    public static void main(String[] args) {
//
//        int[] arr1 = new int [50];
//        int odd = 1;
//        for (int i = 1; i < 99; i+=2) {
//            arr1[odd] = i;
//            odd++;
//        }
//        for (int i = arr1.length-1; i >0; i--) {
//            System.out.print(arr1[i] + " ");
//        }
//    }



    //version 2
    public static void main(String[] args) {
        int[] arr = new int[50];
        int oddNum =0;
        for (int i = 1; i < 100; i++) {
            if ( i % 2 != 0) {
                arr[oddNum] = i;
                oddNum++;
            }
        }
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
            if (i!=0)
                System.out.print(",");
        }
        System.out.println("]");

    }
}
