package com.example.mybasicandroidcalculator;

import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;

public class Arithmetics {
    public float a;
    public float b;
    public static float addition(float a, float b) {
        return a + b;
    }
    public static float subtraction(float a, float b) {
        return a - b;
    }
    public static float multiplication(float a, float b) {
        return a * b;
    }
    public static float division(float a, float b) {
        if (b != 0) {
            return a / b;
        }
        else {
            return POSITIVE_INFINITY;
        }
    }
}
