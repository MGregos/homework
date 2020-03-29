package by.hardynets;


public class SearchWords {

    public static void main(String[] args) {

        String str = " Один   два три : четыре  пять шесть - семь (восемь): девять    ;     десять; одиннадцать   . Двеннадцать  . ";
        str = ((str.trim()));
        System.out.println(str);

        char symbol;
        char symbol2;
        int n = 0;
        int t = str.length();
        for (int i = 0; i < t - 1; i++) {
            symbol = str.charAt(i);
            symbol2 = str.charAt(i + 1);
            if (symbol == ' ' || (symbol != ' ' && symbol2 == ')')) {
                n++;
            }
            if ((symbol == ' ' && symbol2 == ' ') || (symbol == ' ' && symbol2 == ',') ||
                    (symbol == ' ' && symbol2 == '.') || (symbol == ' ' && symbol2 == ':') ||
                    (symbol == ' ' && symbol2 == ';') || (symbol == ' ' && symbol2 == '!') ||
                    (symbol == ' ' && symbol2 == '?') || (symbol == ' ' && symbol2 == '(') ||
                    (symbol == ' ' && symbol2 == ')') || symbol == '-' || symbol == '+') {
                n--;
            }

        }
        n += 1;
        System.out.println("В строке " + n + " слов");

    }
}
