package ru.arlen.lesson4.cats;

/**
 * Персидская кошка
 *
 * @author galin-an
 */
public class CatPersian extends Cat {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public CatPersian(String name) {
        super(name);
    }

    @Override
    protected String getBreed() {
        return "Персидская";
    }


}
