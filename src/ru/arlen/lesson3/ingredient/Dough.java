package ru.arlen.lesson3.ingredient;

/**
 * Абстрактное тесто
 *
 * @author galin-an
 */
public abstract class Dough {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
