package org.example;

public class CyclesTheme {
    int dec = 1;

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int lesserValue = -10;
        int evenNumber = 0;
        int oddNumber = 0;
        do {
            if (lesserValue % 2 == 0) {
                evenNumber += lesserValue;
            } else {
                oddNumber += lesserValue;
            }
            lesserValue++;
        } while (lesserValue <= 21);
        System.out.println("Сумма четных = " + evenNumber);
        System.out.println("Сумма нечетных = " + oddNumber);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        for (int i = max; i >= min; i--) {
            System.out.print(i + ", ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 5432;
        int divisorRemainder = 10;
        int divisor = 1;
        int counter = 1;
        int sum = (number % divisorRemainder) / divisor;
        while (counter <= 3) {
            divisorRemainder *= 10;
            divisor *= 10;
            int digitNumbers = (number % divisorRemainder) / divisor;
            sum += digitNumbers;
            System.out.print(digitNumbers + "\t");
            counter++;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("4. Вывод чисел на консоль в несколько строк");
        int j = 0;
        for (int i = 1; i < 24; i += 2) {
            if (j % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            j++;
        }
        int zeros = (5 - j % 5) % 5;
        for (int i = 0; i < zeros; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int randomNumber = 3222592;
        int tmp = randomNumber;
        int count = 0;
        int divisorRemainder1 = 10;
        int divisor1 = 1;
        String isEvenNumber = "Четное";
        while (tmp > 0) {
            int result = (randomNumber % divisorRemainder1) / divisor1;
            if (result == 2) {
                count++;
            }
            tmp -= result * divisor1;
            divisor1 *= 10;
            divisorRemainder1 *= 10;
        }
        if (count % 2 != 0) {
            isEvenNumber = "Нечетное";
        }
        System.out.println("Число " + randomNumber + " содержит " + count + " (" + isEvenNumber + ") количество двоек\n");

        System.out.print("6. Отображение фигур в консоли\n");
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int countLine = 5;
        int countColumn = 5;
        while (countLine > 0) {
            if (countLine == 1) {
                System.out.println("#");
                countLine = countColumn - 1;
                countColumn--;
            }
            System.out.print("#");
            countLine--;
        }
        System.out.println();
        int column = 5;
        int lines = 0;
        int maxCountLines = 3;
        boolean increment = true;
        int helper = 0;
        int helper2 = 2;
        do {
            if (increment) {
                for (int k = 0; k < maxCountLines; k++) {
                    for (int i = 0; i <= helper; i++) {
                        System.out.print("$");
                        lines++;
                    }
                    System.out.println();
                    helper++;
                }
                column -= helper;
                lines = 3;
            }
            if (!increment) {
                for (int k = 0; k < 2; k++) {
                    for (int i = 0; i < helper2; i++) {
                        System.out.print("$");
                    }
                    System.out.println();
                    helper2--;
                    column -= lines;
                }
            }
            if (lines >= maxCountLines) {
                increment = false;
            }
        } while (column > 0);

        System.out.println("7. Отображение ASCII-символов");
        boolean isChar = false;
        for (int i = 0; i <= 47; i++) {
            if (!isChar) {
                System.out.print("Dec\t");
                System.out.println("Char");
                isChar = true;
            }
            if (i % 2 != 0 && i != 0) {
                System.out.printf("%3d", i);
                System.out.printf("%4c\n", (char) (i));
            }
        }
        /*
        разделить число на цифры и складывать их в обратном пордке
        сравнить исходное с перевернутым
         */
        System.out.println("8. Проверка, является ли число палиндромом");
        int someNumber = 1234321;
        int temp = someNumber;
        int reversed = 0;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        if (someNumber == reversed) {
            System.out.println("Число является палиндромом");
        }

        System.out.println("9. Определение, является ли число счастливым");
        int happyNumber = 134611;
        int happyDivider1 = 1;
        int happyCounter = 0;
        int happyDivider2 = 10;
        int rightSum = 0;
        int leftSum = 0;
        while (happyCounter < 6) {
            if (happyCounter < 3) {
                int rightSideNumber = (happyNumber % happyDivider2) / happyDivider1;
                rightSum += rightSideNumber;
            } else {
                int leftSideNumber = (happyNumber % happyDivider2) / happyDivider1;
                leftSum += leftSideNumber;
            }
            happyCounter++;
            happyDivider1 *= 10;
            happyDivider2 *= 10;
        }
        if (rightSum == leftSum) {
            System.out.println("Число " + happyNumber + " - счастиливое");
        }

        System.out.println("10. Вывод таблицы умножения Пифагора");
        for (int k = 1; k <= 9; k++) {
            System.out.printf("%2d", k);
            for (int i = 2; i <= 9; i++) {
                System.out.printf("%3d", i * k);
            }
            System.out.println();
        }
    }
}

