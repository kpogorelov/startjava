package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private static final int ROUND_LIMIT = 3;
    static final int FROM_NUMBER = 1;

    static final int TO_NUMBER = 100;
    private final Player[] players;
    private int hiddenNum = refreshHiddenNum();

    public GuessNumber(String name) {
        String[] names = name.split(" ");
        players = new Player[names.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        System.out.println("Игроки кидают жребий");
        shufflePlayers();
        for (Player player : players) {
            player.clear();
        }
        System.out.println("У каждого игрока по" + Player.CAPACITY + " попыток");
        int counter = 1;
        do {
            if (winnerCheck(players)) {
                break;
            }
            System.out.println("Начался " + counter + " раунд");
            for (Player player : players) {
                player.clearAfterRound();
            }
            startRound();
            counter++;
            refreshHiddenNum();
        } while (counter <= ROUND_LIMIT);
        print();
    }

    private void shufflePlayers() {
        Player tmp;
        for (int i = 0; i < players.length; i++) {
            int randomNumber = (int) (Math.random() * (players.length - 1));
            tmp = players[i];
            players[i] = players[randomNumber];
            players[randomNumber] = tmp;
        }
    }

    private boolean winnerCheck(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getScore() == 2) {
                System.out.println("Игрок " + players[i].getName() + " одержал победу в серии раундов, игра завершена");
                return true;
            }
        }
        return false;
    }

    private void startRound() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isAttempts = true;
            for (Player player : players) {
                if (player.isPlayed()) {
                    isAttempts = false;
                    if (isGuessed(player, scanner)) {
                        player.setScore();
                        return;
                    }
                    continue;
                }
                if (isAttempts) {
                    System.out.println("Попытки всех игроков закончились");
                    return;
                }
            }
        }
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        if (player.isPlayed()) {
            inputNumber(player, scanner);
            if (checkNumber(player, hiddenNum)) {
                return true;
            }
            System.out.println("Вы ввели число" + (player.getNumbers()[player.getAttempt() - 1] > hiddenNum ? " больше" : " меньше") +
                    " чем загадал компьютер");
        }
        return false;
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
        if (player.getNumbers()[player.getAttempt() - 1] == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + player.getAttempt() + " попытки");
            return true;
        }
        if ((player.getAttempt() - 1) == Player.CAPACITY - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки ввода чисел");
            player.setPlayed(false);
        }
        return false;
    }

    private int refreshHiddenNum() {
        return hiddenNum = (int) (FROM_NUMBER + Math.random() * TO_NUMBER);
    }

    private void print() {
        for (Player player : players) {
            System.out.print("Массив игрока " + player.getName() + " ");
            for (int j = 0; j < player.getNumbers().length; j++) {
                System.out.print(player.getNumbers()[j] + " ");
            }
            System.out.println();
        }
    }
}