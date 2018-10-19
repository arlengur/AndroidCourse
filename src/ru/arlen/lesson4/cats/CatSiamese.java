package ru.arlen.lesson4.cats;

/**
 * Сиамская кошка
 *
 * @author galin-an
 */
public class CatSiamese extends Cat {
    /**
     * Конструктор для потомков, принимающий имя кота.
     *
     * @param name Имя животного, или {@code null}, если кота никто не назвал
     */
    public CatSiamese(String name) {
        super(name);
    }
    @Override
    protected String getBreed() {
        return "Сиамская";
    }
}
