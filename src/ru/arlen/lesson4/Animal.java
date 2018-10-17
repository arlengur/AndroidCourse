package ru.arlen.lesson4;

import java.util.Objects;

enum State {sleep, awake, die}

public abstract class Animal {
    String name;
    String breed;
    String type;
    State state;

    public Animal() {
        this.state = State.awake;
    }

    protected abstract void talk();

    final void sleep() {
        state = State.sleep;
    }
    final void awake() {
        state = State.awake;
    }

    final void die() {
        state = State.die;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return type.equals(animal.type) && breed.equals(animal.breed) && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + breed.hashCode() + type.hashCode();
    }

    @Override
    public String toString() {
        return type + " " + breed + " " + name;
    }
}
