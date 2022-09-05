import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task4 {
    /*
Пусть x = , y = ; Выведите на экран sqrt (xx + yy);
Это и есть гипотенуза треугольника со сторонами x, y.
(Про sqrt узнайте у гугла что это и как добавить его в проект.)
Для чисел введенных с клавиатуры.
*/
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите длину стороны х: ");
        double x = console.nextDouble();

        System.out.println("Введите длину стороны y: ");
        double y = console.nextDouble();

        System.out.println("Гипотенуза равна: " + sqrt(x*x + y*y));
    }
}