import java.util.Scanner;
public class desenMetot {
    static void desenMeto(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        int a = scan.nextInt();
        int b = a;
        int result = 0;
        System.out.println(a);
        for(int i = 5;i<a+5; i+=5){
            result = a-i;
            System.out.println(result);
        }
        int deger = 1;
        for(int i = 5; deger<b; i+=5){
            deger = result + i;
            System.out.println(deger);
        }

    }
    public static void main(String[] args) {
        desenMeto();
    }
}
