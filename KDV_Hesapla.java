import java.util.Scanner;

public class KDV_Hesapla {
    public static void main(String[] args) {

        int fiyat;

        Scanner input = new Scanner(System.in);

        fiyat = input.nextInt();

        double KDV = (fiyat * 0.18);

        System.out.print("Vergisiz fiyat : ");
        System.out.println(fiyat);

        System.out.print("KDV Tutarı : ");
        System.out.println(KDV);

        Double kdvlifiyat = (KDV + fiyat);

        System.out.print("KDV'li Fiyat : ");
        System.out.println(kdvlifiyat);

    }
}
