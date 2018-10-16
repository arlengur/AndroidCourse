package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.*;

public class AmericanCheesePizza extends Pizza {
    public AmericanCheesePizza() {
        name = "American Cheese Pizza";
        dough = new DoughThin();
        sauce = new SauceMarinara();
        cheese =  new CheeseReggiano();
        veggies = new String[]{"Mushroom", "RedPepper"};
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official American box");
    }
}
