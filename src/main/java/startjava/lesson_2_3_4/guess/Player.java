package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    static final int CAPACITY = 10;
    private final int[] numbers = new int[CAPACITY];
    private boolean isPlayed = true;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, notEmptyArrayElements());
    }

    public void addNumber(int number) {
        if (number < GuessNumber.FROM_NUMBER || number > GuessNumber.TO_NUMBER) {
            throw new ArithmeticException("Вводимое число игроком должно быть больше нуля и меньше чем 100");
        }
        numbers[getNumbers().length] = number;
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

    public void setScore(int winRound) {
        this.score = winRound;
    }

    void clear() {
        Arrays.fill(numbers, 0, notEmptyArrayElements(), 0);
        score = 0;
    }

    void clearAfterRound() {
        Arrays.fill(numbers, 0, notEmptyArrayElements(), 0);
        isPlayed = true;
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
