package org.example;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte memory = 8;
        short diagonal = 13;
        int weight = 1400;
        long screenResolution = 25601600L;
        float bluetooth = 5.0f;
        double jack = 3.5d;
        boolean isPractical = true;
        char processorType = 'M';
        System.out.println(memory + ": В данном устройстве MacBook Air 8 ggb оперативной памяти");
        System.out.println(diagonal + ": Диагональ 13 дюймов");
        System.out.println(weight + ": Вес составляет 1300 гр");
        System.out.println(screenResolution + ": Данный параметр ялвяется разрешением экрана");
        System.out.println(bluetooth + ": Имеет bluetooth 5.0");
        System.out.println(isPractical + ": Является ли он практичным? да");
        System.out.println(jack + ": Аудио интерфейсы");
        System.out.println(processorType + ": Тип процессора М");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int amountWithoutDiscount = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки: " + amountWithoutDiscount);
        int discountAmount = (int) (amountWithoutDiscount * discount);
        System.out.println("Сумма скидки: " + discountAmount);
        int totalPriceOfDiscounted = amountWithoutDiscount - discountAmount;
        System.out.println("Общая стоимость товаров со скидкой: " + totalPriceOfDiscounted);

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a   v     v   a    \n" +
                "    J   a a   v   v   a a   \n" +
                "J   J  a a a   v v   a a a  \n" +
                " J J  a     a   v   a     a \n" );

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte max = Byte.MAX_VALUE;
        System.out.println(max);
        byte increment = (byte) (max+1);
        System.out.println(increment);
        byte decrement = (byte) (max - 1);
        System.out.println(decrement);
        short max1 = Short.MAX_VALUE;
        System.out.println(max1);
        short increment1 = (short) (max1 + 1);
        System.out.println(increment1);
        short decrement1 = (short) (max1 - 1);
        System.out.println(decrement1);
        int max2 = Integer.MAX_VALUE;
        System.out.println(max2);
        int increment2 = max2 + 1;
        System.out.println(increment2);
        int decrement2 = max2 - 1;
        System.out.println(decrement2);
        long max3 = Long.MAX_VALUE;
        System.out.println(max3);
        long increment3 = max3 + 1;
        System.out.println(increment3);
        long decrement3 = max3 - 1;
        System.out.println(decrement3);

        System.out.println("5. Перестановка значений переменных");
        System.out.println("С помощью третьей переменной temporary:");
        int digit1 = 2;
        int digit2 = 5;
        System.out.println("Изначальные значения переменных: digit1 = " + digit1 + ", digit2 = " + digit2);
        int temporary;
        temporary = digit1;
        digit1 = digit2;
        digit2 = temporary;
        System.out.println("Теперь значение digit1: " + digit1);
        System.out.println("Теперь значение digit2: " + digit2);
        System.out.println("С помощью арифметических операций:");
        digit2 = digit1 + digit2;
        digit1 = digit2 - digit1;
        digit2 = digit2 - digit1;
        System.out.println("Теперь значние digit1 = " + digit1);
        System.out.println("Теперь значние digit2 = " + digit2);
        System.out.println("С помощью побитовой операции ^");
        digit1^=digit2;
        digit2^=digit1;
        digit1^=digit2;
        System.out.println("Теперь значние digit1 = " + digit1);
        System.out.println("Теперь значние digit2 = " + digit2);

        System.out.println("6. Вывод символов и их кодов");
        char hash = '#';
        int hashCode = 35;
        char and = '&';
        int andCode = 38;
        char at = '@';
        int atCode = 64;
        char degree = '^';
        int degreeCode = 94;
        char underscore = '_';
        int underscoreCode = 95;
        System.out.println("Code\tSymbol");
        System.out.println(hashCode + "\t" + hash);
        System.out.println(andCode + "\t" + and);
        System.out.println(atCode + "\t" + at);
        System.out.println(degreeCode + "\t" + degree);
        System.out.println(underscoreCode + "\t" + underscore);

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\';
        char rightSlash = '/';
        char underscore1 = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("     " + rightSlash + " " + backSlash + "\n" +
                "    " + rightSlash +"   "+ backSlash + "\n" +
                "   " + rightSlash + underscore1 + leftBracket + " " + rightBracket + " " + backSlash + "\n" +
                "  " + rightSlash + "       " + backSlash + "\n" +
                " " + rightSlash + "" + underscore1 + " " + underscore1 + " " + underscore1 + " " + rightSlash + "" + backSlash + "" + underscore1 + "" + backSlash);

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundred = number / 100;
        int dozen = (number / 10) % 10;
        int unit = number % 10;
        System.out.println("Сотни: " + hundred);
        System.out.println("Десятки: " + dozen);
        System.out.println("Единицы: " + unit);

        System.out.println("9. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
