package by.hardynets;

import java.util.*;

public class DeleteReplay {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов в коллекции (от 1 до 999): ");
        int s = scanner.nextInt();
        if (s < 1 || s > 999) {
            System.out.println("Введено неверное значение");
            System.exit(-1);
        }

        for (int i = 0; i < s; i++) {
            arrayList.add((int) (Math.random() * 11));
        }
        System.out.println("Перед сортировкой   :" + arrayList);
        int list = 0;
        Set<String> m = new LinkedHashSet<>(list);
        m.addAll(arrayList);
        System.out.println("После сортировки    :" + m);
        arrayList.clear();
        arrayList.addAll(m);
        System.out.println("Вернули в ArrayList :" + arrayList);
    }
}
/* Т.к. коллекции семейства Set не могут хранить дубликаты, то решил попробовать сделать таким образом. Получилось.
Поставленную задачу, считаю, выполнил.
Да, может птица летит за счёт вращения головой, а не взмахов крыльев, но летит.
 */
