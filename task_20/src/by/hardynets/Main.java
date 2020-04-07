package by.hardynets;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Для быстроты проверки алгоритма ввод с консоли закомментировал.

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
         */


        String str = "     Test! Fesf? Lesl, Pesp - Nesn:      (Guesg) Resr.      ";
        str = ((str.trim()));
        char symbol;
        char symbol2;
        int n = 0;
        int t = str.length();
        for (int i = 0; i < t - 1; i++) {
            symbol = str.charAt(i);
            symbol2 = str.charAt(i + 1);
            if (i == 0 || (symbol != ' ' && symbol2 == ' ')
                    || symbol2 == '!' || symbol2 == '?' || symbol2 == '.' || symbol2 == ','
                    || symbol2 == '(' || symbol2 == ')' || symbol2 == '-' || symbol2 == ':' || symbol2 == ';') {
                if (symbol == '!' || symbol == '?' || symbol == '.' || symbol == ','
                        || symbol == '(' || symbol == ')' || symbol == '-'
                        || symbol == ':' || symbol == ';' || symbol == ' ') {
                    continue;
                }
                System.out.print(symbol);

            }
            if (i == (t - 2) || (symbol == ' ' && symbol2 != ' ') || symbol == '(') {
                if (symbol2 == '!' || symbol2 == '?' || symbol2 == '.' || symbol2 == ','
                        || symbol2 == '(' || symbol2 == ')' || symbol2 == '-'
                        || symbol2 == ':' || symbol2 == ';') {
                    continue;
                }
                System.out.print(symbol2);
            }
        }
    }
}
