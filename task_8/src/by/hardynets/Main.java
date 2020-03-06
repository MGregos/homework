package by.hardynets;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int sum = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нужный факториал числа: ");
        int x = in.nextInt();

        while (i <= x) {
            sum *= i;
            i++;
        }
        System.out.println(sum);
    }
}
