package ru.arlen.lesson4;

public class Test {
    public static void main(String[] args) {
        Animal catRus = new CatRussian("Барсик");
        System.out.println(catRus);
        catRus.talk();
        System.out.println(new CatPersian("Мурка"));
        System.out.println(new CatSiamese("Кузя"));

        Animal dogBuldog = new DogBulldog("Рекс");
        Animal dogBuldog2 = new DogBulldog("Рекс");
        System.out.println(dogBuldog);
        dogBuldog.talk();
        dogBuldog.sleep();
        dogBuldog.talk();
        Animal dogPug = new DogPug("Рекс");
        System.out.println();
        System.out.println(new DogShepherd("Бой"));

        System.out.println(dogBuldog + " == " + dogBuldog2 + ": " + dogBuldog.equals(dogBuldog2));
        System.out.println(dogBuldog + " == " + dogPug + ": " + dogBuldog.equals(dogPug));
    }
}
