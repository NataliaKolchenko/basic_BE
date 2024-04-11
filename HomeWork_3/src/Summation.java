public class Summation {

    private int firstNumber;
    private int secondNumber;

    public Summation (int firstNumberS, int secondNumberS) {
        this.firstNumber = firstNumberS;
        this.secondNumber = secondNumberS;
    }

    public void sum () {
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

    }
}
