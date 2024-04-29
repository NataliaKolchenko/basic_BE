public class ShopsIsOpen {
    public static void main(String[] args) {


        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        System.out.println(canBuy(isEdekaOpen, isReweOpen));



        boolean result = canBuy(isEdekaOpen, isReweOpen) == true
            ? print(canBuy(isEdekaOpen, isReweOpen))
                : print(canBuy(isEdekaOpen, isReweOpen));


    }

    public static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen) {


        return isEdekaOpen || isReweOpen ? true : false;
    }

    public static boolean print (boolean b) {
        if (b == true) {
            System.out.println ("Shop is opening");
            return b;
        } else {
            System.out.println ("Shop is closing");
            return b;
        }



    }
}