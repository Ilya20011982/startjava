package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String nickname;
    private String gender;
    private String color;
    private double weight;
    private int age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8 || age < 0) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sitDown() {
        System.out.println("sitting");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void run() {
        System.out.println("running");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}
