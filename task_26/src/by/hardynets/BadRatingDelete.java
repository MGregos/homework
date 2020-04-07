package by.hardynets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BadRatingDelete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во оценок в коллекции (от 1 до 999): ");
        int s = scanner.nextInt();
        if (s < 1 || s > 999) {
            System.out.println("Введено неверное значение");
            System.exit(-1);
        }


        List arrayList = new ArrayList();
        for (int i = 0; i < s; i++) {
            arrayList.add((int) (Math.random() * 11) - 0);
        }
        System.out.println("Мы имеем следующий список оценок: " + arrayList);
        System.out.println("Введите минимальную удовлетварительную оценку (от 1 до 6): ");
        int y = scanner.nextInt();
        if (y < 1 || y > 6) {
            System.out.println("Введено неверное значение");
            System.exit(-2);
        } else System.out.println("Будут удалены оценки меньше " + y);

        System.out.println("До удаления   : " + arrayList);
        for (int i = 0; i < y; i++) {
            if (arrayList.contains(i)) {
                while (arrayList.contains(i) == true) {
                    int z = arrayList.indexOf(i);
                    arrayList.remove(z);
                }
            }
        }
        System.out.println("После удаления: " + arrayList);
    }
}

