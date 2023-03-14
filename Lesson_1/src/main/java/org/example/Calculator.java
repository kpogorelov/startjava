package org.example;

public class Calculator {
    public static void main(String[] args) {
        int firstDigit = 100;
        int secondDigit = 5;
        char operationChar = '*';
        if (operationChar == '+' || operationChar == '-' || operationChar == '*' || operationChar == '/'
                || operationChar == '^' || operationChar == '%') {
            if (operationChar == '+') {
                System.out.println(firstDigit + " " + operationChar + " " + secondDigit + " = " + (firstDigit + secondDigit));
            } else if (operationChar == '-') {
                System.out.println(firstDigit + " " + operationChar + " " + secondDigit + " = " + (firstDigit - secondDigit));
            } else if (operationChar == '*') {
                System.out.println(firstDigit + " " + operationChar + " " + secondDigit + " = " + (firstDigit * secondDigit));
            } else if (operationChar == '/') {
                System.out.println(firstDigit + " " + operationChar + " " + secondDigit + " = " + (firstDigit / secondDigit));
            } else if (operationChar == '%') {
                System.out.println(firstDigit + " " + operationChar + " " + secondDigit + " = " + (firstDigit % secondDigit));
            } else {
                System.out.print(firstDigit + " " + operationChar + " " + secondDigit + " = ");
                int copyFirstDigit = firstDigit;
                while (secondDigit - 1 > 0) {
                    firstDigit *= copyFirstDigit;
                    secondDigit--;
                }
                System.out.println(firstDigit);
            }
        } else {
            System.out.println("Неизвестный оператор для поля operationChar");
        }
    }
}
