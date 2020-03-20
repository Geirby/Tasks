package maksim.project;

import java.util.Scanner;
/*Пользователь вводит с клавиатуры число, состоящее
из четырех цифр. Требуется найти произведение цифр.
Например, если с клавиатуры введено 1324, тогда результат произведения 1*3*2*4 = 24.
*/
public class Zadacha7 {
    public static void main(String[] args) {
        System.out.println("Введите первую цифру");
        int x = getUserInteger();
        System.out.println("Введите вторую цифру");
        int y = getUserInteger();
        System.out.println("Введите третью цифру");
        int z = getUserInteger();
        System.out.println("Введите четвертую цифру");
        int c = getUserInteger();
        System.out.println("Результат: "+getMultiplication(x,y,z,c));

    }
    public static int getUserInteger (){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int getMultiplication (int x, int y, int z, int c){
        return x*y*z*c;
    }

}