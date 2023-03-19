package startjava.Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String responseContinue = "";
        while (true) {
            if (responseContinue.equals("no")) {
                break;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            calculator.setFirstNumber(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            calculator.setMathSign(scanner.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setSecondNumber(scanner.nextInt());
            scanner.nextLine();
            calculator.usedCalculator();
            System.out.println("Вы желаете продолжить вычисления?<yes/no>");
            responseContinue = scanner.nextLine();
            while (!responseContinue.equals("yes") || !responseContinue.equals("no")) {
                if (responseContinue.equals("yes")) {
                    break;
                } else if (responseContinue.equals("no")) {
                    scanner.close();
                    break;
                } else {
                    System.out.println("Вы желаете продолжить вычисления?[yes/no]");
                    responseContinue = scanner.nextLine();
                }
            }
        }
    }
}
