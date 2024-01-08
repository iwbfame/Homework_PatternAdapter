package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.mult(5,10));
        System.out.println(calc.pow(10,5));
        System.out.println(calc.sum(100,222));
    }
}