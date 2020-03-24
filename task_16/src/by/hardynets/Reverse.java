package by.hardynets;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int temp = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (ограничимся от 2 до 30): ");
        int a = in.nextInt();
        if (a < 2 || a > 30){
            System.out.println("Введено неверное значение, программа закрывается");
            System.exit(0);
        }
        System.out.println("Введите маскимальное значение внутри массива (от 2 до 999)");
        int s = in.nextInt();
        if (s < 2 || s > 999){
            System.out.println("Введено неверное значение, программа закрывается");
        }


        int[] mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * s + 1);
        }
        System.out.println("↓ Оригинальный массив ↓");
        for (int i = 0; i < mass.length; i++) {
            System.out.print("[" + i + "]" + mass[i] + " ");
        }
        System.out.println("\r");
        int medium = a / 2;

        for (int i = 0; i < medium; i++){
            temp =  mass[i];
            mass[i] = mass[a - (i + 1)];
            mass[a - (i + 1)] = temp;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print("[" + i + "]" + mass[i] + " ");
        }
        System.out.println("\n↑ Перевёрнутый массив ↑");
    }
}
