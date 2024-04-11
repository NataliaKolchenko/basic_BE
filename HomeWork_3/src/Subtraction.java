public class Subtraction {
    private int firstNumber;
    private int secondNumber;

    public Subtraction (int firstNumberSub, int secondNumberSub) {
        this.firstNumber = firstNumberSub;
        this.secondNumber = secondNumberSub;

    }

    public void subtraction () {
        int subtractionNumbers = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionNumbers);
    }

}
