package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.AmericanCheesePizza;
import ru.arlen.lesson3.pizza.AmericanPepperoniPizza;
import ru.arlen.lesson3.pizza.Pizza;

import static ru.arlen.lesson3.pizzastore.PizzaType.cheese;
import static ru.arlen.lesson3.pizzastore.PizzaType.pepperoni;

/**
 * Франшиза Америки на пиццу
 *
 * @author galin-an
 */
public class AmericanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type, int index) {
        if (type.equals(cheese)) {
            return new AmericanCheesePizza(index);
        }
        if (type.equals(pepperoni)) {
            return new AmericanPepperoniPizza(index);
        } else return null;
    }
}
