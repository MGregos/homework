package by.hardynets;

import java.util.Scanner;

public class StudentRating {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество учеников в классе (от 1 до 40): ");
        int a = in.nextInt();
        if (a < 1 || a > 40) {
            System.out.println("Внимательно читайте строку выше, программа закрывается");
            System.exit(0);
        }


        int[] marks = new int[a];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("[" + i + "]" + "Ученик №" + (i + 1)  + " = " + marks[i]);
        }
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i])
                maxMark = marks[i];
        }
        System.out.println("Максимальная оценка = " + maxMark);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxMark) {
                System.out.println("Максимальная оценка у " + "[" + i + "]" + "Ученик" +  " № " + (i + 1));
            }
        }
    }
}
