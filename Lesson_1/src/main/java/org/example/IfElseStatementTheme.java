package org.example;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 24;
        boolean isWomen = true;
        double height = 1.2;
        String name = "Konstantin";
        char firstCharName = name.charAt(0);
        if (age > 20) {
            System.out.println("Вам разрешено покупать крепкую алкогольную продукцию");
        } else {
            System.out.println("Вам запрещено преобретать алкоголь такой крепости (разрешено от 20 лет)");
        }

        if (!isWomen) {
            System.out.println("Гендер 'мужчина' не имеет доступ к данному сообщевсту");
        } else {
            System.out.println("Проходите");
        }

        if (height < 1.80) {
            System.out.println("Ваш рост меньше 180");
        } else {
            System.out.println("Вы очень высокий");
        }

        if (firstCharName == 'D') {
            System.out.println("Имя начинается на букву D");
        } else if (firstCharName == 'K') {
            System.out.println("Имя начинается на букву 'K'");
        } else {
            System.out.println("Имя начинается не на буквы 'D', 'K'");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 11;
        int number2 = 32;
        if (number1 > number2) {
            System.out.println("numberMinOrMax1 = " + number1 + " это максимальное число. Минимальное numberMinOrMax2 = " + number2);
        } else if (number2 > number1) {
            System.out.println("numberMinOrMax2 = " + number2 + " это максимальное число. Минимальное numberMinOrMax1 = " + number1);
        } else {
            System.out.println("Числа равны. numberMinOrMax1 = " + number1 + ", numberMinOrMax2 = " + number2);
        }

        System.out.println("\n3. Проверка числа"); // не ноль  + - четное нечетное
        int randomNumber = 3;
        if (randomNumber != 0) {
            if (randomNumber % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (randomNumber > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            System.out.println("Число = " + randomNumber);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number3 = 232;
        int number4 = 242;
        int hundredsDigit1 = number3 / 100;
        int hundredsDigit2 = number4 / 100;
        int tensDigit1 = (number3 / 10) % 10;
        int tensDigit2 = (number4 / 10) % 10;
        int onesDigit1 = number3 % 10;
        int onesDigit2 = number4 % 10;
        System.out.println("number1 = " + number3 + ", number2 = " + number4);
        if (hundredsDigit1 == hundredsDigit2 || tensDigit1 == tensDigit2 || onesDigit1 == onesDigit2) {
            if (hundredsDigit1 == hundredsDigit2) {
                System.out.println("Сотая часть number3 и number4 равны. number3 = " + hundredsDigit1 + ", Сотая часть number4 = " + hundredsDigit2);
            }
            if (tensDigit1 == tensDigit2) {
                System.out.println("Десятые части чисел равны. tensDigit1 = " + tensDigit1 + ", tensDigit2 = " + tensDigit2);
            }
            if (onesDigit1 == onesDigit2) {
                System.out.println("Разряды секунд в числах равны. onesDigit1 = " + onesDigit1 + ", onesDigit2 = " + onesDigit2);
            }
        } else {
            System.out.println("Все цифры в разрядах разные");
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0052';
        if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("Это большая буква");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 301_000;
        double percent = 0.1;
        int resultSum = (int) (contribution + (contribution * percent));
        System.out.println(contribution + " - Сумма вклада");
        if (contribution < 100_000 && contribution > 0) {
            percent = 0.05;
            resultSum = (int) (contribution + (contribution * percent));
        } else if (contribution >= 100_000 && contribution <= 300_000) {
            percent = 0.07;
            resultSum = (int) (contribution + (contribution * percent));
        }
        System.out.println("Сумма вклада = " + contribution + "\nНачисленный % = " + percent + "\nИтоговая" +
                "сумма с % = " + resultSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        int programmingPercent = 91;
        int programmingGrade = 2;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        }
        System.out.println(historyGrade + " - История\n" + programmingGrade + " - Программирование");
        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;
        System.out.println(averageGrade + " - средний балл оценок по предметам\n" +
                averagePercent + " - средний % по предметам");

        System.out.println("\n8. Расчет прибыли за год");
        int annualProfit = (13_000 * 12) - (9_000 + 5_000) * 12;
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int requiredSum = 567;
        int banknoteHundreds = 10;
        int banknoteTens = 5;
        int banknoteOnes = 50;
        int usedBanknoteHundreds = requiredSum / 100;
        if (requiredSum <= (banknoteHundreds * 100) + (banknoteTens * 10) + (banknoteOnes)) {
            if (usedBanknoteHundreds > banknoteHundreds) {
                usedBanknoteHundreds = banknoteHundreds;
            }
            requiredSum -= usedBanknoteHundreds * 100;
            banknoteHundreds -= usedBanknoteHundreds;
            int usedBanknoteTens = requiredSum / 10;
            if (usedBanknoteTens > banknoteTens) {
                usedBanknoteTens = banknoteTens;
            }
            requiredSum -= usedBanknoteTens * 10;
            banknoteTens -= usedBanknoteTens;
            int usedBanknoteOnes = requiredSum;
            if (usedBanknoteOnes > banknoteOnes) {
                usedBanknoteOnes = banknoteOnes;
            }
            requiredSum -= usedBanknoteOnes;
            banknoteOnes -= usedBanknoteOnes;
            System.out.println("Used banknotes:");
            System.out.println("Banknote 100: " + usedBanknoteHundreds);
            System.out.println("Banknote 10: " + usedBanknoteTens);
            System.out.println("Banknote 1: " + usedBanknoteOnes);
            System.out.println("Total amount: " + (usedBanknoteHundreds * 100 + usedBanknoteTens * 10 + usedBanknoteOnes));
        } else {
            System.out.println("Невозможно выдать данную сумму такими номиналами");
        }
    }
}
