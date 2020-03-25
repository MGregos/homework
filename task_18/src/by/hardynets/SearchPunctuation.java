package by.hardynets;

public class SearchPunctuation {

    public static void main(String[] args) {
        String str = "Тестовая строка, , которая содержит: : точку с запятой; знак вопроса? Восклицательный знак! Точку.";
        int n = 0;
        char symbol;
        for(int i = 0; i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == ';' || symbol == ':'|| symbol == '!'|| symbol == '?')
                n++;
        }
        System.out.println(str);
        System.out.println("Общее количетво знаков препинания = " + n);

    }
}
/* Можно было написать отдельные циклы на поиск конкретных элементов (сколько точек, запятых и т.д),
но в задании сказано про их общее кол-во, так что получаем такой примитивный код.
 */
