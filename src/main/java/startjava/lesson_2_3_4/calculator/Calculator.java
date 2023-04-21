package startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] arrayMathExpression = mathExpression.split(" ");
        final int number1 = Integer.parseInt(arrayMathExpression[0]);
        final char mathSign = arrayMathExpression[1].charAt(0);
        final int number2 = Integer.parseInt(arrayMathExpression[2]);
        switch (mathSign) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return (double) number1 / number2;
            case '%':
                return number1 % number2;
            case '^':
                return Math.pow(number1, number2);
            default:
                System.out.println("Введенная математическая операция не поддерживается");
                return Double.NaN;
        }
    }
    static void printResult(double result) {
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.printf("%.3f\n", result);
        }
    }
}
