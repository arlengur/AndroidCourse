package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.*;

/**
 * Американская пицца с сыром
 *
 * @author galin-an
 */
public class AmericanCheesePizza extends Pizza {
    public AmericanCheesePizza(int index) {
        super("American Cheese Pizza " + index, new DoughThin(), new SauceMarinara(), new CheeseReggiano(), new String[]{"Mushroom", "RedPepper"});
    }
}
