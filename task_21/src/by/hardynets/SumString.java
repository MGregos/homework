package by.hardynets;


public class SumString {


    public static void main(String[] args) {
        String str = "";

        long startString = System.currentTimeMillis();

        int i;
        for (i = 0; i < 20000; i++){
            str += i + " " + "крокозябра" + " ";
            if (i%30 == 0){
                str += "\n";
            }
        }
        System.out.println(str);
        long endString = System.currentTimeMillis() - startString;
        System.out.println("Время выполнения цикла = " + endString + " мсек");

        StringBuilder str2 = new StringBuilder("");
        long startStringBuilder = System.currentTimeMillis();
        for (i = 0; i < 20000; i++){
            str2.append(i).append(" ").append("крокозябра").append(" ");
            if (i%30 == 0){
                str2.append("\n");
            }
        }
        System.out.println(str2);

        long endStringBuilder = System.currentTimeMillis() - startStringBuilder;
        System.out.println("Время выполнения цикла со StringBuilder = " + endStringBuilder + " мсек");
        System.out.println("Время выполнения программы сложение строк String = " + endString + " мсек");
        System.out.println("Разница времени выполнения состовляет " + (endString - endStringBuilder) + " мсек");
        System.out.println("А это разница в "+ (endString / endStringBuilder) + " раз(а)");


    }
}
