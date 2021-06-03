import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            Calculator newSession = new Calculator();
            System.out.print("Введите первое число: ");
            newSession.setFirstNumber(in.nextDouble());
            System.out.print("Введите знак математической операции: ");
            newSession.setMathSign(in.next().charAt(0));
            System.out.print("Введите второе число: ");
            newSession.setSecondNumber(in.nextDouble());
            if (newSession.getMathSign() == '/' || newSession.getMathSign() == '%') {
                while (newSession.getSecondNumber() == 0) {
                    System.out.print("На 0 делить нельзя, введите второе число - ");
                    newSession.setSecondNumber(in.nextDouble());
                }
            }
            newSession.result(newSession.getFirstNumber(), newSession.getSecondNumber(), newSession.getMathSign());
            String answerUser = "";
            while(flag) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answerUser = in.next();
                if (answerUser.equals("yes")) break;
                if (answerUser.equals("no")) flag = false;
            }
        }
    }
}
