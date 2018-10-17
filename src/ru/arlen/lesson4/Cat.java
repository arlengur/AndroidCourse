package ru.arlen.lesson4;

public abstract class Cat extends Animal {
    public Cat() {
        type = "Кошка";
    }

    @Override
    protected void talk() {
        if (state == State.awake) {
            System.out.println("Мяу");
        }
    }
}
