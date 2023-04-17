package startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int computerNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        computerNumber = (int) (1 + Math.random() * 100);
    }

    public void start() {
        player1.setPlayed(true);
        player2.setPlayed(true);
        Arrays.fill(player1.getNumbers(), 0, player1.getAttempt(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getAttempt(), 0);
        player1.setAttempt(0);
        player2.setAttempt(0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!player1.isPlayed() && !player2.isPlayed()) {
                System.out.println("У обоих игроков закончились попытки, игра заверешена");
                break;
            } else if (isGuessed(player1, scanner) || isGuessed(player2, scanner)) {
                break;
            }
        }
        System.out.println("Массив игрока " + player1.getName() + " " + Arrays.toString(Arrays.copyOf(player1.getNumbers(), player1.getAttempt())));
        System.out.println("Массив игрока " + player2.getName() + " " + Arrays.toString(Arrays.copyOf(player2.getNumbers(), player2.getAttempt())));
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        if (player.isPlayed()) {
            System.out.println(player.getName() + " введите число");
            player.setNumber(scanner.nextInt());
            scanner.nextLine();
            for (int i = 0; i < player.getNumbers().length; i++) {
                if (i == player.getNumbers().length - 1) {
                    System.out.println("У игрока " + player.getName() + " закончились попытки ввода чисел");
                    player.getNumbers()[i] = player.getNumber();
                    player.setPlayed(false);
                    break;
                }
                if (player.getNumbers()[i] == 0) {
                    player.getNumbers()[i] = player.getNumber();
                    break;
                }
            }
            if (player.getNumber() == computerNumber) {
                System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + player.getAttempt() + " попытки");
                return true;
            }
            System.out.println("Вы ввели число" + (player.getNumber() > computerNumber ? " больше" : " меньше") +
                    " чем загадал компьютер");
        }
        return false;
    }
}