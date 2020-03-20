package maksim.project;

public class SummAndMultiplication {
    public static void main(String[] args) {
        System.out.println("введите первое число");
        int x = CommonMethods.getUserInteger();
        System.out.println("введите второе число");
        int y = CommonMethods.getUserInteger();
        System.out.println("введите третье число");
        int z = CommonMethods.getUserInteger();
        System.out.println("введите + для суммы чисел " + " введите * для произведения чисел");
        String p = CommonMethods.getUserString();
        getResult(p, x, y, z);
    }

    public static int getSumm(int x, int y, int z) {
        return x + y + z;
    }

    public static int getMultipication(int x, int y, int z) {
        return x * y * z;
    }

    public static void getResult(String p, int x, int y, int z) {
        System.out.println("результат вычесления");
        if (p.equals("+")) {
            System.out.println(getSumm(x, y, z));
        } else {
            System.out.println(getMultipication(x, y, z));
        }
    }
}
