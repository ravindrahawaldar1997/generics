package com.bridgelabz.generics;

import java.util.Arrays;

public class MaxUsingGenerics<T extends Comparable> {
    T a, b, c;

    public MaxUsingGenerics(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public <E extends Comparable> E getMaximum(E a, E b, E c) {
        E maximum = a;
        if (b.compareTo(a) > 0) {
            maximum = b;
        }
        if (c.compareTo(b) > 0) {
            maximum = c;
        }
        return maximum;
    }
    public static <T> T getMaximumMoreThanThree(T valueOne, T... args) {
        Arrays.sort(args);
        return args[args.length-1];
    }
    public static void main(String[] args) {
        Integer a = 10, b = 60, c = 20;
        System.out.println("Maximum Integer is " + new MaxUsingGenerics(a, b, c).getMaximum(a, b, c));
        Float d = 50.6f, e = 30.6f, f = 94.9f;
        System.out.println("Maximum Float is " + new MaxUsingGenerics(d, e, f).getMaximum(d, e, f));
        String g = "Apple", h = "Peach", i = "Banana";
        System.out.println("Maximum String is " + new MaxUsingGenerics(g, h, i).getMaximum(g, h, i));
        System.out.println("Maximum For More Than Three " + MaxUsingGenerics.getMaximumMoreThanThree(30, 40, 60, 20, 10));
    }
}

