package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String responseContinue = "yes";
        do {
            if (responseContinue.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scanner.nextLine().split(" "));
                if (result % 1 == 0) {
                    System.out.println((int) result);
                } else {
                    System.out.printf("%.3f\n", result);
                }
            }
            System.out.println("Вы желаете продолжить вычисления? <yes/no>");
            responseContinue = scanner.nextLine();
        } while (!responseContinue.equals("no"));
    }
}
