package ru.arlen.lesson4.dogs;

/**
 * Бульдог
 *
 * @author galin-an
 */
public class DogBulldog extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пса никто не назвал
     */
    public DogBulldog(String name) {
        super(name);
    }
    @Override
    protected String getBreed() {
        return "Бульдог";
    }
}
