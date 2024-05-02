import java.util.Scanner;

public class Change {

    public static void main(String[] args) {


        convertNumber();
    }

    public static void convertNumber () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("add start system");

        int startSystem = Integer.parseInt(scanner.nextLine());

        System.out.println("add number");
        long userNumber = Long.parseLong(scanner.nextLine(), startSystem);

        System.out.println("add end system");
        int endSystem = scanner.nextInt();

        System.out.println("our result is " + Long.toString(userNumber, endSystem));



    }
}
