package ru.arlen.lesson4;

public abstract class Dog extends Animal {
    public Dog() {
        type = "Собака";
    }

    @Override
    protected void talk() {
        if (state == State.awake) {
            System.out.println("Гав");
        }
    }
}
