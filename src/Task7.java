import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
/*
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
*/
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое дробное число: ");
        float n = console.nextFloat();

        float a = Math.round(n);
        System.out.println(a);
    }
}
