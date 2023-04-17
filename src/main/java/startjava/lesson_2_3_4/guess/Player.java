package startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];

    private int attempt;
    private boolean isPlayed = true;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        attempt++;
    }

    public int[] getNumbers() {
        return numbers;
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

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
