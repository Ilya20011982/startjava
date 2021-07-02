package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
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
            inputNum(firstPlayer);
            if (checkNumber(firstPlayer)) break;
            noTry(firstPlayer);

            inputNum(secondPlayer);
            if (checkNumber(secondPlayer)) break;
            noTry(secondPlayer);
        }
        System.out.println(firstPlayer.getName() + " " + Arrays.toString(firstPlayer.getNumbers(attempt)).replaceAll("\\[|\\]|,", ""));

        System.out.println(secondPlayer.getName() + " " + Arrays.toString(secondPlayer.getNumbers(attempt)).replaceAll("\\[|\\]|,", ""));

        firstPlayer.resetNumbers(attempt);
        secondPlayer.resetNumbers(attempt);
    }

    private void inputNum(Player player) {
        System.out.print("Игрок " + player.getName() + " введите число - ");
        Scanner in = new Scanner(System.in);
        player.setNumber(in.nextInt(), attempt);
    }

    private boolean checkNumber(Player player) {
        int number = player.getNumber(attempt);
        if (number == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber(attempt) +
                    " с " + (attempt + 1) + " попытки");
            return true;
        }
        String moreOrLess = (number > randomNumber) ? "БОЛЬШЕ" : "МЕНЬШЕ";
        System.out.println("Игрок " + player.getName() + " ваше число " + moreOrLess);
        return false;
    }

    private void noTry(Player player) {
        if (attempt == 9) System.out.println("У " + player.getName() + " закончились попытки");
    }
}
