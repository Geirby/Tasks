package maksim.project;

import java.util.Scanner;

/*Напишите программу, вычисляющую площадь квадрата. Пользователь с клавиатуры вводит размер стороны
квадрата*/
public class Zadacha5 {
    public static void main(String[] args) {
        System.out.println("Введите сторону квадрата");
        int x = getUserInteger();
        System.out.println("Площадь квадрата равна: "+getSquare(x));

    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getSquare (int x){
        return x*x;
    }
}
