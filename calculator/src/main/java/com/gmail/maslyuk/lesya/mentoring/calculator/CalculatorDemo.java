package com.gmail.maslyuk.lesya.mentoring.calculator;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in;

        String input = null;
        String operator = null;

        do {
            input = null;
            operator = null;

            double num1 = 0;
            do {
                printText("������ ������ �������:");

                in = new Scanner(System.in);
                //in.useDelimiter("\\n");
                input = in.next();
                try {
                    num1 = Double.parseDouble(input);
                    break;
                } catch (Exception e) {
                    printText("Error input !");
                }

                //printText("First operand = " + num1);
            } while (true);

            do {
                String operatorPattern = "+,-,*,/";
                printText("������ �������� (����� ����������, ��� ���'�� ('+,-,/,*')):");

                in = new Scanner(System.in);
                input = in.next();

                if (operatorPattern.contains(input)) {
                    //printText("Operator : " + input);
                    operator = input;
                    break;
                }
            } while (true);

            double num2 = 0;
            String operatorMem = "mr";
            do {
                printText("������ ������ ������� ��� ������ ���� � ���'�� ('mr'):");

                in = new Scanner(System.in);
                input = in.next();
                try {
                    num2 = Double.parseDouble(input);
                    break;
                } catch (Exception e) {
                    if (input.equals(operatorMem)) {
                        num2 = calculator.readFromMemory();
                        break;
                    }
                }

                //printText("Second operand = " + num2);
            } while (true);

            double result = 0;

            if (operator.equals("+")) {
                result = Calculator.add(num1, num2);
            } else if (operator.equals("-")) {
                result = Calculator.subtraction(num1, num2);
            } else if (operator.equals("/")) {
                result = Calculator.division(num1, num2);
            } else if (operator.equals("*")) {
                result = Calculator.multi(num1, num2);
            }

            printText("RESULT IS " + result);

            do {
                String memPattern = "m+,m-";
                printText("������/������ � ���'�� ('m+','m-'):");

                in = new Scanner(System.in);
                input = in.next();

                double inMem = 0;
                if (memPattern.contains(input)) {
                    if (input.equals("m+")) {
                        inMem = calculator.addToMemo(result);
                    } else if (input.equals("m-")) {
                        inMem = calculator.subtractFromMemo(result);
                    }
                    printText("In Memory : " + inMem);
                    break;
                }
            } while (true);

            printText("----------------------");
        } while (!input.equals("q"));

        in.close();
        printText("Bye");

    }

    private static void printText(String text) {
        System.out.println(text);
    }

}
