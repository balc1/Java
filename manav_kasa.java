import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        double armut, elma, domates, muz, patlıcan;

        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.0;

        System.out.print("Armut kaç kilo : ");
        armut = girdi.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elma = girdi.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domates = girdi.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muz = girdi.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        patlıcan = girdi.nextDouble();

        double toplam = (armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlıcan * p);
        System.out.println(toplam);

    }
}
