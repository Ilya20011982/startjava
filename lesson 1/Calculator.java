import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        double firstNumber = in.nextDouble();
        System.out.print("Введите '+', '-', '*', '/', '^', '%'  - ");
        String operator = in.next();
        System.out.print("Введите второе число - ");
        double secondNumber = in.nextDouble();

        if (operator.equals("/") | operator.equals("%")) {
            while (secondNumber == 0) {
                System.out.print("На 0 делить нельзя, введите второе число - ");
                secondNumber = in.nextDouble();
            }
        }
        if (operator.equals("+")) System.out.println(firstNumber + secondNumber);
        if (operator.equals("-")) System.out.println(firstNumber - secondNumber);
        if (operator.equals("*")) System.out.println(firstNumber * secondNumber);
        if (operator.equals("/")) System.out.println(firstNumber / secondNumber);
        if (operator.equals("%")) System.out.println(firstNumber % secondNumber);
        if (operator.equals("^")) System.out.println(Math.pow(firstNumber, secondNumber));
    }
}
