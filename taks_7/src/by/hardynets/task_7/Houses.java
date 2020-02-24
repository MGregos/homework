package by.hardynets.task_7;

import java.util.Scanner;

public class Houses {

    public static void main(String[] args) {


// Мы народ не особо богатый, поэтому ограничимся участком в 100 соток
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число сторону участка А (макс 100):");
        int e = in.nextInt();

        if (e < 0 || e > 100) {
            System.out.println("Вы, барин, сильно размахнулис. Уходим");
            System.exit(0);

        } else System.out.println("Введите сторону участка B (макс 100):");

        int f = in.nextInt();
        if (f < 0 || f > 100) {
            System.out.println("Вы, барин, сильно размахнулис. Уходим");
            System.exit(0);
        }
        System.out.println("Введите отступ от края участка." +
                "\n0 - отступ не требуется" +
                "\nПо законодательству РБ - 3 метра.\n" +
                "Если договориться с соседями - 1 метр\n" +
                "Ваше решение: ");
        int x = in.nextInt();

        if (x < 0 || x > 3) {
            System.out.println("Введено некорректное значение. Уходим.");
            System.exit(0);

        } else System.out.println("Введите сторону 1  дома 1 (макс 100):");

        int a = in.nextInt();
        if (a < 0 || a > 100) {
            System.out.println("Сторона 1 дома 1 слишком большая, или имее неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Введите сторону 2  дома 1 (макс 100):");


        int b = in.nextInt();
        if (b < 0 || b > 100) {
            System.out.println("Сторона 2 дома 1 слишком большая, или имее неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Проверяем вместительность дома 1 на участок с учётом отступа");

        a += (x * 2); // отступ то у нас с каждой стороны, а стороны у нас 2, поэтому x умнажаем на 2
        b += (x * 2);

        if (a > e || a > f || b > e || b > f) {
            System.out.println("Увы, дом 1 на участок не поместится. Нжно как-то поскромнее быть. Уходим.");
            System.exit(0);
        } else System.out.println("Дом 1 поместился, едем дальше.");

        // Теперь нам нужно убрать из участка наш дом. Создадим 2 новых прямоугольника

        int e_1 = e - a;
        int f_1 = f - b;

        System.out.println("Введите отступ от края участка." +
                "\n0 - отступ не требуется" +
                "\nПо законодательству РБ - 3 метра.\n" +
                "Если договориться с соседями - 1 метр\n" +
                "Ваше решение: ");
        int x_1 = in.nextInt();
        if (x_1 < 0 || x_1 > 3) {
            System.out.println("Введено некорректное значение. Уходим.");
            System.exit(0);

        } else
            System.out.println("Введите сторону 1  дома 2 (макс 100):");

        int c = in.nextInt();
        if (c < 0 || c > 100) {
            System.out.println("Сторона 1 дома 1 слишком большая, или имее неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Введите сторону 2  дома 2 (макс 100):");


        int d = in.nextInt();
        if (d < 0 || d > 100) {
            System.out.println("Сторона 2 дома 2 слишком большая, или имее неверное значение. Уходим.");
            System.exit(0);
        } else System.out.println("Проверяем вместительность дома 2 на участок с учётом отступа\n");

        c += x_1; // отступ то у нас с каждой стороны, а стороны у нас 2, поэтому x умнажаем на 2
        d += x_1;


        if (((c <= e_1 && d <= f) || (d <= e_1 && c <= f)) || ((c <= f_1 && d <= e) || (d <= f_1 && c <= e))) {
            System.out.println("Повезло, дом влез");
            System.exit(0);
        } else System.out.println("Гараж для Вашего Bentley не влезет. Паркуйте машину на участке.");

        // Программу писал и обкатывал на коленях, так что если что-то не так - сильно не бейте, поправлю.
    }
}
