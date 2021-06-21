package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        double firstNumber = in.nextDouble();
        System.out.print("Введите '+', '-', '*', '/', '^', '%'  - ");
        char mathSign = in.next().charAt(0);
        System.out.print("Введите второе число - ");
        double secondNumber = in.nextDouble();

        if (mathSign == '/' || mathSign == '%') {
            while (secondNumber == 0) {
                System.out.print("На 0 делить нельзя, введите второе число - ");
                secondNumber = in.nextDouble();
            }
        }
        if (mathSign == '+') System.out.println(firstNumber + secondNumber);
        if (mathSign == '-') System.out.println(firstNumber - secondNumber);
        if (mathSign == '*') System.out.println(firstNumber * secondNumber);
        if (mathSign == '/') System.out.println(firstNumber / secondNumber);
        if (mathSign == '%') System.out.println(firstNumber % secondNumber);
        if (mathSign == '^') {
            double result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        }
    }
}
