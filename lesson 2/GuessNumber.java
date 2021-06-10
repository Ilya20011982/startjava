import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final int randomNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private String winner;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer= secondPlayer;
        System.out.println("Компьютер загадал число от 0 до 100");
        Random random = new Random();
        randomNumber = random.nextInt(101);
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public boolean isNumber(int number) {
        if (randomNumber < number) {
            System.out.print("Ваше число БОЛЬШЕ, введите число - ");
            return false;
        }
        if (randomNumber > number) {
            System.out.print("Ваше число МЕНЬШЕ, введите число - ");
            return false;
        }
        System.out.println("Вы угадали число - " + number);
            return true;
    }

    public void insertNumber1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Игрок " + firstPlayer.getName() + " введите число - ");
        firstPlayer.setNumber(in.nextInt());
    }

    public void insertNumber2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Игрок " + secondPlayer.getName() + " введите число - ");
        secondPlayer.setNumber(in.nextInt());
    }
}
