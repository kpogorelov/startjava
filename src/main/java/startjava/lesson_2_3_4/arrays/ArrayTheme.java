package startjava.lesson_2_3_4.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {7, 3, 5, 2, 4, 1, 6};
        int length = numbers.length - 1;
        System.out.println("Изначальное структура массива: ");
        System.out.print(Arrays.toString(numbers));
        for (int i = 0; i < length; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length];
            numbers[length] = temp;
            length--;
        }
        System.out.println("\nСтруктура массива после реверса: ");
        System.out.print(Arrays.toString(numbers));

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        length = multipliers.length;
        int result = 1;
        int penultimateIndex = length - 2;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
            if (i > 0 && i < 9) {
                result *= i;
                System.out.print(i + ((i != penultimateIndex) ? " * " : " = " + result));
            } else {
                System.out.println(i + " индекс не участвует в вычислениях");
            }
            if (i == penultimateIndex) {
                System.out.println();
            }
        }

        System.out.println("\n3. Удаление элементов массива");
        double[] numbers2 = new double[15];
        Random random = new Random();
        length = numbers2.length;
        for (int i = 0; i < length; i++) {
            numbers2[i] = random.nextDouble();
        }
        int middleIndex = (length - 1) / 2;
        int deletedCount = 0;
        System.out.println("Массив до обнуления ячеек: ");
        print(numbers2, middleIndex);
        for (int i = 0; i < length; i++) {
            if (numbers2[i] > numbers2[middleIndex]) {
                numbers2[i] = 0.0;
                deletedCount++;
            }
        }
        System.out.println("\nМассив после обнуления ячеек: ");
        print(numbers2, middleIndex);
        System.out.println("Количество обнуленных ячеек: " + deletedCount);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            int count = (length - 2) - i;
            for (int j = length - 1; j > count; j--) {
                System.out.print(alphabet[j]);
            }
            count--;
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        length = uniqueNumbers.length;
        for (int i = 0; i < length; i++) {
            while (true) {
                boolean isUnique = true;
                int randomNumber = 60 + (int) (Math.random() * 40);
                for (int j = 0; j < length; j++) {
                    if (randomNumber == uniqueNumbers[j]) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    uniqueNumbers[i] = randomNumber;
                    break;
                }
            }
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (uniqueNumbers[i] > uniqueNumbers[j]) {
                    int temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }
        int strTransferCount = 0;
        for (int i = 0; i < length; i++) {
            strTransferCount++;
            System.out.printf("%3d", uniqueNumbers[i]);
            if (strTransferCount % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", "КК", "  ", "", "RW"};
        System.out.println("Изначальный массив: " + Arrays.toString(srcStrings));
        length = srcStrings.length;
        int emptyElements = 0;
        int lenCopyElements = 0;
        int indexSrc = 0;
        int indexCopy = 0;
        for (String letter : srcStrings) {
            if (letter.isBlank()) {
                emptyElements++;
            }
        }
        String[] destStrings = new String[length - emptyElements];
        for (int i = 0; i < length; i++) {
            while (true) {
                if (srcStrings[i].isBlank()) {
                    lenCopyElements = 0;
                } else {
                    indexSrc = i - lenCopyElements;
                    lenCopyElements++;
                    for (int j = 0; j < destStrings.length; j++) {
                        if (destStrings[j] == null) {
                            indexCopy = j;
                            break;
                        }
                    }
                    if (i == length - 1) {
                        System.arraycopy(srcStrings, indexSrc, destStrings, indexCopy, lenCopyElements);
                        break;
                    }
                    if (srcStrings[i + 1].isBlank()) {
                        System.arraycopy(srcStrings, indexSrc, destStrings, indexCopy, lenCopyElements);
                    }
                }
                break;
            }
        }
        System.out.println("Массив без пустых строк и пробелов: " + Arrays.toString(destStrings));
    }

    private static void print(double[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i <= index) {
                System.out.printf("%,.3f ", array[i]);
                if (i == index) {
                    System.out.println();
                }
            } else {
                System.out.printf("%,.3f ", array[i]);
                if (i == array.length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
