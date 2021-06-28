package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String status;
    private String origin;
    private double height;
    private double weight;
    private double speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String status, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString() {
        return "\nTechnical Information\n" + "Model name - " + modelName + '\n' + "Mark - " + mark + '\n' + "Status - " + status + '\n'
        + "Origin - " + origin + '\n' + "\nJaeger Specifications\n" + "Height - " + height + '\n' + "Weight - " + weight
        + '\n' + "Speed - " + speed + '\n' + "Strength - " + strength + '\n' + "Armor - " + armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getStatus() {
        return status;
    }

    public String getOrigin() {
        return origin;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void drift() {
        System.out.println("drifting");
    }

    public void move() {
        System.out.println("moving");
    }

    public void scanKaiju() {
        System.out.println("scanning");
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }
}
