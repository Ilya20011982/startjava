package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int attempt) {
        numbers[attempt] = number;
    }

    public int getNumber(int attempt) {
        return numbers[attempt];
    }

    public int[] getNumbers(int attempt) {
        return Arrays.copyOf(numbers, attempt);
    }

    public void resetNumbers(int attempt) {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}
