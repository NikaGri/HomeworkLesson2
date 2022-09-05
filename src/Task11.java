import java.util.Scanner;

public class Task11 {
    /*
Перевод чисел из десятичной системы исчисления в n-систему исчисления
*/
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();

            // Бинарный формат числа
            String convert = Integer.toBinaryString(number);
            System.out.println("Бинарная система: " + convert);

            // Восьмиричная форма
            convert = Integer.toOctalString(number);
            System.out.println("Восьмиричная система: " + convert);

            // Шестнадцатиричная форма
            convert = Integer.toHexString(number).toUpperCase();
            System.out.println("Шестнадцатеричная система: " + convert);
        }
    }