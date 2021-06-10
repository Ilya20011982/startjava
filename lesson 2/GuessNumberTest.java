import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Добро пожаловать в игру 'Угадай число'!"));

        System.out.print("Введите имя первого игрока - ");
        Player firstPlayer = new Player(in.next());

        System.out.print("Введите имя второго игрока - ");
        Player secondPlayer = new Player(in.next());

        String playerAnswer = "yes";

        while ("yes".equals(playerAnswer)) {
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

            while (true) {
                game.insertNumber1();
                if (game.isNumber(firstPlayer.getNumber())) {
                    game.setWinner(firstPlayer.getName());
                    break;
                }
                game.insertNumber2();
                if (game.isNumber(secondPlayer.getNumber())) {
                    game.setWinner(secondPlayer.getName());
                    break;
                }
            }
            System.out.println("Выйграл игрок - " + game.getWinner());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                playerAnswer = in.next();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}

