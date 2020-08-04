package ru.GeekBrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        if(appetite > p.getFood()) {
            System.out.println();
            System.out.println("Количество еды в миске не хватает:(");
            System.out.println("Сытость кошки " + name + " : " + fullness);
        }
        else {
            p.decreaseFood(appetite);
            fullness = true;
            System.out.println("Сытость кошки " + name + " : " + fullness);
        }
    }
}

