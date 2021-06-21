package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf firstWolf = new Wolf();

        firstWolf.setNickname("Akela");
        System.out.println("Nickname - " + firstWolf.getNickname());

        firstWolf.setAge(9);
        firstWolf.setAge(-1);
        firstWolf.setAge(5);
        System.out.println("Age - " + firstWolf.getAge());

        firstWolf.setColor("white");
        System.out.println("Color - " + firstWolf.getColor());

        firstWolf.setGender("male");
        System.out.println("Gender - " + firstWolf.getGender());

        firstWolf.setWeight(50.5);
        System.out.println("Weight - " + firstWolf.getWeight());

        firstWolf.walk();
        firstWolf.sitDown();
        firstWolf.run();
        firstWolf.howl();
        firstWolf.hunt();
    }
}
