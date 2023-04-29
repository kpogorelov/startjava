package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    static final int LENGTH_ARRAY = 10;
    private final int[] numbers = new int[LENGTH_ARRAY];

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
        if (number <= GuessNumber.FROM_NUMBER - 1 || number > GuessNumber.TO_NUMBER) {
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
