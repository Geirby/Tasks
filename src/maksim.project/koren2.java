package maksim.project;

import java.util.Scanner;

public class koren2 {
    public static double kvkoren() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = in.nextInt();
        return Math.sqrt(num);

    }

    public static void main(String[] args) {
        double x = kvkoren();
        System.out.println("Корень числа:" + x);
    }
}

