package startjava.lesson_2_3.guess;

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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (isGuessed(player1, scanner) || isGuessed(player2, scanner)) {
                break;
            }
        }
    }

    private boolean isGuessed(Player player, Scanner scanner) {
        System.out.println(player.getName() + " введите число");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
        if (player.getNumber() == computerNumber) {
            System.out.println(player.getName() + " вы победили!!!");
            return true;
        }
        System.out.println("Вы ввели число" + (player.getNumber() > computerNumber ? " больше" : " меньше") +
                " чем загадал компьютер");
        return false;
    }
}