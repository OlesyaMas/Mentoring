package com.gmail.maslyuk.lesya.mentoring.calculator;

public class Calculator {

    static double num1 = 0;
    static double num2 = 0;
    //double resultLine = 0;
    double resultMemory = 0;


    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double multi(double num1, double num2) {
        return num1 * num2;
    }


    public double addToMemo(double num) {
        return resultMemory = resultMemory + num;
    }

    public double subtractFromMemo(double num) {
        return resultMemory = resultMemory - num;
    }

    public double readFromMemory() {
        return resultMemory;
    }

   /* public static void reset() {
        num1 = 0;
        num2 = 0;
        operation = Operations.UNKNOWN;
    }*/

}
