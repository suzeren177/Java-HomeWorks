/**
 * GeekBrains. Java 1. HomeWork#6
 *
 * @author Mikhail Orlov
 * @version 27.02.2022
 */

package ru.geekbrains.lesson6;

class HomeWorkN6 {
    public static void main (String[] args) {
        Animal[] animals = {
            Cat cat(200, 0);
            Dog dog (500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(180));
            System.out.println(animal.run(350));
            System.out.println(animal.run(520));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(9));
        }
        System.out.println("Animals made: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {

    Dog(int runLimit, int swimLimit) {
        super(swimLimit, runLimit);
    }
}

class Cat extends Animal {

        Cat(int runLimit) {
            super(runLimit, -1);
        }

    @Override
    public String swim(int distance) {
        return getClassName() + " unable to swim";
    }
}

abstract class Animal implements IAnimal{
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;


    Animal (int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass() .getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run (int distance) {
        if (distance > runLimit) {
            return className + " unable to ran " + distance;
        } else {
            return className + " can swim " + distance;
        }
    }

    @Override
    public String run (int distance) {
        if (distance > swimLimit) {
            return className + " unable to swim " + distance;
        } else {
            return className + " can swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    String run (int distance);
    String swim (int distance);
}
