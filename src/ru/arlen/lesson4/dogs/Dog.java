package ru.arlen.lesson4.dogs;

import ru.arlen.lesson4.Animal;
import ru.arlen.lesson4.Domesticated;

/**
 * Вид животного - собака
 *
 * @author galin-an
 */
@Domesticated
public abstract class Dog extends Animal {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пса никто не назвал
     */
    public Dog(String name) {
        super(name);
    }

    @Override
    protected String getTalk() {
        return "Гав!";
    }

    @Override
    protected String getSpecies() {
        return "Собака";
    }
}
