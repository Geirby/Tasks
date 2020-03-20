package maksim.project;

import java.util.Scanner;
/*Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.*/
public class Zadacha6 {
    public static void main(String[] args) {
        System.out.println("Введите первую цифру");
        int x = getUserInteger();
        System.out.println("Введите вторую цифру");
        int y = getUserInteger();
        System.out.println("Введите третью цифру");
        int z = getUserInteger();
        System.out.println("Результат: "+x+y+z);

    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
