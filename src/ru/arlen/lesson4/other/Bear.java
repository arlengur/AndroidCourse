package ru.arlen.lesson4.other;

import ru.arlen.lesson4.Animal;
import ru.arlen.lesson4.Domesticated;

@Domesticated("дикий")
public class Bear extends Animal {
    /**
     * Конструктор для потомков, принимающий имя животного.
     *
     * @param name Имя животного, или {@code null}, если животное без имени
     */
    public Bear(String name) {
        super(name);
    }

    @Override
    protected String getTalk() {
        return "Эээ";
    }

    @Override
    protected String getBreed() {
        return null;
    }

    @Override
    protected String getSpecies() {
        return "Медведь";
    }
}
