import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int eleman = input.nextInt();
        int top1=0,top2=1;
        int sonuc;

        for(int i = 1; i <= eleman; i++){
            sonuc = top1 + top2;
            System.out.println(sonuc);
            top1=top2;
            top2=sonuc;
        }


    }
}
