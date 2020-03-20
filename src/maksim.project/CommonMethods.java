package maksim.project;

import java.util.Scanner;

public class CommonMethods {
    public static int getUserInteger() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String getUserString () {
        Scanner in = new Scanner(System.in);
        return in.next();

    }

}
