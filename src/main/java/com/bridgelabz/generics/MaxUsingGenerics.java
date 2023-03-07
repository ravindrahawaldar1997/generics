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

    public Float getMaxFloat(Float d, Float e, Float f) {
        Float maximum = d;
        if (e.compareTo(d) > 0) {
            maximum = e;
        }
        if(f.compareTo(e) > 0){
            maximum = f;
        }
        return maximum;
    }
    public String getMaxString(String g, String h, String i){
        String maximum = g;
        if(h.compareTo(g) >0){
            maximum = h;
        }
        if(i.compareTo(h) > 0){
            maximum = i;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Integer a = 10, b = 60, c = 20;
        System.out.println("Maximum Integer is " + new MaxUsingGenerics().getMaxInteger(a, b, c));
        Float d = 50.6f, e = 30.6f, f = 94.9f;
        System.out.println("Maximum Float is " + new MaxUsingGenerics().getMaxFloat(d, e, f));
        String g = "Apple", h = "Peach", i = "Banana";
        System.out.println("Maximum String is " + new MaxUsingGenerics().getMaxString(g, h, i));
    }
}

