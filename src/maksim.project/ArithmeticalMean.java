package maksim.project;


import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticalMean {
    public static void main(String[] args) {
        System.out.println("введите первое число");
        int x = CommonMethods.getUserInteger();
        System.out.println("введите второе число");
        int y = CommonMethods.getUserInteger();
        System.out.println("введите третье число");
        int z = CommonMethods.getUserInteger();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(x);
        arrayList.add(y);
        arrayList.add(z);
        System.out.println("введите max либо min либо mean ");
        String p = CommonMethods.getUserString();
        getResult(p, x, y, z, arrayList);
    }

    public static int getMaximum(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);

    }

    public static int getMinimum(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);

    }

    public static int getMean(int x, int y, int z) {
        return (x + y + z) / 3;

    }

    /*public static void getResult(String p, int x, int y, int z, ArrayList<Integer> arrayList) {
        System.out.println("результат вычесления");
        if (p.equals("max")) {
            System.out.println(getMaximum(arrayList));
        } else if (p.equals("min")) {
            System.out.println(getMinimum(arrayList));
        } else {
            System.out.println(getMean(x, y, z));

        }*/
    public static void getResult(String p, int x, int y, int z, ArrayList<Integer> arrayList) {
        switch (p) {
            case ("max"):
                System.out.println(getMaximum(arrayList));
                break;
            case ("min"):
                System.out.println(getMinimum(arrayList));
                break;
            case("mean"):
                System.out.println(getMean(x, y, z));
                break;
        }
    }
}