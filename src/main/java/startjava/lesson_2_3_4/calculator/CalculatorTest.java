package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String responseContinue = "yes";
        do {
            if (responseContinue.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                try {
                    double result = Calculator.calculate(scanner.nextLine().split(" "));
                    System.out.println((result % 1 == 0) ? (int) result : (result % 1 != 0) ? result : "");
                } catch (ArithmeticException exception) {
                    System.out.println(exception.getMessage());
                    continue;
                }
            }
            System.out.println("Вы желаете продолжить вычисления? <yes/no>");
            responseContinue = scanner.nextLine();
        } while (!responseContinue.equals("no"));
    }
}
