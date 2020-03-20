package maksim.project;

import java.util.Scanner;

/*Пользователь вводит с клавиатуры два числа. Необходимо найти сумму чисел, разницу чисел, произведение
числе. Результат вычислений вывести на экран.*/
public class Zadacha3 {
    public static void main(String[] args) {
        System.out.println("Введите первое чилсо");
        int x = getUserInteger();
        System.out.println("Введите второе чилсо");
        int y = getUserInteger();
        System.out.println("сложение: " + getSum(x,y) );
        System.out.println("вычитание: "+ getSubtaction(x,y));
        System.out.println("умножение: "+ getMultiplication(x,y));

    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getSum (int x, int y){
                return x+y ;
    }
    public static int getSubtaction (int x, int y){
        return x-y ;
    }
    public static int getMultiplication (int x, int y){
        return x*y ;
    }

}

