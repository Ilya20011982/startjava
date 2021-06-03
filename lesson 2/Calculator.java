public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char mathSign;

   public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public boolean setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber == 0 && (mathSign == '/' || mathSign == '%');
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
   }

    public void getResult() {
        switch (mathSign) {
            case '+' -> System.out.println(firstNumber + secondNumber);
            case '-' -> System.out.println(firstNumber - secondNumber);
            case '*' -> System.out.println(firstNumber * secondNumber);
            case '/' -> System.out.println(firstNumber / secondNumber);
            case '%' -> System.out.println(firstNumber % secondNumber);
            case '^' -> System.out.println(Math.pow(firstNumber, secondNumber));
        }
    }
}
