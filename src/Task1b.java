import java.util.Scanner;

public class Task1b {
    /*
б) товар А стоит (xx) руб и на него скидка 50%, а товар Б стоит (yy) руб.
Клиент взял 7 A и 1 Б.
Выведите итоговую цену.
*/
    public static void main(String[] args) {
        // Task 1. a):
        Scanner console = new Scanner(System.in);

        System.out.println("Введите цену товара А: ");
        double А1 = console.nextDouble();
        double А = А1*0.5;

        System.out.println("Введите цену товара Б: ");
        double Б = console.nextDouble();

        System.out.println(7*А + 1*Б);
    }
}