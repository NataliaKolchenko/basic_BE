//        Создайте класс Counter, в main методе которого будут выводиться числа от 1 до 10, затем обратно от 10 до 1.
//        Используйте переменную count.
//        Используйте инкремент для первой части и декремент для второй части.

public class Counter {

    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }

        System.out.println("---------");

        for (int count = 10; count >= 1; count--) {
            System.out.println(count);
        }


    }
}
