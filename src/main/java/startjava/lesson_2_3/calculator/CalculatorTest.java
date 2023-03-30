package startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String responseContinue;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите первое число:");
            calculator.setNumber1(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            calculator.setMathSign(scanner.nextLine().charAt(0));
            System.out.println("Введите второе число:");
            calculator.setNumber2(scanner.nextInt());
            scanner.nextLine();
            calculator.calculate();
            do {
                System.out.println("Вы желаете продолжить вычисления?<yes/no>");
                responseContinue = scanner.nextLine();
            } while (!responseContinue.equals("yes") && !responseContinue.equals("no"));
        } while (!responseContinue.equals("no"));
    }
}
