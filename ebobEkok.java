import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("1.Sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        n2 = input.nextInt();
        int i = n1;
        while ( i >= 1 ){
            if(n1%i == 0 && n2%i == 0){
                System.out.println("EBOB :" + i);
                break;
            }else {
                i--;
            }

        }
        int k = n1*n2;
        int ekok=1;
        while (k>=1){
            if(k%n1== 0 && k%n2==0){
            ekok = k;
            }
            k--;
            }
        System.out.println("EKOK :"+ ekok);
        }


    }

