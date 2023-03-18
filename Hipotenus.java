import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b, Hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("1. kenar uzunluğunu yazınız : ");
        a = input.nextInt();
        System.out.print("2. kenar uzunluğunu yazınız : ");
        b = input.nextInt();

        double Hipo = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenus : ");
        System.out.println(Hipo);

    }
}