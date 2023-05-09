import java.util.Scanner;
public class Recursive {
    static void Recursive(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int a = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int b = scan.nextInt();
        int result = 1;
        for (int i = 1; i<= b; i++){
            result *= a;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Recursive();
    }
}
