import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int userA = scan.nextInt();
//        int userB = scan.nextInt();
//
//        System.out.println("1st");
//        getSum(userA, userB);
//
//        System.out.println("2nd");
//        //если новый метод не вызываемый в main, то обращаться через класс/объект
//        Main main = new Main();
//        System.out.println(main.getReturnSum(userA, userB));
//
//        System.out.println("3rd");
//        //если новый метод вызываемый в main
//        System.out.println("print getReturnSum " + getReturnSumNew(userA,userB));

        Cat tom = new Cat("Tom");
        tom.sayName();

        tom.setName("Bill");
        System.out.println(tom.getName());
    }

//    public static void getSum (int a, int b) {
//        System.out.println(a+b);
//    }

//   //новый метод не вызываемый в main, обращение идет через класс/объект
//    public  int getReturnSum (int a, int b) {
//        return a+b;
//
//    }
//
//    // если новый метод вызываемый в main
//    public static int getReturnSumNew (int a, int b) {
//        return a+b;
//
//    }




}