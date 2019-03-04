package org.my.calculator;

public class CalculatorImp implements Сalculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public float devide(int a, int b) {
        return ((float)a)/b;
    }
}