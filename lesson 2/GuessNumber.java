import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private String playerAnswer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer= secondPlayer;
        playerAnswer = "yes";
    }

    public String getPlayerAnswer() {
        return playerAnswer;
    }

    public void setPlayerAnswer(String playerAnswer) {
        this.playerAnswer = playerAnswer;
    }

    public boolean isNumber(int number) {
        if (randomNumber < number) {
            System.out.println("Ваше число БОЛЬШЕ");
            return false;
        }
        if (randomNumber > number) {
            System.out.println("Ваше число МЕНЬШЕ");
            return false;
        }
        System.out.println("Вы угадали число - " + number);
            return true;
    }

    public void gameLauncher() {
        Scanner in = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 0 до 100");
        Random random = new Random();
        randomNumber = random.nextInt(101);
        String winner;
        while (true) {
             System.out.print("Игрок " + firstPlayer.getName() + " введите число - ");
             firstPlayer.setNumber(in.nextInt());
            if (isNumber(firstPlayer.getNumber())) {
                winner = firstPlayer.getName();
                break;
            }
             System.out.print("Игрок " + secondPlayer.getName() + " введите число - ");
             secondPlayer.setNumber(in.nextInt());
            if (isNumber(secondPlayer.getNumber())) {
                winner = secondPlayer.getName();
                break;
            }
         }
         System.out.println("Выйграл игрок - " + winner);
    }
}

