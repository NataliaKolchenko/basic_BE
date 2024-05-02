import java.util.Scanner;

//    Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
//цифр (заранее не известно сколько цифр будет в числе).
//        Например:
//        Ввод = 12345
//        Вывод = 1+2+3+4+5 = 15
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number");
        String userNumber = scanner.nextLine();
        scanner.close();

        sum (userNumber);
    }

    public static void sum (String  number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            // Преобразуем каждый символ строки в число и суммируем
            sum +=number.charAt(i) - '0'; // Вычитаем '0' для преобразования char в int


        }
        System.out.println("sum of numbers (" + number + ") is " + sum);

    }
}


