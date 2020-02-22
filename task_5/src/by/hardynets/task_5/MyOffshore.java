package by.hardynets.task_5;

import java.util.Scanner;

public class MyOffshore {

    public static void main(String[] args) {
        int s;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество денег: ");
        int n = in.nextInt();

        if (n > 0) {
            s = n % 10;
        } else s = (n * -1) % 10;
        // Делаем инверсию отридцательного числа. Ведь баланс, как у меня, может иметь минусовое значение.

        if (s == 0 || s == 5 || s == 6 || s == 7 || s == 8 || s == 9 || n % 100 == 11 || n % 100 == -11) {
            System.out.println(n + " рублей");

            // Числа "11", "111", "1111" и т.д. являются исключениями, т.к. все остальные числа, заканчивающиеся
            // на "1", имеют иной падеж.

        } else if (s == 2 || s == 3 || s == 4) {
            System.out.println(n + " рубля");
        } else if (s == 1) {
            System.out.println(n + " рубль");
        } else
            System.out.println("Что-то пошло не так. Вам следует обратиться к системноду администратору, или к Богу");


    }
}
