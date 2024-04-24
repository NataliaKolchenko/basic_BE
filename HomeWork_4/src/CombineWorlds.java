import java.util.Scanner;

public class CombineWorlds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 1st word");
        String userStr1 = scanner.nextLine();
        System.out.println("Add 2nd word");
        String userStr2 = scanner.nextLine();

        if ((userStr1.length() % 2 == 0) && (userStr2.length() % 2 == 0)){
            String newUserStr1 = userStr1.substring(0, (userStr1.length() / 2));
            String newUserStr2 = userStr2.substring(userStr2.length() / 2);
            System.out.println("New word: " + newUserStr1 + newUserStr2);
        } else {
            System.out.println("Add anoter worlds");
        }









    }
}