package ru.arlen.lesson3.ingredient;

/**
 * Абстрактный сыр
 *
 * @author galin-an
 */
public abstract class Cheese {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
