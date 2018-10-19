package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseParmesan;
import ru.arlen.lesson3.ingredient.DoughThick;
import ru.arlen.lesson3.ingredient.SauceTomato;

/**
 * Русская пицца с пепперони
 *
 * @author galin-an
 */
public class RussianPepperoniPizza extends Pizza {
    public RussianPepperoniPizza() {
        super("Russian Pepperoni Pizza", new DoughThick(), new SauceTomato(), new CheeseParmesan(), new String[]{"Garlic", "Pepperoni"});
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
