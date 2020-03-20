package maksim.project;

import java.util.Scanner;

/*Пользователь с клавиатуры вводит четырёхзначное
число. Необходимо перевернуть число и отобразить
результат. Например, если введено 4512, результат 2154.*/
public class Zadacha10 {
    public static void main(String[] args) {
        System.out.println("введите число ");
        String  x = getUserString();
        System.out.println("перевернутое число "+isPolindrom(x));

    }
    public static String getUserString() {
        Scanner in = new Scanner(System.in);
        return in.next();

    }
    public static StringBuilder isPolindrom(String x) {
        StringBuilder string2 = new StringBuilder(x);
        return  string2.reverse();

    }
}
