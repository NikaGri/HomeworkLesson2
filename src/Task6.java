import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/*
В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное трёхзначное число: ");
        int n = console.nextInt();
        int a = n / 100;
        int b = n % 10;
        int c = n / 10;
        int c1 = c % 10;
        int n1 = a + b + c1;
        System.out.println("Ответ: " + n1);
    }
}
