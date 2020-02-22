package by.hardynets.task_4;

import java.util.Scanner;

public class Rectangle_In_A_Circle {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону прямоугольника 1: ");
        double a = in.nextDouble();

        System.out.print("Введите сторону прямоугольника 2: ");
        double b = in.nextDouble();

        System.out.print("Введите радиус картонки, которой хотите прикрыть отверстие: ");
        double r = in.nextDouble();

        if ((Math.sqrt(a * a + b * b) / 2) < r) {
            System.out.println("Поздравляем, Вы нашли ту самую картонку");
        }
        else if ((Math.sqrt(a * a + b * b) / 2) == r) {
            System.out.println("Воу воу воу, Вы ходите по крайне тонкому льду. Но картонка прикроет то, что Вы хотите");
        }
         else {
            System.out.println("Увы, картонка не прикроет то, что Вы хотите");
        }
    }
}
