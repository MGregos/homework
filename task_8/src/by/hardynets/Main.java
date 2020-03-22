package by.hardynets;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double sum = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нужный факториал числа (от 1 до 170): ");
        int x = in.nextInt();
        if (x <= 0 || x > 170) {
            System.out.println("Введено некорректное значение, программа завершается.");
            System.exit(0);
        }

        while (i <= x) {
            sum *= i;
            i++;
        }
        System.out.println(sum);
    }
}
