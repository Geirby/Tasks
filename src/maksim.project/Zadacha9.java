package maksim.project;

import java.util.Scanner;

/*Напишите программу, вычисляющую площадь треугольника. Пользователь с клавиатуры вводит размер
основания треугольника и размер высоты.*/
public class Zadacha9 {
    public static void main(String[] args) {
        System.out.println("Введите основание треугольника ");
        double x = getUserInteger();
        System.out.println("Введите высоту треугольника ");
        double h = getUserInteger();
        System.out.println("Площадь труегольника: " + getSquare(x, h));

    }

    public static double getUserInteger() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static double getSquare(double x, double h) {
        return 0.5 * x * h;
    }
}
