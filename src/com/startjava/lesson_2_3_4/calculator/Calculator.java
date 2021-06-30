package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
   private String[] mathExp = new String[3];

   public void setMathExp(String mathExp) {
       this.mathExp = mathExp.split(" ", 3);
    }

   public boolean zeroDivision() {
       return "0".equals(mathExp[2]) && ("/".equals(mathExp[1]) || "%".equals(mathExp[1]));
   }

    public  void setSecondNumber(String secondNumber) {
        this.mathExp[2] = secondNumber;
    }

   public double calc() {
        double firstNum = Double.parseDouble(mathExp[0]);
        double secondNum = Double.parseDouble(mathExp[2]);
        double result;

        switch (mathExp[1]) {
            case "+" -> result = firstNum + secondNum;
            case "*" -> result = firstNum * secondNum;
            case "^" -> result = Math.pow(firstNum, secondNum);
            case "-" -> result = firstNum - secondNum;
            case "/" -> result = firstNum / secondNum;
            case "%" -> result = firstNum % secondNum;
            default -> result = 0.0;
        }
       return result;
    }
}
