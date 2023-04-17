package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String responseContinue;
        boolean isContinue = true;
        do {
            if (isContinue) {
                System.out.print("Введите математическое выражение: ");
                calculator.setMathExpression(scanner.nextLine().split(" "));
                double result = calculator.calculate();
                if (result % 1 == 0) {
                    System.out.println((int) result);
                } else {
                    System.out.printf("%.3f\n", result);
                }
            }
            System.out.println("Вы желаете продолжить вычисления? <yes/no>");
            responseContinue = scanner.nextLine();
            if (!responseContinue.equals("yes") && !responseContinue.equals("no")) {
                isContinue = false;
            } else {
                isContinue = true;
            }
        } while (!responseContinue.equals("no"));
    }
}
