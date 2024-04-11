public class Division {

    private int firstNumber;
    private int secondNumber;

    public Division (int firstNumberD, int secondNumberD) {
        this.firstNumber = firstNumberD;
        this.secondNumber = secondNumberD;
    }

    public void division () {
        double divisionNumbers = (double) firstNumber / (double) secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + divisionNumbers);
    }
}
