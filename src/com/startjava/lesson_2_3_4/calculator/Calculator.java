package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
   private String[] mathExp = new String[3];

   public void setMathExp(String mathExp) {
       this.mathExp = mathExp.split(" ", 3);
    }

   public boolean zeroDivision() {
       return "0".equals(mathExp[2]) && ("/".equals(mathExp[1]) || "%".equals(mathExp[1]));
   }

   public Double calc() {
       if (zeroDivision()) {
            System.out.println("На 0 делить нельзя");
            return null;
       }
       double firstNum = Double.parseDouble(mathExp[0]);
       double secondNum = Double.parseDouble(mathExp[2]);
       return switch (mathExp[1]) {
           case "+" -> firstNum + secondNum;
           case "*" -> firstNum * secondNum;
           case "/" -> firstNum / secondNum;
           case "^" -> Math.pow(firstNum, secondNum);
           case "-" -> firstNum - secondNum;
           case "%" -> firstNum % secondNum;
           default ->  0.0;
           };
    }
}
