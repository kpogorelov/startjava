package startjava.lesson_2_3_4.calculator;

public class Calculator {
    static double calculate(String mathExpression) {
        String[] arrayMathExpression = mathExpression.split(" ");
        if (!checkNumbers(arrayMathExpression)) {
            throw new ArithmeticException("Вводимые числа должны быть положительными и целыми");
        }
        int number1 = Integer.parseInt(arrayMathExpression[0]);
        char mathSign = arrayMathExpression[1].charAt(0);
        int number2 = Integer.parseInt(arrayMathExpression[2]);
     double result = switch (mathSign) {
         case '+' : yield number1 + number2;
         case '-' : yield number1 - number2;
         case '*' : yield number1 * number2;
         case '/' : yield (double) number1 / number2;
         case '%' : yield number1 % number2;
         case '^' : yield Math.pow(number1, number2);
         default:
             throw new IllegalStateException("Данная математическая операция не поддерживается: " + mathSign);
     };
     return result;
    }

    static void printResult(double result) {
        System.out.printf((result % 1 == 0) ? "%.0f" : "%.3f", result);
        System.out.println();
    }

    private static boolean checkNumbers(String[] mathExp) {
        if (Double.parseDouble(mathExp[0]) < 0 || Double.parseDouble(mathExp[2]) < 0 || Double.parseDouble(mathExp[0]) % 1 != 0
                || Double.parseDouble(mathExp[2]) % 1 != 0) {
            return false;
        }
        return true;
    }
}
