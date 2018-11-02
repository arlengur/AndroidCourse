package ru.arlen.lesson3.pizzastore;

import ru.arlen.lesson3.pizza.Pizza;

import java.util.concurrent.*;

/**
 * Завод по производству пиццы
 *
 * @author galin-an
 */
public abstract class PizzaStore {
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        box();

        return pizza;
    }

    public final void orderPizza(PizzaType type, int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            int finalI = i;
            executorService.submit(() -> {
                Pizza p = createPizza(type, finalI);
                p.prepare();
                p.bake();
                p.cut();
                latch.countDown();
                return p;
            });
        }
        try {
            latch.await();
            box(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Pizza createPizza(PizzaType type) {
        return createPizza(type, 0);
    }

    protected abstract Pizza createPizza(PizzaType type, int index);

    private void box() {
        System.out.println("Place 1 pizza in official box");
    }

    public void box(int count) {
        System.out.println("Place " + count + " pizzas in official box");
    }
}
