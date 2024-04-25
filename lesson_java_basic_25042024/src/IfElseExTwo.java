//        1. Создайте и инициализируйте переменную boolean t = true;
//        2. Добавьте инструкцию System.out.println("Before the return instruction");
//        3. В блоке if определите оператор return
//        4. Добавьте инструкцию после блока if System.out.println("This won't
//        execute");
//        5. Запустите код
//        6. Проанализируйте вывод используя режим дебаггера
//        7. Переопределите переменную t = false
//        8. Проанализируйте вывод используя режим дебаггера

public class IfElseExTwo {

    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before the return instruction");

        if (t) {
            return;
        }
        System.out.println("This won't execute");
    }
}
