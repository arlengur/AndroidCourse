package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseReggiano;
import ru.arlen.lesson3.ingredient.SauceMarinara;
import ru.arlen.lesson3.ingredient.DoughThin;

/**
 * Американская пицца с пепперони
 *
 * @author galin-an
 */
public class AmericanPepperoniPizza extends Pizza {
    public AmericanPepperoniPizza(int index) {
        super("American Pepperoni Pizza " + index, new DoughThin(), new SauceMarinara(), new CheeseReggiano(), new String[]{"Mushroom", "Pepperoni"});
    }
}
