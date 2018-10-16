package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseReggiano;
import ru.arlen.lesson3.ingredient.SauceMarinara;
import ru.arlen.lesson3.ingredient.DoughThin;

public class AmericanPepperoniPizza extends Pizza {
    public AmericanPepperoniPizza() {
        name = "American Pepperoni Pizza";
        dough = new DoughThin();
        sauce = new SauceMarinara();
        cheese =  new CheeseReggiano();
        veggies = new String[]{"Mushroom", "Pepperoni"};
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official American box");
    }

}
