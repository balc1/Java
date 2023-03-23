import java.util.Scanner;;

public class etkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sıcaklık;

        System.out.print("Sıcaklığı giriniz : ");
        sıcaklık = input.nextDouble();

        if (sıcaklık < 5) {
            System.out.println("Kayak Yap!");
        } else if ((sıcaklık < 10) && (sıcaklık >= 5)) {
            System.out.println("Sinemaya git!");
        } else if ((sıcaklık >= 15) && (sıcaklık < 25)) {
            System.out.println("Piknik Yap!");
        } else if ((sıcaklık >= 10) && (sıcaklık < 15)) {
            System.out.println("Sinemaya git!\nPiknik Yap!");
        } else {
            System.out.println("Havuza git!");
        }

    }
}
