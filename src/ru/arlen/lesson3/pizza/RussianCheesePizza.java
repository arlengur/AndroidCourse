package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseParmesan;
import ru.arlen.lesson3.ingredient.DoughThick;
import ru.arlen.lesson3.ingredient.SauceTomato;

/**
 * Русская пицца с сыром
 *
 * @author galin-an
 */
public class RussianCheesePizza extends Pizza {

    public RussianCheesePizza(int index) {
        super("Russian Cheese Pizza " + index, new DoughThick(), new SauceTomato(), new CheeseParmesan(), new String[]{"Garlic", "Cheese"});
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
