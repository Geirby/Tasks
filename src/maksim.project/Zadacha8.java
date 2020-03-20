package maksim.project;

import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) {
        System.out.println("Введите значение в метрах");
        double x = getUserInteger();
        System.out.println("Значение в сантиметрах " + getSantimeters(x));
        System.out.println("Значение в дациметрах " + getDecemeters(x));
        System.out.println("Значение в миллиметрах " + getMilimeters(x));
        System.out.println("Значение в милях " + getMiles(x));
    }


    public static int getUserInteger() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static double getSantimeters(double x) {
        return x / 100;
    }

    public static double getDecemeters(double x) {
        return x / 10;
    }

    public static double getMilimeters(double x) {
        return x / 1000;
    }

    public static double getMiles(double x) {
        return x * 1609.34;
    }

}
