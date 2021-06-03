public class Calculator {
    private double firstNumber, secondNumber;
    private char mathSign;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void result(double firstNumber, double secondNumber, char mathSign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.mathSign = mathSign;

        switch (mathSign) {
            case ('+'):
                System.out.println(firstNumber + secondNumber);
                break;
            case ('-'):
                System.out.println(firstNumber - secondNumber);
                break;
            case ('*'):
                System.out.println(firstNumber * secondNumber);
                break;
            case ('/'):
                System.out.println(firstNumber / secondNumber);
                break;
            case ('%'):
                System.out.println(firstNumber % secondNumber);
                break;
            case ('^'):
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
        }
    }
}
