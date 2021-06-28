package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userAnswer = "yes";

        while ("yes".equals(userAnswer)) {
            Scanner in = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.print("Введите математическое выражение: ");
            calculator.setMathExp(in.nextLine());
            while (calculator.zeroDivision()) {
                System.out.print("На 0 делить нельзя, введите второе число - ");
                calculator.setSecondNumber(in.next());
            }
            calculator.calc();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = in.next();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
    }
}
