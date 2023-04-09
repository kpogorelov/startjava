package startjava.lesson_2_3_4.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        int length;
        System.out.println("1. Реверс значений массива");
        int[] numbers = {7, 3, 5, 2, 4, 1, 6};
        length = numbers.length;
        System.out.println("Изначальное структура массива: ");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < (length - 1) / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = temp;
        }
        System.out.println("\nСтруктура массива после реверса: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        length = multipliers.length;
        int result = 1;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
            if (i > 0 && i < 9) {
                result *= i;
                System.out.print((i > 1 && i != 8) ? " * " + i : ((i == 8) ? " * " + i + " = " + result : i));
            } else {
                System.out.println("\n" + i + " индекс не участвует в вычислениях");
            }
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] numbers2 = new double[15];
        length = numbers2.length;
        int index = (length - 1) / 2;
        int counter = 0;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers2[i] = random.nextDouble();
        }
        System.out.println("Массив до обнуления ячеек: ");
        ArrayTheme.printArray(numbers2, index);
        for (int i = 0; i < length; i++) {
            if (numbers2[i] > numbers2[index]) {
                numbers2[i] = 0.0;
                counter++;
            }
        }
        System.out.println("Массив после обнуления ячеек: ");
        ArrayTheme.printArray(numbers2, index);
        System.out.println("\nКоличество обнуленных ячеек: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabetChars = new char[26];
        length = alphabetChars.length;
        for (int i = 0; i < length; i++) {
            alphabetChars[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            int count = (length - 2) - i;
            for (int j = 25; j > count; j--) {
                System.out.print(alphabetChars[j]);
            }
            count--;
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] numbers3 = new int[30];
        length = numbers3.length;
        for (int i = 0; i < length; i++) {
            while (true) {
                boolean isUnique = true;
                int randomNumber = 60 + (int) (Math.random() * 40);
                for (int j = 0; j < length; j++) {
                    if (randomNumber == numbers3[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    numbers3[i] = randomNumber;
                    break;
                }
            }
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers3[i] > numbers3[j]) {
                    int temp = numbers3[i];
                    numbers3[i] = numbers3[j];
                    numbers3[j] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (i <= 9) {
                System.out.printf("%3d", numbers3[i]);
                if (i == 9) {
                    System.out.println();
                }
            } else if (i <= 19) {
                System.out.printf("%3d", numbers3[i]);
                if (i == 19) {
                    System.out.println();
                }
            } else {
                System.out.printf("%3d", numbers3[i]);
            }
        }

        System.out.println("\n\n6. Копирование не пустых строк");
        String[] letters1 = {"FF", "G", ""};
        length = letters1.length;
        int counter2 = 0;
        int length1 = 0;
        int indexSrc = 0;
        int indexCopy = 0;
        for (int i = 0; i < length; i++) {
            if (letters1[i].isBlank()) {
                counter2++;
            }
        }
        String[] arrayCopy = new String[length - counter2];
        for (int i = 0; i < length; i++) {
            if (!letters1[i].isBlank()) {
                indexSrc = i - length1;
                length1++;
                for (int j = 0; j < arrayCopy.length; j++) {
                    if (arrayCopy[j] == null) {
                        indexCopy = j;
                        break;
                    }
                }
            } else {
                System.arraycopy(letters1, indexSrc, arrayCopy, indexCopy, length1);
                length1 = 0;
            }
        }
        System.out.println(Arrays.toString(arrayCopy));
    }

    private static void printArray(double[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i <= index) {
                System.out.printf("%,.3f ", array[i]);
                if (i == index) {
                    System.out.println();
                }
            } else {
                System.out.printf("%,.3f ", array[i]);
                if (i == array.length - 1) {
                    System.out.println("\n");
                }
            }
        }
    }
}
