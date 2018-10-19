package ru.arlen.lesson4.dogs;

/**
 * Мопс
 *
 * @author galin-an
 */
public class DogPug extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пса никто не назвал
     */
    public DogPug(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "Мопс";
    }
}
