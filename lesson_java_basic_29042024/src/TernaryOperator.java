public class TernaryOperator {

    public static void main(String[] args) {

        int a = 5, b = 10;
        int x = a > b //a larger then b?
                ? b //yes, output b (this is min number)
                : a; //false, output a (this is min number)
        System.out.println(x);

//        еще пишется в одну строчку
//        int x = a > b ? b : a;



    }

    public int min (int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public int minTernary (int a, int b) {
        return a > b //выражение
                ? b //когда true
                : a; //когда false
    }
}
