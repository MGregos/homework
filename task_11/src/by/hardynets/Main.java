package by.hardynets;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки, является ли оно простым: ");
        int x = in.nextInt();
        if (x < 0) {
            x *= -1;
        }

        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0) {
                k++;
            }
        }
        if (k > 2) {
            System.out.println("Число Вы написаль ой какое непростое");
        } else System.out.println("Простенькое число");

    }
}

