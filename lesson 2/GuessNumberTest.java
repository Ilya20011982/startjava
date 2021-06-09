import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Добро пожаловать в игру 'Угадай число'!"));

        System.out.println("Введите имя первого игрока - ");
        Player firstPlayer = new Player(in.next());

        System.out.println("Введите имя второго игрока - ");
        Player secondPlayer = new Player(in.next());

        String playerAnswer = "yes";

        while ("yes".equals(playerAnswer)) {
            System.out.println("Компьютер загадал число от 0 до 100");
            GuessNumber game = new GuessNumber();

            while (true) {
                System.out.println("Игрок " + firstPlayer.getName() + " введите число - ");
                firstPlayer.setNumber(in.nextInt());
                if (game.isNumber(firstPlayer.getNumber())) {
                    game.setNameWinner(firstPlayer.getName());
                    break;
                }
                System.out.println("Игрок " + secondPlayer.getName() + " введите число - ");
                secondPlayer.setNumber(in.nextInt());
                if (game.isNumber(secondPlayer.getNumber())) {
                    game.setNameWinner(secondPlayer.getName());
                    break;
                }
            }
            System.out.println("Выйграл игрок - " + game.getNameWinner());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                playerAnswer = in.next();
            }
            while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}

