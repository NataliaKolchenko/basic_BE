//По данному натуральному n вычислите сумму 2^1 + 2^2 + ... + 2^n

public class GroupThree {

    //version 1
//    public static void main(String[] args) {
//
//        int stepen = 8;
//        int numberInStepen = 1;
//
//        int sum = 0;
//
//        for (int i = 0; i < stepen; i++) {
//            numberInStepen =  numberInStepen * 2;
//
//            for (int j = 1; j < stepen-1; j++) {
//
//                sum = sum + numberInStepen;
//            }
//
//        }
//
////        System.out.println(numberInStepen);
//        System.out.println(sum);
//    }

    //version 2
    public static int SumofSquare(int n){
        int sum = 0;
        int numpower;
        for (int i = 1; i <= n; i++) {
            numpower = 1;
            for (int j = 1; j <= i; j++) {
                numpower *=2;
            }
            sum += numpower;
        }
        return sum;
    }
}
