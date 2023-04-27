package startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private static final int LENGTH_ARRAY = 10;

    static final int ATTEMPTS_COUNT = LENGTH_ARRAY;
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
        return Arrays.copyOf(numbers, notEmptyArrayElements());
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public void setNumber(int number) {
        if (number <= 0 || number > 100) {
            throw new ArithmeticException("Вводимое число игроком должно быть больше нуля и меньше чем 100");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = number;
                return;
            }
        }
    }

    public static void clear(Player[] players) {
        for (Player player : players) {
            Arrays.fill(player.numbers, 0, player.notEmptyArrayElements(), 0);
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
        if (player.getNumbers()[player.notEmptyArrayElements() - 1] == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.notEmptyArrayElements() + " попытки");
            return true;
        } else if ((player.notEmptyArrayElements() - 1) == Player.LENGTH_ARRAY - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки ввода чисел");
            player.setPlayed(false);
        }
        return false;
    }

    public static void clearAfterRound(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            Arrays.fill(players[i].numbers, 0, players[i].notEmptyArrayElements(), 0);
            players[i].isPlayed = true;
        }
    }

    public int notEmptyArrayElements() {
        int notEmptyElem = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                notEmptyElem++;
            } else {
                break;
            }
        }
        return notEmptyElem;
    }
}
