package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String userAnswer = "yes";
        Scanner in = new Scanner(System.in);

        while ("yes".equals(userAnswer)) {
            Calculator calculator = new Calculator();
            System.out.print("Введите математическое выражение: ");
            calculator.setMathExp(in.nextLine());

            if (calculator.calc() != null) System.out.println(calculator.calc());
            else continue;

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = in.nextLine();
            } while (!"yes".equals(userAnswer) && !"no".equals(userAnswer));
        }
    }
}
