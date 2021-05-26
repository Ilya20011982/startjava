import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число от 0 до 100 которое загадал компьютер - ");
        int number = in.nextInt();
        while (number != randomNumber) {
            if (number > randomNumber) {
                System.out.print("Ваше число БОЛЬШЕ, введите число - ");
            } else {
                System.out.print("Ваше число МЕНЬШЕ, введите число - ");
            }
            number = in.nextInt();
        }
        System.out.print("Вы угадали число - " + number);
    }
}
