package ru.arlen.lesson3;

import ru.arlen.lesson3.pizzastore.AmericanPizzaStore;
import ru.arlen.lesson3.pizzastore.PizzaStore;
import ru.arlen.lesson3.pizzastore.RussianPizzaStore;

import static ru.arlen.lesson3.pizzastore.PizzaType.cheese;
import static ru.arlen.lesson3.pizzastore.PizzaType.pepperoni;

public class Test {
    public static void main(String[] args) {
        PizzaStore russianPizzaStore = new RussianPizzaStore();
        russianPizzaStore.orderPizza(cheese);
        System.out.println();
        PizzaStore americanPizzaStore = new AmericanPizzaStore();
        americanPizzaStore.orderPizza(pepperoni);
    }
}
