import java.math.BigInteger;
import java.util.Scanner;

public class Lab2{

    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner a = new Scanner(System.in);
        while (!a.hasNextInt()) {
            System.out.println("Ошибка ввода");
            a.next();
        }
        int n = a.nextInt();
        System.out.print("Введите число x : ");
        Scanner b = new Scanner(System.in);
        while (!b.hasNextInt()) {
            System.out.println("Ошибка ввода");
            b.next();
        }
        int x = b.nextInt();
        if (n >= 15 || n < 1) {
            System.out.println("Неверное значение");
            return;
        }
        BigInteger degree = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++){
            BigInteger mult = BigInteger.valueOf(x);
            degree = degree.multiply(mult);
        }
        System.out.println("x в степени n = " + degree.toString());
        a.close();
    }
}