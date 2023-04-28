import java.util.Scanner;
public class minMaxFin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı giriceksiniz ? :");
        int n = input.nextInt();
        int k;
        int enBuy = 0,enKuc = 999999999;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz :");
            k = input.nextInt();
            if(k < enKuc){
                enKuc = k;
            }if(k > enBuy){
                enBuy = k;
            }

        }
        System.out.println("En küçük sayı :"+enKuc);
        System.out.println("En büyük sayı :"+enBuy);
    }
}
