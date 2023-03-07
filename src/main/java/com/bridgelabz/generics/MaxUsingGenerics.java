package com.bridgelabz.generics;

public class MaxUsingGenerics {
    public Integer getMaxInteger(Integer a, Integer b, Integer c) {
        Integer maximum = a;
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
        System.out.println("Maximum Integer is " + new MaxUsingGenerics().getMaxInteger(a, b, c));
    }
}

