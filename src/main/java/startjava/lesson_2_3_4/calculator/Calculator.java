package startjava.lesson_2_3_4.calculator;

public class Calculator {
    private char mathSign;
    private int number1;
    private int number2;
    private String[] mathExpression = new String[3];

    public void setMathExpression(String[] mathExpression) {
        this.mathExpression = mathExpression;
        number1 = Integer.parseInt(mathExpression[0]);
        number2 = Integer.parseInt(mathExpression[2]);
        mathSign = mathExpression[1].charAt(0);
    }

    public double calculate() {
        double result = 0;
        switch (mathSign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = (double) number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
                result = Math.pow(number1, number2);
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
                return Double.NaN;
        }
        return result;
    }
}
