import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        // değişkenler
        int mat, fizik, kimya, turkce, muzik, tarih;

        // scanner sınıfı
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        double toplam = (mat + fizik + kimya + turkce + muzik + tarih);
        double ortalama = (toplam / 6);
        System.out.println(ortalama);

        String str = (ortalama > 60) ? "Geçti" : "Kaldı";
        System.out.println(str);

    }
}
