import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayısı :");
        n = input.nextInt();

        for (int i = n; i >=0  ; i--) {
            for (int b = (n - i); b >0 ; b--) {
                System.out.print(" ");
            }
            for (int y = (2 * i + 1); y >=1 ; y--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
