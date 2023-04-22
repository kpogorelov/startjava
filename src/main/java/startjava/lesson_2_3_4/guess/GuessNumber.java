package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final int hiddenNum;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        hiddenNum = (int) (1 + Math.random() * 100);
    }

    public void start() {
        player1.clear();
        player2.clear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        while (true) {
            if (!player1.isPlayed() && !player2.isPlayed()) {
                System.out.println("У обоих игроков закончились попытки, игра завершена ");
                break;
            } else if (isGuessed(player1, scanner) || isGuessed(player2, scanner)) {
                break;
            }
        }
        player1.print();
        player2.print();
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        if (player.isPlayed()) {
            player.inputNumber(player, scanner);
            if (player.checkNumber(player, hiddenNum)) {
                return true;
            }
            System.out.println("Вы ввели число" + (player.getNumbers()[player.getAttempt() - 1] > hiddenNum ? " больше" : " меньше") +
                    " чем загадал компьютер");
        }
        return false;
    }
}