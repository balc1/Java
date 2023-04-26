import java.util.Scanner;
public class BasamakTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,basValue;
        System.out.print("Sayıyı giriniz :");
        number = input.nextInt();
        int tempNumber = number;
        int toplam = 0;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            toplam += basValue;
            tempNumber /= 10;
        }
        System.out.println(toplam);



    }
}
