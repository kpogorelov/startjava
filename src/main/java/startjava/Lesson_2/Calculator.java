package startjava.Lesson_2;

public class Calculator {
    private char mathSign;
    private int firstNumber;
    private int secondNumber;
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void usedCalculator() {
        boolean correctMathSign = true;
        switch (mathSign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result = result * firstNumber;
                }
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
                correctMathSign = false;
        }
        if (correctMathSign) {
            System.out.println(firstNumber + " " + mathSign + " " + secondNumber + " = " + result);
        }
    }
}
