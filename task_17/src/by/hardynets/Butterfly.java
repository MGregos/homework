package by.hardynets;

import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону массива, для красоты нечётное значеное от 3 до 99");
        int a = in.nextInt();
        if ((a % 2) == 0 || a < 3 || a > 99) {
            System.out.println("Вы ввели неверное значение, программа закрывается.");
            System.exit(0);
        }

        int mass[][] = new int[a][a];
        int medium = (a / 2) + 1;
        int s = 0;
        int p = a;
        for (int i = 0; i < medium; i++) {
            for (int j = s; j < (p - i); j++) {
                mass[i][j] = 1;
            }
            s++;
        }

        int t = medium - 1;
        int z = medium - 1;
        for (int i = t; i < mass.length; i++) {
            for (int j = z; j <= t; j++) {
                mass[i][j] = 1;
            }
            t++;
            z--;
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
/* В примере был квадратный массив с нечётной гранью, поэтому алгоритм подгонялся под пример.
На экране у меня помещается массив 33х33, одинокая единичка строго посередине.
 */
