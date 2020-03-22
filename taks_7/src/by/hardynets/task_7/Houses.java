package by.hardynets.task_7;

import java.util.Scanner;

public class Houses {

    public static void main(String[] args) {


// Мы народ не особо богатый, поэтому ограничимся участком в 100 соток
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число сторону участка e (макс 100):");
        int e = in.nextInt();

        if (e < 0 || e > 100) {
            System.out.println("Вы, барин, сильно размахнулис. Уходим");
            System.exit(0);

        } else System.out.println("Введите сторону участка f (макс 100):");

        int f = in.nextInt();
        if (f < 0 || f > 100) {
            System.out.println("Вы, барин, сильно размахнулис. Уходим");
            System.exit(0);
        }

        System.out.println("Введите сторону 1  дома 1 (макс 100):");

        int a = in.nextInt();
        if (a < 0 || a > 100) {
            System.out.println("Сторона 1 дома 1 слишком большая, или введено неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Введите сторону 2  дома 1 (макс 100):");


        int b = in.nextInt();
        if (b < 0 || b > 100) {
            System.out.println("Сторона 2 дома 1 слишком большая, или введено неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Проверяем вместительность дома №1 на участок");


        if ((a > e || b > f) || (a > f || b > e)) {
            System.out.println("Увы, дом №1 на участок не поместится. Уходим.");
            System.exit(0);
        } else System.out.println("Дом №1 поместился");

        // Теперь нам нужно убрать из участка наш дом. Создадим 2 новых прямоугольника

        int e_1 = e - a;
        int f_1 = f - b;

        if (e_1 == 0 && f_1 == 0) {
            System.out.print("Но занял весь участок. Уходим.");
            System.exit(0);
        }


            System.out.println("Введите сторону 1  дома 2 (макс 100):");

        int c = in.nextInt();
        if (c < 0 || c > 100) {
            System.out.println("Сторона 1 дома 1 слишком большая, или введено неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Введите сторону 2  дома 2 (макс 100):");


        int d = in.nextInt();
        if (d < 0 || d > 100) {
            System.out.println("Сторона 2 дома 2 слишком большая, или введено неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Проверяем вместительность дома 2 на участок\n");




        if ((c <= e_1 && d <= f) || (d <= e_1 && c <= f) || (c <= f_1 && d <= e) || (d <= f_1 && c <= e)) {
            System.out.println("Дом №2 помещается на участке вместе с домом №1");
            System.exit(0);
        } else System.out.println("Места на участке для дома заданного зазмера не осталось");


    }
}
