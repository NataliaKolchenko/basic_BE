//используется для прохождения строк или ENUM
//работает только с константами

public class SwitchFirstExample {
    public static void main(String[] args) {

        int num = 15;

        String s = "dog";
        switch (num) {
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                switch (s) {
                    case "cat":
                        System.out.println("cat");
                        break;
                    case "dog":
                        System.out.println("doggg");
                        break;

                }
                break;
            default:
                System.out.println("wrong");
                break;
        }
    }
}