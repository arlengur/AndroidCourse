package ru.arlen.lesson4;

import static ru.arlen.lesson4.State.AWAKEN;
import static ru.arlen.lesson4.State.DEAD;
import static ru.arlen.lesson4.State.SLEEPING;

/**
 * Базовый класс для животного.
 *
 * @author galin-an
 */
public abstract class Animal {
    private final String name;
    private State state;

    /**
     * Конструктор для потомков, принимающий имя животного.
     *
     * @param name Имя животного, или {@code null}, если животное без имени
     */
    public Animal(String name) {
        this.name = name;
        this.state = AWAKEN;
    }

    /**
     * Возвращает имя животного, потомки имеют возможность использовать свою реализацию
     *
     * @return Имя животного, по умолчанию — заданное в конструкторе
     */
    public String getName() {
        return name;
    }

    /**
     * Животное спит
     */
    public final void sleep() {
        state = SLEEPING;
    }

    /**
     * Животное проснулось
     */
    public final void awake() {
        if (state != DEAD)
            state = AWAKEN;
    }

    /**
     * Животное умирает
     */
    public final void die() {
        state = DEAD;
    }

    /**
     * Издать звук. Животное издаёт звуки если не спит и не умерло.
     */
    public final String talk() {
        if (state == AWAKEN) {
            return getTalk();
        }
        return "";
    }

    protected abstract String getTalk();

    /**
     * Возвращает породу животного
     *
     * @return Название породы
     */
    protected abstract String getBreed();

    /**
     * Возвращает биологический вид животного
     *
     * @return Имя биологического вида
     */
    protected abstract String getSpecies();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;

        if (state != animal.state && (state == DEAD || animal.state == DEAD)) return false;
        // Пропускаем sleeping, считаем спящее животное тем же самым

        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (state == DEAD ? 1 : 0);
        // В хэшкоде тоже пропускаем спячку
        return result;
    }

    @Override
    public String toString() {
        String name = getName();
        name = (name == null) ? "без имени" : name;

        String breed = getBreed();
        breed = (breed == null) ? "без породы" : breed;

        StringBuilder builder = new StringBuilder();
        builder.append(getSpecies())
                .append(" ")
                .append(breed)
                .append(" ")
                .append(name);

        return builder.toString();
    }
}
