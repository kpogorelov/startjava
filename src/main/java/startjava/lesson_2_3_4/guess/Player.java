package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final int[] numbers = new int[CAPACITY];
    static final int CAPACITY = 10;
    private final String name;
    private boolean isPlayed = true;
    private int score;
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public void addNumber(int number) {
        if (number < GuessNumber.FROM_NUMBER || number > GuessNumber.TO_NUMBER) {
            throw new ArithmeticException("Вводимое число игроком должно быть больше нуля и меньше чем 100");
        }
        numbers[attempt] = number;
        attempt++;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        score++;
    }

    void clear() {
        Arrays.fill(numbers, 0, attempt, 0);
        score = 0;
        attempt = 0;
    }

    void clearAfterRound() {
        Arrays.fill(numbers, 0, attempt, 0);
        isPlayed = true;
        attempt = 0;
    }
}
