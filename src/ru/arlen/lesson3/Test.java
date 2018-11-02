package ru.arlen.lesson3;

import ru.arlen.lesson3.pizzastore.AmericanPizzaStore;
import ru.arlen.lesson3.pizzastore.PizzaStore;
import ru.arlen.lesson3.pizzastore.RussianPizzaStore;

import java.util.concurrent.TimeUnit;

import static ru.arlen.lesson3.pizzastore.PizzaType.cheese;
import static ru.arlen.lesson3.pizzastore.PizzaType.pepperoni;

public class Test {
    public static void main(String[] args) {
        PizzaStore russianPizzaStore = new RussianPizzaStore();
        long start = System.nanoTime();
        russianPizzaStore.orderPizza(cheese, 5);
        long end = System.nanoTime();
        System.out.println("It takes " + TimeUnit.MILLISECONDS.convert(end-start, TimeUnit.NANOSECONDS) + " ms\n");

        PizzaStore americanPizzaStore = new AmericanPizzaStore();
        start = System.nanoTime();
        americanPizzaStore.orderPizza(pepperoni);
        americanPizzaStore.box(0);
        end = System.nanoTime();
        System.out.println("It takes " + TimeUnit.MILLISECONDS.convert(end-start, TimeUnit.NANOSECONDS) + " ms\n");

    }
}
