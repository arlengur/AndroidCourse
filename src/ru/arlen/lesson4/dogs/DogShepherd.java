package ru.arlen.lesson4.dogs;

/**
 * Овчарка
 *
 * @author galin-an
 */
public class DogShepherd extends Dog {
    /**
     * Конструктор для потомков, принимающий имя пса.
     *
     * @param name Имя животного, или {@code null}, если пса никто не назвал
     */
    public DogShepherd(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "Овчарка";
    }
}
