package maksim.project;

import java.util.Scanner;

/*Пользователь вводит с клавиатуры два числа. Первое
число — это значение, второе число процент, который
необходимо посчитать. Например, мы ввели с клавиатуры
50 и 10. Требуется вывести на экран 10 процентов от 50.
Результат: 5.*/
public class Zadacha4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int x = getUserInteger();
        System.out.println("Введите процент");
        int y = getUserInteger();
        System.out.println(y+" Процентов от числа " +x+ " равно: " + getPercent(x,y));

    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getPercent (int x, int y){
        return (x*y/100);
    }
}
