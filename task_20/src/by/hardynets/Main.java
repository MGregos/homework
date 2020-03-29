package by.hardynets;

public class Main {

    public static void main(String[] args) {
        String str = "    Выходы хореографу хомченко легализовать     ";
        str = ((str.trim()));
        char symbol;
        char symbol2;
        int n = 0;
        int t = str.length();
        for (int i = 0; i < t - 1; i++) {
            symbol = str.charAt(i);
            symbol2 = str.charAt(i + 1);
            if (i == 0 || (symbol != ' ' && symbol2 == ' ')) {
                System.out.print(symbol);

            }
            if (i == (t - 2) || symbol == ' ' && symbol2 != ' ') {
                System.out.print(symbol2);
            }
        }
    }
}
