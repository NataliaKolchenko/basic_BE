import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        // copyOfRange - копивароние из массива из N  элемента по М эелемент (НЕ включительно)
        int[] arr2 = Arrays.copyOfRange(arr1, 1,3);
        System.out.println(Arrays.toString(arr1));

        System.out.println();

        System.out.println(Arrays.toString(arr2));

        System.out.println();
        //copyOf - копирует данные из одного массима в другой с указанием количества элементов
        int[] arrNew = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arrNew));
    }
}
