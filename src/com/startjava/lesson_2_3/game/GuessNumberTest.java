package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Добро пожаловать в игру 'Угадай число'!"));

        System.out.print("Введите имя первого игрока - ");
        Player firstPlayer = new Player(in.next());

        System.out.print("Введите имя второго игрока - ");
        Player secondPlayer = new Player(in.next());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String playerAnswer = "yes";

        while("yes".equals(playerAnswer)) {
            game.launch();
            do {
                System.out.println("Хотите продолжить игру 'Угадай число'? [yes/no]: ");
                playerAnswer = in.next();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}


