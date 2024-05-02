
//Напишите программу, которая будет печатать коробку из #, принимая от пользователя
//        значения высоты и ширины.
//        Например:
//        Вход = 3, 3
//        Выход =
//        ###
//        ###
//        ###


public class GroupTaskTwo {

    public static void main(String[] args) {
        int height = 3;
        int weight = 3;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < weight; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

    }
}
