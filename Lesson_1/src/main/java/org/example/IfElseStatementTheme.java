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
        int digit1 = 11;
        int digit2 = 32;
        if (digit1 > digit2) {
            System.out.println("digit1 = " + digit1 + " это максимальное число. Минимальное digit2 = " + digit2);
        } else if (digit2 > digit1) {
            System.out.println("digit2 = " + digit2 + " это максимальное число. Минимальное digit1 = " + digit1);
        } else {
            System.out.println("Числа равны. Digit1 = " + digit1 + ", digit2 = " + digit2);
        }

        System.out.println("\n3. Проверка числа"); // не ноль  + - четное нечетное
        int randomNumber = 3;
        if (randomNumber != 0) {
            System.out.println("Число не ноль");
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
            System.out.println("Число randomNumber = 0, проверки на + - и положительность отрицательность пропускаются");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int firstDigit = 123;
        int secondDigit = 223;
        int hundredFirstDigit = firstDigit / 100;
        int hundredSecondDigit = secondDigit / 100;
        int dozenFirstDigit = (firstDigit / 10) % 10;
        int dozenSecondDigit = (secondDigit / 10) % 10;
        int secondsFirstNumber = firstDigit % 10;
        int secondsSecondNumber = firstDigit % 10;
        System.out.println("firstDigit = " + firstDigit + ", secondDigit = " + secondDigit);
        if (hundredFirstDigit == hundredSecondDigit) {
            System.out.println("Сотая часть firstDigit и secondDigit равны. firstDigit = " + hundredFirstDigit + ", Сотая часть secondDigit = " + hundredSecondDigit);
        } else {
            System.out.println("Сотая часть firstDigit и secondDigit не равны. firstDigit = " + hundredFirstDigit + ", Сотая часть secondDigit = " + hundredSecondDigit);
        }
        if (dozenFirstDigit == dozenSecondDigit) {
            System.out.println("Десятые части чисел равны. dozenFirstDigit = " + dozenFirstDigit + ", dozenSecondDigit = " + dozenSecondDigit);
        } else {
            System.out.println("Десятые части чисел не равны. dozenFirstDigit = " + dozenFirstDigit + ", dozenSecondDigit = " + dozenSecondDigit);
        }
        if (secondsFirstNumber == secondsSecondNumber) {
            System.out.println("Разряды секнд в числах равны. secondsFirstNumber = " + secondsFirstNumber + ", secondsSecondNumber = " + secondsSecondNumber);
        } else {
            System.out.println("Разряды секнд в числах не равны. secondsFirstNumber = " + secondsFirstNumber + ", secondsSecondNumber = " + secondsSecondNumber);
        }

        System.out.println("\n5. Определение символа по его коду");
        char myChar = '\u0052';
        if (myChar >= 'A' && myChar <= 'Z') {
            System.out.println("Это большая буква");
        } else if (myChar >= 'a' && myChar <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (myChar >= '0' && myChar <= '9') {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 150_000;
        double fivePercent = contribution * 0.05;
        double sevenPercent = contribution * 0.07;
        double tenPercent = contribution * 0.10;
        int resultSum;
        System.out.println(contribution + " - Сумма вклада");
        if (contribution > 300_000) {
            resultSum = (int) (contribution + tenPercent);
            System.out.println("Вклад: " + contribution + "\nНачисленный процент: " + (int) (tenPercent) + "\nИтоговая" +
                    "сумма с учетом добавленных процентов:" + resultSum);
        } else if (contribution >= 100_000 && contribution <= 300_000) {
            resultSum = (int) (contribution + sevenPercent);
            System.out.println("Вклад: " + contribution + "\nНачисленный процент: " + (int) (sevenPercent) + "\nИтоговая" +
                    "сумма с учетом добавленных процентов:" + resultSum);
        } else if (contribution < 100_000 && contribution > 0) {
            resultSum = (int) (contribution + fivePercent);
            System.out.println("Вклад: " + contribution + "\nНачисленный процент: " + (int) (fivePercent) + "\nИтоговая" +
                    "сумма с учетом добавленных процентов:" + resultSum);
        }

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
        int money = 675;
        int hundredsMoney = money / 100;
        int tensMoney = (money / 10) % 10;
        int onesMoney = money % 10;
        int howHundredsMoney = 0;
        int howTensMoney = 0;
        int howOnesMoney = 0;
        System.out.println(hundredsMoney + " " + tensMoney + " " + onesMoney); // 10 5 50 task
        int hundreds = 10;
        int tens = 5;
        int ones = 50;
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
        System.out.println("Выданная сумма: " + howHundredsMoney + howTensMoney +  howOnesMoney);
    }
}
