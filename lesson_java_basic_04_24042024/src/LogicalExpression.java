//        1. Создайте переменные int a, b, c, d;
//        2. Используя блок if (выражение) {}, составьте логические выражения
//        a. истина , если “а” меньше “b” И “b” равно “c”;
//        b. истина , если “а” больше “b” ИЛИ “c” равно “d”;
//        c. истина , если “а” НЕ равно “b”;

public class LogicalExpression {

    public static void main(String[] args) {

        int a = 0;
        int b = 4;
        int c = 4;
        int d = -8;

        if (a<b && b==c) {
            System.out.println(true);
        }


        if (a>b || c==d) {
            System.out.println(true);
        }


        if (a!=b) {
            System.out.println(true);
        }

    }
}
