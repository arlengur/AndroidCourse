package ru.arlen.lesson4.cats;

/**
 * Русская кошка
 *
 * @author galin-an
 */
public class CatRussian extends Cat {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public CatRussian(String name) {
        super(name);
    }
    @Override
    protected String getBreed() {
        return "Русская";
    }
}
