package by.hardynets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SearchMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во оценок в коллекции (от 1 до 999): ");
        int s = scanner.nextInt();
        if (s < 1 || s > 999) {
            System.out.println("Введено неверное значение");
            System.exit(-1);
        }
        System.out.println("Введите максимально возможную оценку (от 1 до 20): ");
        int f = scanner.nextInt();
        if (f < 1 || f > 20) {
            System.out.println("Введено неверное значение");
            System.exit(-2);
        }

        List arrayList = new ArrayList();
        for (int i = 0; i < s; i++) {
            arrayList.add((int) (Math.random() * f + 1));
        }
        System.out.println(arrayList);


        int y = f + 1;
        int r = 0;
        for (int p = 0; p < f; p++) {
            y--;
            Iterator<Integer> iterator = arrayList.iterator();
            for (int i = 0; i < s; i++) {
                Integer temp = iterator.next();
                if (temp == y) {
                    System.out.println(temp);
                    r = 21;
                    break;
                }

            }
            if (r == 21) {
                break;
            }
        }
    }
}
