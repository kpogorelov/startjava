package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String responseContinue = "yes";
        do {
            if (responseContinue.equals("yes")) {
                try {
                    System.out.print("Введите математическое выражение: ");
                    double result = Calculator.calculate(scanner.nextLine());
                    Calculator.printResult(result);
                } catch (ArithmeticException | IllegalStateException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
            System.out.println("Вы желаете продолжить вычисления? <yes/no>");
            responseContinue = scanner.nextLine();
        } while (!responseContinue.equals("no"));
    }
}
