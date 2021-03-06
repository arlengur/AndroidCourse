package ru.arlen.lesson2;

import java.util.Arrays;

public class MyMath {

    private void printArr(int c, int d, int... a) {
        if (c > d) {
            System.out.println("Wrong interval c > d!");
            return;
        }
        if (a == null) {
            System.out.println("Array is null!");
            return;
        }
        long length = Arrays.stream(a).filter(val -> val >= c && val <= d).count();
        System.out.println(length);

    }

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.printArr(10, 9, 2, 3);
        myMath.printArr(2, 9, new int []{});
        myMath.printArr(2, 2, 2, 3);
        myMath.printArr(2, 9, null);
        myMath.printArr(2, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
