package by.hardynets;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int max = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальное значение рандомайзера: ");
        int y = in.nextInt();

        int x = (int) (Math.random() * y);
        System.out.print(x);
        while (x != 0) {
            if (x > max) {
                max = x;
            }
            x = (int) (Math.random() * y);
            System.out.print(" " + x);
        }

        System.out.println("\n" + "Максимальное значение рандомного набора чисел = " + max);
    }
}
