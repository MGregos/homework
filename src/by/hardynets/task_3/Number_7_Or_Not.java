package by.hardynets.task_3;

import java.util.Scanner;

public class Number_7_Or_Not {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число (в пределах int) - а я скажу, заканчивается ли оно на 7: ");
        int num = in.nextInt();


        if (num % 10 == 7 || num % 10 == -7) {
            System.out.println("Число заканчивается на 7");
        } else {
            System.out.println("Не расстраивайтесь, когда-нибудь и на вашей улице число закончится на 7");
        }

    }
}
