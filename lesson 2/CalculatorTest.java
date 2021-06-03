import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userAnswer = "yes";

        while (userAnswer.equals("yes")) {
            Calculator calculator = new Calculator();

            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(in.nextDouble());

            System.out.print("Введите знак математической операции: ");
            calculator.setMathSign(in.next().charAt(0));

            System.out.print("Введите второе число: ");
            while (calculator.setSecondNumber(in.nextDouble())) {
                    System.out.print("На 0 делить нельзя, введите второе число - ");
                }

            calculator.getResult();

            while(userAnswer.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = in.next();
                if (userAnswer.equals("yes") || userAnswer.equals("no")) break;
            }
        }
    }
}
