package ru.arlen.lesson3.pizza;

import ru.arlen.lesson3.ingredient.Cheese;
import ru.arlen.lesson3.ingredient.Dough;
import ru.arlen.lesson3.ingredient.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    String[] veggies;

    public void prepare() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
