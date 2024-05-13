package Search;

public class LinearSearch {
    public static void main(String[] args) {
        //линейный поиск

        int num = 22;
        int[] arr = {3, 5, 10, 1, 0, 22, 50};
        searchNum(arr, num);
        System.out.println();
        System.out.println(sNum(arr, num));

    }
//выводит на каждом элементе -1, если не найдена цифра
    public static void searchNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i);
                ;
            } else {
                System.out.println(-1);
            }
        }
    }
//выводит только однажды -1, если не найдена цифра
    public static int sNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
//            return -1;
        }
        return -1;
    }
}
