import java.util.Scanner;
public class AsalRecursive {


    static void Recursive(){
        boolean deger  = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz :");
        int a = scan.nextInt();
        int result;
        if(a == 1 || a == 2){
            System.out.println("Sayı asaldır!");

        }
        for (int i = 2; i < a; i++){
            result = a % i;

            if (result != 0){
                System.out.println("Sayı asaldır!");
                break;
            }else {
                System.out.println("Sayı asal değildir!");
                break;
            }
        }
    }


    public static void main(String[] args) {
        Recursive();
    }
}
