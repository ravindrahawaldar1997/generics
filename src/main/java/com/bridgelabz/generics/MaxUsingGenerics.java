package com.bridgelabz.generics;

public class MaxUsingGenerics {
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

    public static void main(String[] args) {
        Integer a = 10, b = 60, c = 20;
        System.out.println("Maximum Integer is " + new MaxUsingGenerics().getMaximum(a, b, c));
        Float d = 50.6f, e = 30.6f, f = 94.9f;
        System.out.println("Maximum Float is " + new MaxUsingGenerics().getMaximum(d, e, f));
        String g = "Apple", h = "Peach", i = "Banana";
        System.out.println("Maximum String is " + new MaxUsingGenerics().getMaximum(g, h, i));
    }
}

