package by.hardynets;
import java.util.Scanner;
public class Cheater {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое нужно разделить на разряды: ");
        int s = in.nextInt();

        int a = 1000;
        int k;
        int i;
        int t = s;
        for (i = 0; t > 1; i++){

            t /= a;
        }
        t = s;
        System.out.print("Обычный метод: ");
        for(; i >= 0; i--){
            k = (int) (t / Math.pow(a, i));

            if (k == 0){
                System.out.print(" 000");
            } else System.out.print(" " + k);

            t -= k * Math.pow(a,i);
        }


      System.out.printf("\n" + "Читерский метод: " + "%,d", s);

    }
}
