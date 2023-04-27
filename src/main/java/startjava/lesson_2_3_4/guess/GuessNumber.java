package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Player[] players;
    private int round;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        round = 1;
        System.out.println("Игроки кидают жребий");
        randomPermutation();
        Player.clear(players);
        System.out.println("У каждого игрока по" + Player.ATTEMPTS_COUNT + " попыток");
        do {
            if (winner(players)) {
                break;
            }
            hiddenNum = (int) (1 + Math.random() * 100);
            System.out.println("Начался " + round + " раунд");
            Player.clearAfterRound(players);
            oneRound();
        } while (round < 4);
        Player.print(players);
    }

    private void oneRound() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isTrue = true;
            for (Player player : players) {
                if (player.isPlayed()) {
                    isTrue = false;
                    if (isGuessed(player, scanner)) {
                        player.setWinRound(player.getWinRound() + 1);
                        round++;
                        return;
                    } else {
                        continue;
                    }
                }
                if (isTrue) {
                    System.out.println("Попытки всех игроков закончились");
                    round++;
                    return;
                }
            }
        }
    }

    private boolean winner(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getWinRound() == 2) {
                System.out.println("Игрок " + players[i].getName() + " одержал победу в серии раундов, игра завершена");
                return true;
            }
        }
        return false;
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        if (player.isPlayed()) {
            player.inputNumber(player, scanner);
            if (player.checkNumber(player, hiddenNum)) {
                return true;
            }
            System.out.println("Вы ввели число" + (player.getNumbers()[player.notEmptyArrayElements() - 1] > hiddenNum ? " больше" : " меньше") +
                    " чем загадал компьютер");
        }
        return false;
    }

    public static Player[] playersInitializer(String names) {
        String[] str = names.split(" ");
        Player[] players = new Player[str.length];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(str[i]);
        }
        return players;
    }

    public void randomPermutation() {
        Player tmp;
        for (int i = 0; i < players.length; i++) {
            int randomNumber = (int) (Math.random() * (players.length - 1));
            tmp = players[i];
            players[i] = players[randomNumber];
            players[randomNumber] = tmp;
        }
    }
}