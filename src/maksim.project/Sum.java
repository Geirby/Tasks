package maksim.project;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Введите слово");
        int num1 = getUserInteger();
        System.out.print("Введите второе число:");
        int num2 = getUserInteger();
        System.out.println("Сумма двух чисел:" + getSum(num1,num2));
    }
    public static int getSum(int num1, int num2){
        return num1+num2;
    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}


