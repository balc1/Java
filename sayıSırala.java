import java.util.Scanner;

public class sayıSırala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1. Sayıyı giriniz :");
        a = input.nextInt();

        System.out.print("2. Sayıyı giriniz :");
        b = input.nextInt();

        System.out.print("3. Sayıyı giriniz :");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("A > B > C");
            } else {
                System.out.println("A > C > B");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("B > A > C");
            } else {
                System.out.println("B > C > A");
            }
        } else {
            if (a > b) {
                System.out.println("C > A > B");
            } else {
                System.out.println("C > B > A");
            }
        }
    }
}