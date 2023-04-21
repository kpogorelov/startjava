package startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int length = numbers.length;

    private int attempt;
    private boolean isPlayed = true;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setNumber(int number) {
        attempt++;
        numbers[attempt - 1] = number;
    }

    public int getLength() {
        return length;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        isPlayed = true;
        attempt = 0;
        length = numbers.length;
    }

    static void print(Player player) {
        System.out.print("Массив игрока " + player.getName() + ": ");
        for (int playerNumber : player.getNumbers()) {
            System.out.print(playerNumber + " ");
        }
        System.out.println();
    }

    public void inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите число");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
    }

    public boolean checkNumber(Player player, int number) {
        if (player.getNumbers()[player.getAttempt() - 1] == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.getAttempt() + " попытки");
            return true;
        } else if ((player.getAttempt() - 1) == player.getLength() - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки ввода чисел");
            player.setPlayed(false);
        }
        return false;
    }
}
