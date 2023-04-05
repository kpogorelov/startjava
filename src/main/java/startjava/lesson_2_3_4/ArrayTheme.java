package startjava.lesson_2_3_4;
import java.util.Arrays;
public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {7, 3, 5, 2, 4, 1, 6};
        System.out.println("Изначальное структура массива: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        for (int i = 0; i < (numbers.length - 1) / 2; i++) {
            int temps;
            temps = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temps;
        }
        System.out.println("\nСтруктура массива после реверса: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numbers1 = new int[10];
        int result = 1;
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = i;
            if (i > 0 && i < 9) {
                if (i == 1) {
                    System.out.print(i);
                }
                result *= i;
                System.out.print((i > 1) ? " * " + i : "");
            }
        }
        System.out.print(" = " + result);

        System.out.println("\n\n3. Удаление элементов массива");
        double[] numbers2 = new double[15];
        int index = (numbers2.length - 1) / 2;
        int counter = 0;
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = Math.round((Math.random() * 1) * 1000.0) / 1000.0;
        }
        System.out.println("Массив до обнуления ячеек: ");
        ArrayTheme.printArray(numbers2, index);
        System.out.println("\n");
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > numbers2[index]) {
                numbers2[i] = 0.0;
                counter++;
            }
        }
        System.out.println("Массив после обнуления ячеек: ");
        ArrayTheme.printArray(numbers2, index);
        System.out.println("\nКоличество обнуленных ячеек: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        for (int i = 65, j = 0; j < 26; j++, i++) {
            letters[j] = (char) i;
        }
        int count = 24;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 25; j > count; j--) {
                System.out.print(letters[j]);
            }
            count--;
            System.out.println();
        }

        System.out.println("5. Генерация уникальных чисел");
        int[] numbers3 = new int[30];
        for (int i = 0; i < numbers3.length; i++) {
            while (true) {
                boolean isUnique = true;
                int randomNumber = 60 + (int) (Math.random() * 40);
                for (int j = 0; j < numbers3.length; j++) {
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
        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] > numbers3[j]) {
                    int temp = numbers3[i];
                    numbers3[i] = numbers3[j];
                    numbers3[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers3));
        for (int i = 0; i < numbers3.length; i++) {
            if (i <= 9) {
                System.out.printf("%3d", numbers3[i]);
                if (i == 9) {
                    System.out.println();
                }
            } else if (i > 9 && i <= 19) {
                System.out.printf("%3d", numbers3[i]);
                if (i == 19) {
                    System.out.println();
                }
            } else {
                System.out.printf("%3d", numbers3[i]);
            }
        }
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
            }
        }
    }
}
