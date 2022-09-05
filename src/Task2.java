import java.util.Scanner;

public class Task2 {
    /*
Пусть цена товара A обычно составляет (xx) руб, и товара B составляет (yy) руб.
Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
Выведите на экран переменную, которая стоимости суммы A+B со скидкой.
Отдельно выведите на экран сумму скидки от этой покупки.
 */
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите цену товара А: ");
        double А = console.nextDouble();

        System.out.println("Введите цену товара Б: ");
        double Б = console.nextDouble();

        double a = (А + Б)*0.9;
        double b = (А + Б)*0.1;

        System.out.println("Сумма за два товара: " + a);
        System.out.println("Скидка составила: " + b);
    }
}