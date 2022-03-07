/**
 * GeekBrains. Java 1. HomeWork#7
 *
 * @author Mikhail Orlov
 * @version 03.03.2022
 */



package ru.geekbrains.lesson7;

class HomeWorkN7 {
    public static void main (String [] args) {
        Cat[] cats = {
            new Cat("Musya",15), new Cat("Pushok", 10), new Cat("Vasily", 20)
        };
        Plate plate = new Plate (50, 30);
        System.out.println(plate);

        // feeding cats for the first time
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        // adding food to the plate
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        // feeding cats second time
        for (Cat cat : cats) {
            cat.setFullness(false); // make the cat hungry
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite; // ability to eat for 1 time
    private boolean fullness; // satiety status

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    @Override
    public String toString() {
        return "(name-" + name + ", appetie-" + appetite + ", fullness-" + fullness + ")";
    }
}

class Plate {
    private int maxVolume;
    private int food;

    Plate (int maxVolume, int food) {
        this.maxVolume = maxVolume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }
    @Override
    public String toString() {
        return "plate: " + food;
    }
}