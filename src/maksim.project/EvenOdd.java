package maksim.project;

/*Пользователь вводит с клавиатуры число. Необходимо проверить его на четность и нечетность. Если число
четное требуется вывести на экран число и надпись «Even
number». Если число нечетное выведите на экран число
и надпись «Odd number».*/
public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Введите число");
        int x = CommonMethods.getUserInteger();
        if (isEvenOdd(x)) {
            System.out.println("Even nubmer " + x);
        } else {
            System.out.println("odd number" + x);
        }

    }

    public static boolean isEvenOdd(int x) {
        return (x % 2 == 0);
    }

}
