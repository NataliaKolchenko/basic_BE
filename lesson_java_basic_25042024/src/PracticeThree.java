//          написать метод isAllowed, принимающий на вход рост посетителя аттракциона
//        и возвращающий true, если ему можно пройти (рост больше 140) или
//        false, если нельзя

public class PracticeThree {

    public static void main(String[] args) {
        int kidHeight;

        System.out.println(isAllowed(140));

    }

    public static boolean isAllowed (int kidHeight) {
//1 version
        if (kidHeight > 140) {
            return true;
        }
        return false;

        //2 version
//        return kidHeight > 140;
    }
}
