package by.hardynets;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, сумму цифр которого необходимо высчитать: ");
        int i = in.nextInt();
        if (i < 0){
            i *= -1; // в случаи ввода отридцательного числа делаем ивверсию.
        }
        int x = i;
        int sum = 0;
        int n = 0;
        while (x > 0){
            n = (x % 10);
            sum += n;
            x /= 10;

        }
        System.out.println("Сумма цифр данного числа = " + sum);
    }
}
