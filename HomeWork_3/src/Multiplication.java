public class Multiplication {

    private int firstNumber;
    private int secondNumber;

    public Multiplication (int firstNumberM, int secondNumberM) {
        this.firstNumber = firstNumberM;
        this.secondNumber = secondNumberM;
    }

    public void multiplication () {
        int multiplicationNumbers = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationNumbers);
    }
}
