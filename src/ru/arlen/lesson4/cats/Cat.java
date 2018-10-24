package ru.arlen.lesson4.cats;

import ru.arlen.lesson4.Animal;
import ru.arlen.lesson4.Domesticated;

/**
 * Вид животного - кот
 *
 * @author galin-an
 */
@Domesticated
public abstract class Cat extends Animal {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public Cat(String name) {
        super(name);
    }

    @Override
    protected String getTalk() {
        return "Мяу!";
    }

    @Override
    protected String getSpecies() {
        return "Кошка";
    }
}
