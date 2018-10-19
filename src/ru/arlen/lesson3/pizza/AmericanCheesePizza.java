package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.*;

/**
 * Американская пицца с сыром
 *
 * @author galin-an
 */
public class AmericanCheesePizza extends Pizza {
    public AmericanCheesePizza() {
        super("American Cheese Pizza", new DoughThin(), new SauceMarinara(), new CheeseReggiano(),new String[]{"Mushroom", "RedPepper"});
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official American box");
    }
}
