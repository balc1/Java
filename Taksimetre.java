import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km, min;

        Scanner input = new Scanner(System.in);

        System.out.print("KM uzunluğunu giriniz : ");
        km = input.nextInt();

        double a = (km * 2.2 + 10) > 20 ? (km * 2.2 + 10) : 20;

        System.out.println(a);

    }
}
