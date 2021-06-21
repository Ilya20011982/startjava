package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char mathSign;

   public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public boolean setSecondNumber(double secondNumber) {
        if (secondNumber == 0 && (mathSign == '/' || mathSign == '%')) return true;
        this.secondNumber = secondNumber;
        return false;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
   }

    public void calc() {
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
