package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.Pizza;

/**
 * Завод по производству пиццы
 *
 * @author galin-an
 */
public abstract class PizzaStore {
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
