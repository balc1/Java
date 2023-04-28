import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz :");
        sayi = input.nextInt();
        int toplam=0;
        for(int i=1;i < sayi;i++){
            if(sayi%i==0){
                toplam += i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
