package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum = (int) (FROM_NUMBER + Math.random() * TO_NUMBER);

    static final int FROM_NUMBER = 1;

    static final int TO_NUMBER = 100;
    private final Player[] players;
    private static final int ROUND = 3;

    public GuessNumber(String names) {
        String[] arrStr = names.split(" ");
        players = new Player[arrStr.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(arrStr[i]);
        }
    }

    public void start() {
        System.out.println("Игроки кидают жребий");
        randomPermutation();
        for (Player value : players) {
            value.clear();
        }
        System.out.println("У каждого игрока по" + Player.CAPACITY + " попыток");
        int counter = 1;
        do {
            if (winner(players)) {
                break;
            }
            System.out.println("Начался " + counter + " раунд");
            for (Player player : players) {
                player.clearAfterRound();
            }
            oneRound();
            counter++;
            refreshHiddenNum();
        } while (counter <= ROUND);
        print();
    }

    private void oneRound() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isTrue = true;
            for (Player player : players) {
                if (player.isPlayed()) {
                    isTrue = false;
                    if (isGuessed(player, scanner)) {
                        player.setScore(player.getScore() + 1);
                        return;
                    } else {
                        continue;
                    }
                }
                if (isTrue) {
                    System.out.println("Попытки всех игроков закончились");
                    return;
                }
            }
        }
    }

    private void print() {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Массив игрока " + players[i].getName() + " ");
            for (int j = 0; j < players[i].getNumbers().length; j++) {
                System.out.print(players[i].getNumbers()[j] + " ");
            }
            System.out.println();
        }
    }

    private void inputNumber(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите число");
        try {
            player.addNumber(scanner.nextInt());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            inputNumber(player, scanner);
            return;
        }
        scanner.nextLine();
    }

    private boolean checkNumber(Player player, int number) {
        if (player.getNumbers()[player.notEmptyArrayElements() - 1] == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.notEmptyArrayElements() + " попытки");
            return true;
        } else if ((player.notEmptyArrayElements() - 1) == Player.CAPACITY - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки ввода чисел");
            player.setPlayed(false);
        }
        return false;
    }

    private boolean winner(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getScore() == 2) {
                System.out.println("Игрок " + players[i].getName() + " одержал победу в серии раундов, игра завершена");
                return true;
            }
        }
        return false;
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        if (player.isPlayed()) {
            inputNumber(player, scanner);
            if (checkNumber(player, hiddenNum)) {
                return true;
            }
            System.out.println("Вы ввели число" + (player.getNumbers()[player.notEmptyArrayElements() - 1] > hiddenNum ? " больше" : " меньше") +
                    " чем загадал компьютер");
        }
        return false;
    }

    private void randomPermutation() {
        Player tmp;
        for (int i = 0; i < players.length; i++) {
            int randomNumber = (int) (Math.random() * (players.length - 1));
            tmp = players[i];
            players[i] = players[randomNumber];
            players[randomNumber] = tmp;
        }
    }

    private void refreshHiddenNum() {
        hiddenNum = (int) (FROM_NUMBER + Math.random() * TO_NUMBER);
    }
}