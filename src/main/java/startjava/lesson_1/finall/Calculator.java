package startjava.lesson_1.finall;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 3;
        char mathSign = '^';
        int result = 0;
        boolean correctMathSign = true;
        if (mathSign == '+') {
            result = number1 + number2;
        } else if (mathSign == '-') {
            result = number1 - number2;
        } else if (mathSign == '*') {
            result = number1 * number2;
        } else if (mathSign == '/') {
            result = number1 / number2;
        } else if (mathSign == '%') {
            result = number1 % number2;
        } else if (mathSign == '^') {
            result = number1;
            for (int i = number2 - 1; i > 0; i--) {
                result *= number1;
            }
        } else {
            System.out.println(mathSign + " - такая операция не поддерживается");
            correctMathSign = false;
        }
        if (correctMathSign) {
            System.out.println(number1 + " " + mathSign + " " + number2 + " = " + result);
        }
    }
}
