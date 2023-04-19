package startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static char mathSign;
    private static int number1;
    private static int number2;

    public static double calculate(String[] mathExpression) {
        for (int i = 0; i < mathExpression.length; i++) {
            if (i == 1) {
                continue;
            }
            if (Double.parseDouble(mathExpression[i]) < 0 || Double.parseDouble(mathExpression[i]) % 1 != 0) {
                throw new ArithmeticException("Вводимые числа должны быть положительными и целыми");
            }
        }
        number1 = Integer.parseInt(mathExpression[0]);
        mathSign = mathExpression[1].charAt(0);
        number2 = Integer.parseInt(mathExpression[2]);
        double result =
                switch (mathSign) {
                    case '+':
                        yield number1 + number2;
                    case '-':
                        yield number1 - number2;
                    case '*':
                        yield number1 * number2;
                    case '/':
                        yield (double) number1 / number2;
                    case '%':
                        yield number1 % number2;
                    case '^':
                        yield Math.pow(number1, number2);
                    default:
                        System.out.println("Введенная математическая операция не поддерживается");
                        yield Double.NaN;
                };
        return result;
    }
}
