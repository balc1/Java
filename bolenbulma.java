import java.util.Scanner;

public class bolenbulma {
    public static void main(String[] args) {
        int k, adet = 0, top = 0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                top += i;
                adet++;
            }
        }
        ort = top / adet;
        System.out.println(ort);
    }
}