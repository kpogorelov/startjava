package startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int length = numbers.length;

    private int attempt;
    private boolean isPlayed = true;
    private int winRound;

    public Player(String name) {
        this.name = name;
    }

    public int getWinRound() {
        return winRound;
    }

    public void setWinRound(int winRound) {
        this.winRound = winRound;
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
        if (number <= 0 || number > 100) {
            throw new ArithmeticException("Вводимое число игроком должно быть больше нуля и меньше чем 100");
        } else {
            attempt++;
            numbers[attempt - 1] = number;
        }
    }

    public int getLength() {
        return length;
    }

    public static void clear(Player[] players) {
        for (Player player : players) {
            Arrays.fill(player.numbers, 0, player.attempt, 0);
            player.attempt = 0;
            player.length = player.numbers.length;
            player.winRound = 0;
        }
    }

    static void print(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Массив игрока " + players[i].getName() + " ");
            for (int j = 0; j < players[i].getNumbers().length; j++) {
                System.out.print(players[i].getNumbers()[j] + " ");
            }
            System.out.println();
        }
    }

    public void inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите число");
        try {
            player.setNumber(scanner.nextInt());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            player.inputNumber(player, scanner);
            return;
        }
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

    public static void clearAfterRound(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            Arrays.fill(players[i].numbers, 0, players[i].attempt, 0);
            players[i].attempt = 0;
            players[i].isPlayed = true;
        }
    }
}
