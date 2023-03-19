import java.util.Scanner;

public class daire {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r;

        double pi = 3.14;

        System.out.print("Dairenin yarı çapı : ");
        r = input.nextInt();

        double alan = r * pi * r;
        double cevre = 2 * pi * r;

        System.out.println("dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
