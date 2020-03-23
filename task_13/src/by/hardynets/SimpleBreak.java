package by.hardynets;

import java.util.Scanner;

public class SimpleBreak {

    public static void main(String[] args) {

        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в пределах инта для проверки, является ли оно простым: ");
        int x = in.nextInt();
        if (x < 0) {
            x *= -1;
        }
        if (x == 0) {
            System.out.println("Вы ввели '0', программа закрывается");
            System.exit(0);
        }

        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0) {
                k++;
                if (k > 2) {
                    break;
                }
            }
        }
        if (k > 2) {
            System.out.println("Число Вы написаль ой какое непростое");
        } else System.out.println("Простенькое число");

        /*Программа стала работать быстрей, если введено непростое число, например, 32:
          После деления на 1, 2, 4 - k примет значение 3, после чего цикл прекратится.
          Куда здесь впихнуть continue - я не нашел.
         */
    }
}