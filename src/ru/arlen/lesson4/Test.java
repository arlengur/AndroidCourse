package ru.arlen.lesson4;

import ru.arlen.lesson4.cats.Cat;
import ru.arlen.lesson4.cats.CatPersian;
import ru.arlen.lesson4.cats.CatRussian;
import ru.arlen.lesson4.cats.CatSiamese;
import ru.arlen.lesson4.dogs.Dog;
import ru.arlen.lesson4.dogs.DogBulldog;
import ru.arlen.lesson4.dogs.DogPug;
import ru.arlen.lesson4.dogs.DogShepherd;

/**
 * @author galin-an
 */
public class Test {
    public static void main(String[] args) {
        Animal animals[]  = new Animal[] {
                new CatRussian("Барсик"),
                new CatPersian("Мурка"),
                new CatSiamese("Кузя"),

                new DogBulldog("Рекс"),
                new DogPug("Зевс"),
                new DogShepherd("Бой"),
                new DogShepherd(null)
        };

        for (Animal animal: animals) {
            System.out.print(animal + " - ") ;
            animal.talk();
        }

        System.out.println("\nПриключения кота:");
        Cat rusCat = new CatRussian("Мурзик");
        System.out.print(rusCat + " - ");
        rusCat.talk();

        System.out.print("Спит - ");
        rusCat.sleep();
        rusCat.talk();

        System.out.print("\nПроснулся - ");
        rusCat.awake();
        rusCat.talk();

        System.out.print("Умер - ");
        rusCat.die();
        rusCat.talk();

        System.out.println("\nБудить бесполезно - ");
        rusCat.awake();
        rusCat.talk();

        Dog dog1 = new DogBulldog("Верный");
        Dog dog2 = new DogBulldog("Верный");

        compareDogs(dog1, dog2);

        Dog dog3 = new DogShepherd("Барбос");

        compareDogs(dog1, dog3);

        // Одна бульдог умер
        dog2.die();
        compareDogs(dog1, dog2);
    }

    private static void compareDogs(Dog dog1, Dog dog2) {
        System.out.println();
        System.out.print(dog1);
        System.out.print(" и ");
        System.out.println(dog2);
        System.out.println("Одна и та же собака? " + (dog1.equals(dog2)? "Да" : "Нет"));

        dog1.sleep();
        System.out.println("А если спит? " + (dog1.equals(dog2)? "Да, всё равно одна собака" : "Нет, разные"));
        System.out.println("Хэшкоды: " + dog1.hashCode() + " и " + dog2.hashCode());
    }
}
