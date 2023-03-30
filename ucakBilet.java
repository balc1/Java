import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, yas, gelgit, Toptutar, kmH;
        double gitind, yasin;

        System.out.print("Gideceğiniz uzaklığı yazınız (km) :");
        km = input.nextInt();

        System.out.print("Yaşınızı yazınız :");
        yas = input.nextInt();

        System.out.println("1-Gidiş-Dönüş\n2-Gidiş");
        gelgit = input.nextInt();

        if (gelgit > 0 && km > 0 && yas > 0) {
            if (yas < 12) {
                if (gelgit == 1) {
                    kmH = km / 10;
                    Toptutar = (kmH / 2) * 2;
                    gitind = Toptutar * 0.20;
                    System.out.println(Toptutar - gitind);
                } else if (gelgit == 2) {
                    kmH = km / 10;
                    Toptutar = (kmH / 2);
                    System.out.println(Toptutar);
                }

            } else if (yas >= 12 && yas <= 24) {
                if (gelgit == 1) {
                    kmH = km / 10;
                    yasin = kmH * 0.10;
                    Toptutar = (int) ((kmH - yasin) * 2);
                    gitind = Toptutar * 0.20;
                    System.out.println(Toptutar - gitind);
                } else if (gelgit == 2) {
                    kmH = km / 10;
                    yasin = kmH * 10;
                    Toptutar = (int) (kmH - yasin);
                    System.out.println(Toptutar);
                }
            } else if (yas > 65) {
                if (gelgit == 1) {
                    kmH = km / 10;
                    yasin = kmH * 0.30;
                    Toptutar = (int) ((kmH - yasin) * 2);
                    gitind = Toptutar * 0.20;
                    System.out.println(Toptutar - gitind);
                } else if (gelgit == 2) {
                    kmH = km / 10;
                    yasin = kmH * 0.30;
                    Toptutar = (int) (kmH - yasin);
                    System.out.println(Toptutar);
                }
            }

        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}