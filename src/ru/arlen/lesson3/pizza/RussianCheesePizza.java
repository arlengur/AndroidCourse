package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.CheeseParmesan;
import ru.arlen.lesson3.ingredient.DoughThick;
import ru.arlen.lesson3.ingredient.SauceTomato;

import java.sql.SQLOutput;

public class RussianCheesePizza extends Pizza {

    public RussianCheesePizza() {
        name = "Russian Cheese Pizza";
        dough = new DoughThick();
        sauce = new SauceTomato();
        cheese =  new CheeseParmesan();
        veggies = new String[]{"Garlic", "Cheese"};
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
