import java.util.Scanner;

public class Task1c {
    /*
в) товар А стоит (xx) руб и на него скидка 10%, а товар Б стоит (yy) руб.
Клиент взял 2 A и 3 Б.
Выведите итоговую цену.
*/
    public static void main(String[] args) {
        // Task 1. a):
        Scanner console = new Scanner(System.in);

        System.out.println("Введите цену товара А: ");
        double А1 = console.nextDouble();
        double А = А1*0.9;

        System.out.println("Введите цену товара Б: ");
        double Б = console.nextDouble();

        System.out.println(2*А + 3*Б);
    }
}