package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private int randomNumber;
    private int attempt;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void launch() {
        Random random = new Random();
        randomNumber = random.nextInt(101);

        System.out.println("Компьютер загадал число от 0 до 100.");
        System.out.println("У каждого игрока по 10 попыток чтобы угадать число.");

        for (attempt = 0; attempt < 10; attempt++) {
            getNum(firstPlayer);
            if (checkNumber(firstPlayer, firstPlayer.getNumber(attempt))) break;
            notAttempts(firstPlayer, attempt);

            getNum(secondPlayer);
            if (checkNumber(secondPlayer, secondPlayer.getNumber(attempt))) break;
            notAttempts(secondPlayer, attempt);
        }
        System.out.println(firstPlayer.getName() + " " + firstPlayer.getNumbers(attempt));
        System.out.println(secondPlayer.getName() + " " + secondPlayer.getNumbers(attempt));

        firstPlayer.resetNumbers(attempt);
        secondPlayer.resetNumbers(attempt);
    }
    private void getNum(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число - ");
        Scanner in = new Scanner(System.in);
        player.setNumber(in.nextInt(), attempt);
    }

    private boolean checkNumber(Player player, int number) {
        if (number == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(attempt) +
                    " с " + (attempt + 1) + " попытки");
            return true;
        }
        String moreOrLess = (number > randomNumber)? "БОЛЬШЕ":"МЕНЬШЕ";
        System.out.println("Игрок " + player.getName() + " ваше число " + moreOrLess);
        return false;
    }

    private void notAttempts(Player player, int attempt) {
        if (attempt == 9) System.out.println("У " + player.getName() + " закончились попытки");
    }
}
