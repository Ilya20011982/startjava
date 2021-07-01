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
        this.numbers[attempt] = number;
    }

    public int getNumber(int attempt) {
        return numbers[attempt];
    }

    public String getNumbers(int attempt) {
        int[] result = Arrays.copyOf(numbers, attempt);
        return Arrays.toString(result).replaceAll("\\[|\\]|,", "");
    }

    public void resetNumbers(int attempt) {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}
