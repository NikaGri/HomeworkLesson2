import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task3 {
    /*
Пусть x = 5, y = 10; Выведите на экран sqrt (xx + yy);
Это и есть гипотенуза треугольника со сторонами x, y.
*/
    public static void main(String[] args) {

        double x = 5;
        double y = 10;

        System.out.println(sqrt(x*x + y*y));

    }
}