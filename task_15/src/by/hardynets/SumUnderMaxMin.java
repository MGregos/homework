package by.hardynets;

import java.util.Scanner;

public class SumUnderMaxMin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива (ограничимся от 3 до 30): ");
        int a = in.nextInt();
        if (a < 3 || a > 30) {
            System.out.println("Введено неверное значение размера массива. Программа закрывается");
            System.exit(0);
        }
        System.out.println("Введите максимальное значение внутри массива (от 3 до 100): ");
        int s = in.nextInt();
        if (s < 3 || s > 100) {
            System.out.println("Введено неверное значение. Программа закрывается");
            System.exit(0);
        }
        int sum = 0;
        int[] mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * s + 1);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print("[" + i + "]" + mass[i] + " ");
        }
        int max = 0;
        int maxPos = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                maxPos = i;
            }

        }


        int min = s;
        int minPos = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
                minPos = i;
            }

        }
        System.out.println("\n" + "Минимльное значение = [" + minPos + "]" + min);
        System.out.println("Максимальное значение = [" + maxPos + "]" + max);
        if ((maxPos - minPos) == 1 || (maxPos - minPos) == -1) {
            System.out.println("Между минимальным и максимальным значением нету чисел");
            System.exit(0);
        }

        if ((maxPos - minPos) > 0) {
            for (int i = (minPos + 1); i < maxPos; i++) {
                sum += mass[i];
            }
        } else
            for (int i = (minPos - 1); i > maxPos; i--) {
                sum += mass[i];
            }
        System.out.println("Сумма между макс и мин значениями = " + sum);
    }
}
/*
На самом деле алгоритм программы можно дорабатывать серьёзней, т.к. при повторе максимальных или минимальных значений
в max and min будет храниться значение, которое они захватили первым. Можно, конечно, в строках 34 и 45 добавить
знак "=" к сравнениям ">" or "<", но останется проблема, если первым идёт максимальное значение, а затем минимальное.
Но, чётких требований на этот счёт не было.
*/