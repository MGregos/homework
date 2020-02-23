package by.hardynets.task_6;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NextDay {

    public static void main(String[] args) {

        int jan = 31;
        int feb = 28;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;


        Scanner in = new Scanner(System.in);
        System.out.print("Введите год (от 0 до 3000): ");
        int y = in.nextInt();

        if (y < 0 || y > 3000) {
            System.out.println("Введено неверное значение года, программа закрывается.");
            System.exit(0);
        } else System.out.println("Принял, едем дальше");

        if ((y % 100) % 4 == 0) {   // Проверяем год на високосность, т.к. каждый 4-й год в феврале 29 дней
            feb = 29;
        } else feb = 28;

        System.out.print("Введите месяц (от 1 до 12): ");
        int m = in.nextInt();

        if (m < 1 || m > 12) {
            System.out.println("Введено неверное значение месяца, программа закрывается.");
            System.exit(0);
        } else System.out.println("Принял, едем дальше");

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("Введите день (от 1 до 31): ");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("Введите день (от 1 до 30): ");
        } else if (m == 2 & feb == 28) {
            System.out.println("Введите день (от 1 до 28): ");
        } else if (m == 2 & feb == 29) {
            System.out.println("Введите день (от 1 до 29): ");
        } else System.out.println("Oops O_o");


        int d = in.nextInt();

        if (d < 1 || d > 31 || m == 1 & d > jan || m == 2 & d > feb || m == 3 & d > mar || m == 4 & d > apr || m == 5 & d > may || m == 6 & d > jun || m == 7 & d > jul || m == 8 & d > aug || m == 9 & d > sep || m == 10 & d > oct || m == 11 & d > nov || m == 12 & d > dec) {
            System.out.println("Такого дня в календаре не существует, программа закрывается.");
            System.exit(0);

        } else System.out.println("А сегодня в завтрашний день не все могут смотреть." +
                "\nВернее, смотреть могут не только лишь все. Мало, кто может это делать." +
                "\nА мы можем. Вот он:");

        ++d;


        if (m == 1 & d > jan || m == 2 & d > feb || m == 3 & d > mar || m == 4 & d > apr || m == 5 & d > may || m == 6 & d > jun || m == 7 & d > jul || m == 8 & d > aug || m == 9 & d > sep || m == 10 & d > oct || m == 11 & d > nov || m == 12 & d > dec) {
            ++m;
            d = 1;
        }
        if (m > 12) {
            ++y;
            m = 1;
        }

        System.out.println("Год: " + y + "\nМесяц: " + m + "\nДень: " + d);

    }
}
