package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String responseContinue;
        System.out.println("Введите через пробел имена игроков которые будут принимать участие в игре: ");
        GuessNumber game = new GuessNumber(GuessNumber.playersInitializer(scanner.nextLine()));
        do {
            game.start();
            do {
                System.out.println("Вы желаете повторить игру? <yes/no>");
                responseContinue = scanner.nextLine();
            } while (!responseContinue.equals("yes") && !responseContinue.equals("no"));
        } while (!responseContinue.equals("no"));
        scanner.close();
    }
}
