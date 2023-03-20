package startjava.Lesson_2;

public class Calculator {
    private char mathSign;
    private int number1;
    private int number2;
    private int result;

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void setNumber1(int firstNumber) {
        this.number1 = firstNumber;
    }

    public void setNumber2(int secondNumber) {
        this.number2 = secondNumber;
    }

    public void calculate() {
        boolean correctMathSign = true;
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
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result = result * number1;
                }
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
                return;
        }
            System.out.println(number1 + " " + mathSign + " " + number2 + " = " + result);
    }
}
