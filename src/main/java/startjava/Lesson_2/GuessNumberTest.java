package startjava.Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String responseContinue;
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Вы желаете повторить игру? <yes/no>");
                responseContinue = scanner.nextLine();
            } while (!responseContinue.equals("yes") && !responseContinue.equals("no"));
        } while (!responseContinue.equals("no"));
        scanner.close();
    }
}
