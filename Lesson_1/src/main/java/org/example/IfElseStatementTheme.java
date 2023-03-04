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
        int numberMinOrMax1 = 11;
        int numberMinOrMax2 = 32;
        if (numberMinOrMax1 > numberMinOrMax2) {
            System.out.println("numberMinOrMax1 = " + numberMinOrMax1 + " это максимальное число. Минимальное numberMinOrMax2 = " + numberMinOrMax2);
        } else if (numberMinOrMax2 > numberMinOrMax1) {
            System.out.println("numberMinOrMax2 = " + numberMinOrMax2 + " это максимальное число. Минимальное numberMinOrMax1 = " + numberMinOrMax1);
        } else {
            System.out.println("Числа равны. numberMinOrMax1 = " + numberMinOrMax1 + ", numberMinOrMax2 = " + numberMinOrMax2);
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
        int number1 = 123;
        int number2 = 456;
        int hundredNumber1 = number1 / 100;
        int hundredNumber2 = number2 / 100;
        int tensNumber1 = (number1 / 10) % 10;
        int tensNumber2 = (number2 / 10) % 10;
        int secondsNumber1 = number1 % 10;
        int secondsNumber2 = number2 % 10;
        System.out.println("number1 = " + number1 + ", number2 = " + number2);
        if (hundredNumber1 == hundredNumber2 || tensNumber1 == tensNumber2 || secondsNumber1 == secondsNumber2) {
            if (hundredNumber1 == hundredNumber2) {
                System.out.println("Сотая часть number1 и number2 равны. number1 = " + hundredNumber1 + ", Сотая часть number2 = " + hundredNumber2);
            } else {
                System.out.println("Сотая часть number1 и number2 не равны. number1 = " + hundredNumber1 + ", Сотая часть number2 = " + hundredNumber2);
            }
            if (tensNumber1 == tensNumber2) {
                System.out.println("Десятые части чисел равны. tensNumber1 = " + tensNumber1 + ", tensNumber2 = " + tensNumber2);
            } else {
                System.out.println("Десятые части чисел не равны. tensNumber1 = " + tensNumber1 + ", tensNumber2 = " + tensNumber2);
            }
            if (secondsNumber1 == secondsNumber2) {
                System.out.println("Разряды секунд в числах равны. secondsNumber1 = " + secondsNumber1 + ", secondsNumber2 = " + secondsNumber2);
            } else {
                System.out.println("Разряды секунд в числах не равны. secondsNumber1 = " + secondsNumber1 + ", secondsNumber2 = " + secondsNumber2);
            }
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
        double percent = 0.0;
        int resultSum;
        System.out.println(contribution + " - Сумма вклада");
        if (contribution > 300_000) {
            percent = 0.1;
        } else if (contribution >= 100_000 && contribution <= 300_000) {
            percent = 0.07;
        } else if (contribution < 100_000 && contribution > 0) {
            percent = 0.05;
        }
        resultSum = (int) (contribution + (contribution * percent));
        System.out.println("Сумма вклада = " + contribution + "\nНачисленный % = " + percent + "\nИтоговая" +
                "сумма с % = " + resultSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGradeValue = 0;
        int programmingPercent = 91;
        int programmingGradeValue = 0;
        if (historyPercent > 91) {
            historyGradeValue = 5;
        } else if (historyPercent > 73) {
            historyGradeValue = 4;
        } else if (historyPercent > 60) {
            historyPercent = 3;
        } else {
            historyGradeValue = 2;
        }
        if (programmingPercent > 91) {
            programmingGradeValue = 5;
        } else if (programmingPercent > 73) {
            programmingGradeValue = 4;
        } else if (programmingPercent > 60) {
            programmingGradeValue = 3;
        } else {
            programmingGradeValue = 2;
        }
        System.out.println(historyGradeValue + " - История\n" + programmingGradeValue + " - Программирование");
        double gradePointAverage = (historyGradeValue + programmingGradeValue) / 2.0;
        double averagePercentage = (historyPercent + programmingPercent) / 2.0;
        System.out.println(gradePointAverage + " - средний балл оценок по предметам\n" +
                averagePercentage + " - средний % по предметам");

        System.out.println("\n8. Расчет прибыли за год");
        int rentalRoom = 5_000;
        int monthSales = 13_000;
        int costOfGoods = 9_000;
        int annualProfit;
        int costOfProduction = costOfGoods * 12;
        int rentalExpenses = rentalRoom * 12;
        int profit = monthSales * 12;
        int generalExpenses = costOfProduction + rentalExpenses;
        annualProfit = profit - generalExpenses;
        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int money = 359;
        int hundredsMoney = money / 100;
        int tensMoney = (money / 10) % 10;
        int onesMoney = money % 10;
        int howHundredsMoney = 0;
        int howTensMoney = 0;
        int howOnesMoney = 0;
        System.out.println(hundredsMoney + " " + tensMoney + " " + onesMoney); // 10 5 50 task
        int hundreds = 10;
        int tens = 5;
        int ones = 8;
        if (hundreds >= hundredsMoney) {
            howHundredsMoney = hundredsMoney;
            if (tens >= tensMoney) {
                howTensMoney = tensMoney;
                if (ones >= onesMoney) {
                    howOnesMoney = onesMoney;
                } else {
                    System.out.println("Невозможно выдать сумму с такими номаналами");
                }
            } else if (tens + (ones / 10) >= tensMoney) {
                howTensMoney = tensMoney;
                if (ones >= onesMoney) {
                    howOnesMoney = onesMoney;
                } else {
                    System.out.println("Невозможно выдать сумму с такими номиналами");
                }
            } else {
                System.out.println("Невозможно выдать сумму с такими номиналами");
            }
        } else if ((tens / 10) + (hundreds) >= hundredsMoney) { // занимаем у десятых для сотен
            howHundredsMoney = hundredsMoney;
            tens -= (hundredsMoney - hundreds) * 10;
            if (tens >= tensMoney) {
                howTensMoney = tensMoney;
                if (ones >= onesMoney) {
                    howOnesMoney = onesMoney;
                } else {
                    System.out.println("Невозможно выдать сумму с такими номиналами");
                }
            } else if ((ones / 10) + (tens) >= tensMoney) {
                howTensMoney = tensMoney;
                ones -= (tensMoney - tens) * 10;
            } else {
                System.out.println("Невозможно выдать сумму с такими номиналами");
            }
        } else if ((tens / 10) + (hundreds) + (ones / 100) >= hundreds) { //занимаем у копеек
            howHundredsMoney = hundredsMoney;
            tens -= (hundredsMoney - hundreds) * 10;
            ones -= (tensMoney - tens) * 100;
            if (tens >= tensMoney) {
                howTensMoney = tensMoney;
                if (ones >= onesMoney) {
                    howOnesMoney = onesMoney;
                } else {
                    System.out.println("Невозможно выдать сумму с такими номиналами");
                }
            } else if ((ones / 10) + (tens) >= tensMoney) {
                howTensMoney = tensMoney;
                ones -= (tensMoney - tens) * 10;
            } else {
                System.out.println("Невозможно выдать сумму с такими номиналами");
            }
        } else {
            System.out.println("Невозможно выдать сумму с такими номиналами");
        }
        System.out.println("Номиналы банкнот: " + hundreds + " - сотни, " + tens + " - десятки, " +
                ones + " - единицы");
        System.out.println("Требуемое кол-во: " + hundredsMoney + " - сотни, " + tensMoney + " - десятки, " +
                onesMoney + " - единицы");
        System.out.println("Выданная сумма: " + howHundredsMoney + howTensMoney + howOnesMoney);
    }
}
