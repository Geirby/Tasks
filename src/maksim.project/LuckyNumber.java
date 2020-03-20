package maksim.project;

import java.util.ArrayList;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println("Введите целое 6-значное число");
        int x = CommonMethods.getUserInteger();
        if (getCountsOfDigits(x) != 6) {
            System.out.println("Вы ввели неправильное значение");
        } else {
            ArrayList<Integer> z = createdColection(x);
            if (isLuckyNumber(z)) {

                System.out.println("Счастилове число");
            } else {
                System.out.println("Не счастилвове число");
            }
        }
    }

    public static int getCountsOfDigits(int x) {
        return String.valueOf(x).length();
    }

    public static ArrayList<Integer> createdColection(int x) {
        ArrayList<Integer> luckyNubmers = new ArrayList<>();
        int sum = 0;
        while (x > 0) {
            sum = x % 10;
            x /= 10;
            luckyNubmers.add(sum);
        }
        return luckyNubmers;
    }

    public static boolean isLuckyNumber(ArrayList<Integer> z) {
        int y = z.get(0) + z.get(1) + z.get(2);
        int t = z.get(3) + z.get(4) + z.get(5);
        return t == y;

    }

}
