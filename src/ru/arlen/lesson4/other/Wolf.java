package ru.arlen.lesson4.other;

import ru.arlen.lesson4.Animal;
import ru.arlen.lesson4.Domesticated;

@Domesticated("дикий")
public class Wolf extends Animal {
    /**
     * Конструктор для потомков, принимающий имя животного.
     *
     * @param name Имя животного, или {@code null}, если животное без имени
     */
    public Wolf(String name) {
        super(name);
    }

    @Override
    protected String getTalk() {
        return "Ууу";
    }

    @Override
    protected String getBreed() {
        return null;
    }

    @Override
    protected String getSpecies() {
        return "Волк";
    }
}
