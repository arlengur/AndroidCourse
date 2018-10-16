package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.Pizza;
import ru.arlen.lesson3.pizza.RussianCheesePizza;
import ru.arlen.lesson3.pizza.RussianPepperoniPizza;

public class RussianPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new RussianCheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new RussianPepperoniPizza();
        } else return null;
    }
}
