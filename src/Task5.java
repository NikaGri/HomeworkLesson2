import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*
В переменных q и w хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления q на w с остатком.
*/
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число q: ");
        int q = console.nextInt();

        Scanner cons = new Scanner(System.in);
        System.out.println("Введите натуральное число q: ");
        int w = cons.nextInt();

        int a = q/w;
        int b = q%w;

        System.out.println("Ответ: " + a);
        System.out.println("Остаток: " + b);
    }
}