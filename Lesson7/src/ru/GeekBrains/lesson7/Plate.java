package ru.GeekBrains.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addSomeEat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("How many Eat do you want to add? ");
        int n = scanner.nextInt();
        food += n;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
