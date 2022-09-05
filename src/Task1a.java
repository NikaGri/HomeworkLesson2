import java.util.Scanner;

public class Task1a {
    /*
а) товар А стоит (xx) руб и на него скидка 15%, а товар Б стоит (yy) руб.
Клиент взял 10 A и 2 Б.
Выведите итоговую цену
*/
    public static void main(String[] args) {
        // Task 1. a):
        Scanner console = new Scanner(System.in);

        System.out.println("Введите цену товара А: ");
        double А1 = console.nextDouble();
        double А = А1*0.85;

        System.out.println("Введите цену товара Б: ");
        double Б = console.nextDouble();

        System.out.println(10*А + 2*Б);
    }
}