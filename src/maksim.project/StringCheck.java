package maksim.project;

import java.util.Scanner;

public class StringCheck {


    public static void main(String[] args) {
        System.out.println("Введите фразу или слово");
        String x = getString();
        if (isPolindrom(x)) {
            System.out.println("polindrom");
        } else {
            System.out.println("her");
        }


    }

    public static String getString() {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Введите фразу или слово");
        return scan.nextLine();
    }

    public static boolean isPolindrom(String string) {
        StringBuilder string2 = new StringBuilder(string);
        string2.reverse();
        return string.equals(string2.toString());
    }
}