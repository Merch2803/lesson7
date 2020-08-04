package ru.GeekBrains.lesson7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(25);

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Kitty", 7, false);
        cat[1] = new Cat("Black", 6, false);
        cat[2] = new Cat("White", 4, false);
        cat[3] = new Cat("Gray", 7, false);
        cat[4] = new Cat("Shadow", 4, false);

        for(int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        plate.addSomeEat();

        Cat cat2 = new Cat("Merch", 15, false);
        cat2.eat(plate);
    }
}