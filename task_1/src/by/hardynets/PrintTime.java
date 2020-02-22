package by.hardynets;
import java.util.Scanner;
public class PrintTime {

    public static void main(String[] args) {

        int sec;
        int m;
        int min, h;
        int day, week;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество секунд от 0 до 2_147_483_647: ");
        int s = in.nextInt();

        /* Проверку введённых значений пока не выполнял, т.к. не научился ещё.
        Сканнер выдаёт ошибку при вводе значения свыше инта.
        Так что программу можно легко сломать.
        С логикой вычесления пока разобрался так, но, на мой взгляд, получилось грамоздко.
        Числа в скобках не записывал в конечном виде для понимания, откуда такие значения.
        */

            week = s / (60 * 60 * 24) / 7;
            m = s - (week * 7 * 24 * 60 * 60);
            day = (m / (60 * 60)) / 24;
            m = m - day * 24 * 60 * 60;
            sec = s % 60;
            m = (m - sec) / 60;
            min = m % 60;
            m = (m - min) / 60;
            h = m % 60;


            System.out.println(week + " Недель\n" + day + " Дней\n" + h + " Часов\n" + min + " Минут\n" + sec + " Секунд");
    }
}
