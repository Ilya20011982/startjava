package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

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

    public void calc() {
        Scanner in = new Scanner(System.in);
        while (zeroDivision()) {
            System.out.print("На 0 делить нельзя, введите второе число - ");
            setSecondNumber(in.next());
        }
        switch (mathExp[1]) {
            case "+" -> System.out.println(Math.addExact(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case "*" -> System.out.println(Math.multiplyExact(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case "^" -> System.out.println(Math.pow(Integer.parseInt(mathExp[0]), Integer.parseInt(mathExp[2])));
            case "-" -> System.out.println(Float.parseFloat(mathExp[0]) - Float.parseFloat(mathExp[2]));
            case "/" -> System.out.println(Float.parseFloat(mathExp[0]) / Float.parseFloat(mathExp[2]));
            case "%" -> System.out.println(Float.parseFloat(mathExp[0]) % Float.parseFloat(mathExp[2]));
        }
    }
}
