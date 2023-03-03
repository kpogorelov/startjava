package org.example;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte ssdMemory = 8;
        short diagonal = 13;
        int weight = 1400;
        long screenResolution = 25601600L;
        float versionBluetooth = 5.0f;
        double jack = 3.5d;
        boolean isPractical = true;
        char cpuType = 'M';
        System.out.println(ssdMemory + ": В данном устройстве MacBook Air 8 ggb оперативной памяти");
        System.out.println(diagonal + ": Диагональ 13 дюймов");
        System.out.println(weight + ": Вес составляет 1300 гр");
        System.out.println(screenResolution + ": Данный параметр ялвяется разрешением экрана");
        System.out.println(versionBluetooth + ": Имеет bluetooth 5.0");
        System.out.println(isPractical + ": Является ли он практичным? да");
        System.out.println(jack + ": Аудио интерфейсы");
        System.out.println(cpuType + ": Тип процессора М");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int sumGoods = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки: " + sumGoods);
        int discountAmount = (int) (sumGoods * discount);
        System.out.println("Сумма скидки: " + discountAmount);
        int discountPrice = sumGoods - discountAmount;
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a   v     v   a    \n" +
                "    J   a a   v   v   a a   \n" +
                "J   J  a a a   v v   a a a  \n" +
                " J J  a     a   v   a     a \n" );

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte max = Byte.MAX_VALUE;
        System.out.println(max);
        max++;
        System.out.println(max);
        max--;
        System.out.println(max);
        short max1 = Short.MAX_VALUE;
        System.out.println(max1);
        max1++;
        System.out.println(max1);
        max1--;
        System.out.println(max1);
        int max2 = Integer.MAX_VALUE;
        System.out.println(max2);
        max2++;
        System.out.println(max2);
        max2--;
        System.out.println(max2);
        long max3 = Long.MAX_VALUE;
        System.out.println(max3);
        max3++;
        System.out.println(max3);
        max3--;
        System.out.println(max3);

        System.out.println("5. Перестановка значений переменных");
        System.out.println("С помощью третьей переменной temporary:");
        int digit1 = 2;
        int digit2 = 5;
        int temp;
        System.out.println("Изначальные значения переменных: digit1 = " + digit1 + ", digit2 = " + digit2);
        temp = digit1;
        digit1 = digit2;
        digit2 = temp;
        System.out.println("Теперь значение digit1: " + digit1);
        System.out.println("Теперь значение digit2: " + digit2);
        System.out.println("С помощью арифметических операций:");
        digit2 += digit1;
        digit1 = digit2 - digit1;
        digit2 -= digit1;
        System.out.println("Теперь значние digit1 = " + digit1);
        System.out.println("Теперь значние digit2 = " + digit2);
        System.out.println("С помощью побитовой операции ^");
        digit1 ^= digit2;
        digit2 ^= digit1;
        digit1 ^= digit2;
        System.out.println("Теперь значние digit1 = " + digit1);
        System.out.println("Теперь значние digit2 = " + digit2);

        System.out.println("6. Вывод символов и их кодов");
        char hash = '#';
        char and = '&';
        char at = '@';
        char degree = '^';
        char underscore = '_';
        System.out.println("Code\tSymbol");
        System.out.println((int) hash + "\t" + hash);
        System.out.println((int) and + "\t" + and);
        System.out.println((int) at + "\t" + at);
        System.out.println((int) degree + "\t" + degree);
        System.out.println((int) underscore + "\t" + underscore);

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\';
        char slash = '/';
        char underscore1 = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("     " + slash + " " + backSlash + "\n" +
                "    " + slash +"   "+ backSlash + "\n" +
                "   " + slash + underscore1 + leftBracket + " " + rightBracket + " " + backSlash + "\n" +
                "  " + slash + "       " + backSlash + "\n" +
                " " + slash + "" + underscore1 + " " + underscore1 + " " + underscore1 + "" + slash + " " + backSlash + "" + underscore1 + "" + backSlash);

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Единицы: " + ones);

        System.out.println("9. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
