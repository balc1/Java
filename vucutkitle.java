import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu girin (m) : ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu girin : ");
        kilo = inp.nextInt();

        double endeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz : " + endeks);

    }
}
