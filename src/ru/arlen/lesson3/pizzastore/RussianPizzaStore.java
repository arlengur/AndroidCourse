package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.Pizza;
import ru.arlen.lesson3.pizza.RussianCheesePizza;
import ru.arlen.lesson3.pizza.RussianPepperoniPizza;

import static ru.arlen.lesson3.pizzastore.PizzaType.cheese;
import static ru.arlen.lesson3.pizzastore.PizzaType.pepperoni;

/**
 * Франшиза России на пиццу
 *
 * @author galin-an
 */
public class RussianPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type, int index) {
        if (type.equals(cheese)) {
            return new RussianCheesePizza(index);
        }
        if (type.equals(pepperoni)) {
            return new RussianPepperoniPizza(index);
        } else return null;
    }
}
