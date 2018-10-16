package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseParmesan;
import ru.arlen.lesson3.ingredient.DoughThick;
import ru.arlen.lesson3.ingredient.SauceTomato;

public class RussianPepperoniPizza extends Pizza {
    public RussianPepperoniPizza() {
        name = "Russian Pepperoni Pizza";
        dough = new DoughThick();
        sauce = new SauceTomato();
        cheese =  new CheeseParmesan();
        veggies = new String[]{"Garlic", "Pepperoni"};
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
