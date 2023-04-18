package startjava.lesson_2_3_4.calculator;

public class Calculator {
    private char mathSign;
    private int number1;
    private int number2;

    public double calculate(String[] mathExpression) {
        number1 = Integer.parseInt(mathExpression[0]);
        mathSign = mathExpression[1].charAt(0);
        number2 = Integer.parseInt(mathExpression[2]);
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
}
