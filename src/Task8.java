import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*
Запустите код. Подумайте, почему программа выдаст отрицательное число вместо двух миллиардов:
public static void main(String[] args) { System.out.println("Привет!");
int z = 2147483647+1; System.out.println(z); }}
*/
        System.out.println("Привет!");
        int z = 2147483647+1;
        System.out.println(z); }
}
// потому что int имеет 4 байта, влезет только 2147483647,
// затем обнулится и сложение будет производиться к отрицательному значению, кторое вмещается в int.