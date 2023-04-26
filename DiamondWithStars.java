import java.util.Scanner;
public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int b = 0; b < (n - i); b++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * i + 1); y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
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