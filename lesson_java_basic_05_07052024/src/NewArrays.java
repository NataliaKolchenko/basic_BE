import java.util.Arrays;

public class NewArrays {
    public static void main(String[] args) {
        int[] arr = {5,7,3,4,1};


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println();
//toString (вывод массиа) работает только с одномером массим (с двумерным - гужгл создать 2й цикл)
        System.out.println(Arrays.toString(arr));

//        System.out.println();

//        arrNew[2] = 10;
//        arr[1] = 100;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrNew));
//sort - автоматически сортирует данные в массиве от меньшего к большему
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrNew));

        System.out.println("------------------------");
        //матрица

        int [][] matrix = new int[3][3];
        for (int i= 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i +1 )* (j+1);
            }
        }

        for (int i= 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
