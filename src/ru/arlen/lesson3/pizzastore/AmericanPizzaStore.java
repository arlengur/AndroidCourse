package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.AmericanCheesePizza;
import ru.arlen.lesson3.pizza.AmericanPepperoniPizza;
import ru.arlen.lesson3.pizza.Pizza;

public class AmericanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new AmericanCheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new AmericanPepperoniPizza();
        } else return null;
    }
}
