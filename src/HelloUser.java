import java.util.Scanner;

public class HelloUser {
/*
Написать программу для вывода "Hello <User>" на консоль.
Пусть <user> вводиться с консоли, программа должна потребовать ввод <user>.
Для чтения с консоли используйте класс Scanner.
 */
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String user = console.nextLine();
        System.out.println("Hello, " + user + "!");
    }
}
