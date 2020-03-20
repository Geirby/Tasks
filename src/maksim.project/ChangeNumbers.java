package maksim.project;


public class ChangeNumbers {
    public static void main(String[] args) {
        System.out.println("Введите целое 6-значное число");
        int x = CommonMethods.getUserInteger();
        String y = String.valueOf(x);

        if (getCountsOfDigits(x) == 6) {
            System.out.println(replaceNumbers(y));
        } else {
            System.out.println("Вы ввели неправильное значение");
        }

    }

    public static int getCountsOfDigits(int x) {
        return String.valueOf(x).length();
    }

    public static String replaceNumbers(String y) {
        String deff = y;
        char first = deff.charAt(0);
        char second = deff.charAt(1);
        char third = deff.charAt(2);
        char fourth = deff.charAt(3);
        char fifth = deff.charAt(4);
        char sixth = deff.charAt(5);
        /*String replace = deff.substring(first, sixth);
        String replace1 = deff.substring(sixth, first);
        String replace2 = deff.substring(fifth, second);
        String replace3 = (second, fifth);*/
        String replace = String.join("",String.valueOf(sixth),String.valueOf(fifth),String.valueOf(third),String.valueOf(fourth),String.valueOf(second),String.valueOf(first));
        return replace;
    }


}
