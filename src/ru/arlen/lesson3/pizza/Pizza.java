package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.Cheese;
import ru.arlen.lesson3.ingredient.Dough;
import ru.arlen.lesson3.ingredient.Sauce;

/**
 * Абстрактный класс пиццы
 *
 * @author galin-an
 */
public abstract class Pizza {
    private final String name;
    private final Dough dough;
    private final Sauce sauce;
    private final Cheese cheese;
    private final String[] veggies;

    public Pizza(String name, Dough dough, Sauce sauce, Cheese cheese, String[] veggies) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.veggies = veggies;
    }

    public final void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing: " + dough);
        System.out.println("Adding: " + sauce);
        System.out.println("Adding: " + cheese);
        System.out.print("Adding veggies:");
        for (String veggie : veggies) {
            System.out.print(" " + veggie);
        }
        System.out.println();
    }

    public void bake() {
        System.out.println("Bake for 25 min at 350 degree");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official box");
    }

}
