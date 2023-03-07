package com.bridgelabz.generics;

import java.util.Arrays;

public class MaxUsingGenerics<T> {

    public static <E extends Comparable> E getMaximum(E a, E b, E c) {
        E maximum = a;
        if (b.compareTo(a) > 0) {
            maximum = b;
        }
        if (c.compareTo(b) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);
        return maximum;
    }

    public static <T> void getMaximumMoreThanThree(T valueOne, T... args) {
        Arrays.sort(args);
        System.out.println("Maximum is " + args[args.length - 1]);
    }

    public static void main(String[] args) {
        Integer a = 10, b = 60, c = 20;
        getMaximum(a, b, c);
        Float d = 50.6f, e = 30.6f, f = 94.9f;
        getMaximum(d, e, f);
        String g = "Apple", h = "Peach", i = "Banana";
        getMaximum(g, h, i);
        getMaximumMoreThanThree(30, 40, 60, 20, 10);
    }
}

