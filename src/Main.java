public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 *************************************");

        System.out.println("Задание 1 - вывести числа от 1 до 10");
        for (int i = 1 ; i <= 10 ; i++)
            System.out.println(i);

        System.out.println("Задание 2 - вывести все числа от 10 до 1");
        for (int i = 10 ; i >= 1 ; i--)
            System.out.println(i);

        System.out.println("Задание 3 - вывести все четные числа от 0 до 17");
        for (int i = 0 ; i <= 17 ; i++)
            if (i % 2 == 0) System.out.println(i);

        System.out.println("Задание 4 - вывести все числа от 10 до -10");
        for (int i = 10 ; i >= -10 ; i--)
            System.out.println(i);

        System.out.println("Домашнее задание 2 *************************************");

        System.out.println("Задание 1 - Високосные года от 1904 до 2096");
        for (int i = 1904 ; i <= 2096 ; i = i + 4)
            System.out.println(i);

        System.out.println("Задание 2 - Вывести последовательность от 7 до 98");
        for (int i = 7 ; i <= 98 ; i = i + 7)
            System.out.println(i);

        System.out.println("Задание 3 - Вывести последовательность от 1 до 512");
        for (int i = 1 ; i <= 512 ; i = i * 2)
            System.out.println(i);

        System.out.println("Домашнее задание 3 *************************************");

        System.out.println("Задание 1 - Суммы накоплений + 29000 р.");
        {
            int salary = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + salary;
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
            }
        }

        System.out.println("Задание 2 - Суммы накоплений в банк под 12 %");
        {
            int salary = 29000;
            double total = 0;
            for (int i = 1; i <= 12; i++) {
                total = (total * 1.12) + salary;
                double result = Math.round(total);
                System.out.println("Месяц " + i + " , сумма накоплений равна " + result + " рублей.");
            }
        }

    }
}