package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "male";
    String name = "Sam";
    double height = 1.85;
    float weight = 80f;
    int age = 30;

    void move() {
        System.out.println("moving");
    }

    String sitDown() {
        return "sitting";
    }

    void run() {
        System.out.println("running");
    }

    String speak() {
        return "speaking";
    }

    void learn() {
        System.out.println("lerning Java");
    }
}
