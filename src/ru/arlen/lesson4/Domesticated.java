package ru.arlen.lesson4;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Domesticated {
    String value() default "домашний";
}
