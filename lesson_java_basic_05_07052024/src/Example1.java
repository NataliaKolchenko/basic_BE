public class Example1 {
    public static void main(String[] args) {

//        int [] arr;
//        arr = new int [10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//заполнение массива (версия 1)
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

    }

        System.out.println(" ");

        //заполнение и вывод массива (версия 2)
        int[] arr1 = new int [5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i*2;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println(" ");

        //заполнение и вывод массива (версия 2)
        int[] arr2 = new int [5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i*3;
            System.out.print(arr2[i] + " ");
        }

        System.out.println(" ");

        //перенос из одного массива в другой
        int [] arrBig = new int [arr2.length * 2];
        for (int i = 0; i < arr2.length; i++) {
            arrBig[i] = arr2[i];
            System.out.print(arrBig[i] + " ");
        }
        arrBig[5] = 999;

        System.out.println(" ");

        for (int i = 0; i < arrBig.length; i++) {
            System.out.print(arrBig[i] + " ");
        }





    }

}