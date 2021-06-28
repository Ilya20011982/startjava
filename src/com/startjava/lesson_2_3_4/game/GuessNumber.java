package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNumber;
    private final Player firstPlayer;
    private final Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void launch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 0 до 100");
        Random random = new Random();
        randomNumber = random.nextInt(101);
        String winner;
        while (true) {
            System.out.print("Игрок " + firstPlayer.getName() + " введите число - ");
            firstPlayer.setNumber(in.nextInt());
            if (checkNumber(firstPlayer.getNumber())) {
                winner = firstPlayer.getName();
                break;
            }
            System.out.print("Игрок " + secondPlayer.getName() + " введите число - ");
            secondPlayer.setNumber(in.nextInt());
            if (checkNumber(secondPlayer.getNumber())) {
                winner = secondPlayer.getName();
                break;
            }
        }
        System.out.println("Выйграл игрок - " + winner + " угадавший число: " + randomNumber);
    }

    private boolean checkNumber(int number) {
        if (number == randomNumber) return true;
        String moreOrless = (number > randomNumber)? "БОЛЬШЕ":"МЕНЬШЕ";
        System.out.println("Ваше число " + moreOrless);
        return false;
    }
}
