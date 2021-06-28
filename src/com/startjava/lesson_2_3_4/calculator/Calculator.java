package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
   private String[] mathExp = new String[3];

   public void setMathExp(String mathExp) {
       System.out.print(mathExp + " = ");
       this.mathExp = mathExp.split(" ", 3);
    }

   public boolean zeroDivision() {
       return "0".equals(mathExp[2]) && (mathExp[1].charAt(0) == '/' || mathExp[1].charAt(0) == '%');
   }

   public  void setSecondNumber(String secondNumber) {
       this.mathExp[2] = secondNumber;
   }

    public void calc() {
        switch (mathExp[1].charAt(0)) {
            case '+' -> System.out.println(Math.addExact(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case '*' -> System.out.println(Math.multiplyExact(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case '^' -> System.out.println(Math.pow(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case '-' -> System.out.println(Float.parseFloat(mathExp[0]) - Float.parseFloat(mathExp[2]));
            case '/' -> System.out.println(Float.parseFloat(mathExp[0]) / Float.parseFloat(mathExp[2]));
            case '%' -> System.out.println(Float.parseFloat(mathExp[0]) % Float.parseFloat(mathExp[2]));
        }
    }
}
