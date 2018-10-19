package ru.arlen.lesson3.ingredient;

/**
 * Абстрактный соус
 *
 * @author galin-an
 */
public abstract class Sauce {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
