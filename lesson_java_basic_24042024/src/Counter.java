//        Создайте класс Counter, в main методе которого будут выводиться числа от 1 до 10, затем обратно от 10 до 1.
//        Используйте переменную count.
//        Используйте инкремент для первой части и декремент для второй части.

public class Counter {

//    public static void main(String[] args) {
//
//        for (int count = 1; count <= 10; count++) {
//            System.out.println(count);
//        }
//
//        System.out.println("---------");
//
//        for (int count = 10; count >= 1; count--) {
//            System.out.println(count);
//        }
//
//
//    }

//    public static void main(String[] args) {
//
//        int countInc = 1;
//        int countDecr = 10;
//
//        for (; countInc <= 10 && countDecr>=1; countInc++, countDecr--) {
//            System.out.println(countInc);
//            System.out.println(countDecr);
//            }
//        }

//    public static void main(String[] args) {
//        for (int i = 1, y = 1; i >= 1 && i <= 10; i += y) {
//            System.out.println(i);
//            if (i == 10) {
//                y = -1; // Изменяем направление на обратное
//            }
//        }
//    }

    public static void main(String[] args) {
        for (int i = 2; i < 20; i++) {
            if(i > 10) {
                System.out.println(20 - i);
            } else {
                System.out.println(i);
            }
        }
    }

    }

