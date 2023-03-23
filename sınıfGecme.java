import java.util.Scanner;

public class sınıfGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Mat, Fiz, Turk, Kim, Muzik;
        double sum = 0;

        System.out.print("Matematik notunuz? : ");
        Mat = input.nextInt();
        if ((Mat < 0) || (Mat > 100)) {
            System.out.println("Hatalı giriş, ders notu ortalamaya eklenmeyecek!");
        } else {
            sum += Mat;
        }

        System.out.println("Fizik notunuz ? : ");
        Fiz = input.nextInt();
        if ((Fiz < 0) || (Fiz > 100)) {
            System.out.println("Hatalı giriş, ders notu ortalamaya eklenmeyecek!");
        } else {
            sum += Fiz;
        }

        System.out.print("Türkçe notunuz ? : ");
        Turk = input.nextInt();
        if ((Turk < 0) || (Turk > 100)) {
            System.out.println("Hatalı giriş, ders notu ortalamaya eklenmeyecek!");
        } else {
            sum += Turk;
        }

        System.out.print("Kimya notunuz ? : ");
        Kim = input.nextInt();
        if ((Kim < 0) || (Kim > 100)) {
            System.out.println("Hatalı giriş, ders notu ortalamaya eklenmeyecek!");
        } else {
            sum += Kim;
        }
        System.out.print("Müzik notunuz ? : ");
        Muzik = input.nextInt();
        if ((Muzik < 0) || (Muzik > 100)) {
            System.out.println("Hatalı giriş, ders notu ortalamaya eklenmeyecek!");
        } else {
            sum += Muzik;
        }

        double ortalama = (sum / 5);

        if (sum <= 55) {
            System.out.println("Kaldın eşşek");
        } else {
            System.out.println("Tebrikler geçtiniz!");
        }

        System.out.println("Ortalamanız :" + ortalama);
    }
}
