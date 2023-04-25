import java.util.Scanner;
;public class Kumeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, rfak = 1, nfak = 1;
        System.out.print("N i giriniz :");
        n = input.nextInt();
        System.out.print("R yi giriniz :");
        r = input.nextInt();
        int nerfak=n-r;

        for (int i = 1; i <= n; i++) {
            nfak = nfak * i;
        }
        System.out.println(nfak);
        for (int i = 1; i <= r; i++) {
            rfak = rfak * i;
        }
        System.out.println(rfak);
        for (int i = 1; i <= nerfak; i++) {
            nerfak = nerfak * i;
        }

        System.out.println(nfak/(rfak * nerfak));
    }
}
