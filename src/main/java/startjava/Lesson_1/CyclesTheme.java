package startjava.Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 20);
        System.out.println("В промежутке от [-10,21] сумма четных чисел = " + sumEvenNumbers + ", а нечетных = " +
                "" + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number2;
        int min = number2;
        if (number1 > max) {
            max = number1;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number1 < min) {
            min = number1;
        }
        if (number3 < min) {
            min = number3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number4 = 1234;
        int sum = 0;
        while (number4 > 0) {
            int remainder = number4 % 10;
            System.out.print(remainder);
            number4 /= 10;
            sum += remainder;
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter1 = 0;
        for (int i = 1; i < 24; i += 2) {
            if (counter1 % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", i);
            counter1++;
        }
        int zeros = (5 - counter1 % 5) % 5;
        for (int i = 0; i < zeros; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int randomNumber = 3222594;
        int count = 0;
        int copyRandomNumber = randomNumber;
        while (copyRandomNumber > 0) {
            if (copyRandomNumber % 10 == 2) {
                count++;
            }
            copyRandomNumber /= 10;
        }
        String isEvenNumber = "Четное";
        if (count % 2 != 0) {
            isEvenNumber = "Нечетное";
        }
        System.out.println("Число " + randomNumber + " содержит " + count + " (" + isEvenNumber + ") количество " +
                "двоек\n");

        System.out.print("6. Отображение фигур в консоли\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int countLines = 5;
        int countColumns = 5;
        while (countLines > 0) {
            if (countLines == 1) {
                System.out.println("#");
                countLines = countColumns - 1;
                countColumns--;
            }
            System.out.print("#");
            countLines--;
        }
        System.out.println("\n");

        countLines = 0;
        countColumns = 5;
        int maxLengthLines = 1;
        do {
            do {
                System.out.print("$");
                countLines++;
            } while (countLines < maxLengthLines);
            System.out.println();
            maxLengthLines++;
            countColumns--;
            countLines = 0;
        } while (countColumns > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.print("Dec\t" + "Char");
        for (int i = 1; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n%3d%3c", i, (char) i);
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 != 0) {
                System.out.printf("\n%3d%3c", i, (char) i);
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int number5 = 1234321;
        int copyNumber5 = number5;
        int reversed = 0;
        while (copyNumber5 > 0) {
            reversed = reversed * 10 + copyNumber5 % 10;
            copyNumber5 /= 10;
        }
        if (number5 == reversed) {
            System.out.println("Число является палиндромом\n");
        } else {
            System.out.println("Число не является палиндромом\n");
        }

        System.out.println("9. Определение, является ли число счастливым");
        int happyNumber = 134612;
        System.out.print("Число " + happyNumber);
        int rightSum = 0;
        int leftSum = 0;
        int happyCounter = 6;
        while (happyCounter > 0) {
            if (happyCounter > 3) {
                int rightSideNumber = happyNumber % 10;
                rightSum += rightSideNumber;
            } else {
                int leftSideNumber = happyNumber % 10;
                leftSum += leftSideNumber;
            }
            happyCounter--;
            happyNumber /= 10;
        }
        if (rightSum == leftSum) {
            System.out.println(" - счастливое");
        } else {
            System.out.println(" - несчастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
                for (int j = 2; j < 10; j++) {
                    System.out.printf("%3d", i * j);
                }
            }
            for (int k = 1; k < 10; k++) {
                if (i == 1) {
                    continue;
                }
                System.out.printf("%3d", i * k);
            }
            System.out.println();
        }
    }
}

