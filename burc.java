import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun, ay;
        System.out.println(
                "1-Ocak,\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        System.out.print("Hangi ayda doğdunuz tuşlayınız :");
        ay = input.nextInt();

        System.out.print("Hangi gün doğdunuz yazınız :");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun < 22) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Kova");
            }

        }
        if (ay == 2) {
            if (gun > 19) {
                System.out.println("Balık");
            } else {
                System.out.println("Kova");
            }
        }
        if (ay == 3) {
            if (gun < 21) {
                System.out.println("Balık");
            } else {
                System.out.println("Koç");
            }
        }
        if (ay == 4) {
            if (gun < 21) {
                System.out.println("Koç");
            } else {
                System.out.println("Boğa");
            }

        }
        if (ay == 5) {
            if (gun < 22) {
                System.out.println("Boğa");
            } else {
                System.out.println("İkizler");
            }
        }
        if (ay == 6) {
            if (gun < 22) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yengeç");
            }
        }
        if (ay == 7) {
            if (gun < 23) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Aslan");
            }

        }
        if (ay == 8) {
            if (gun < 23) {
                System.out.println("Aslan");
            } else {
                System.out.println("Başak");
            }
        }
        if (ay == 9) {
            if (gun < 23) {
                System.out.println("Başak");
            } else {
                System.out.println("Terazi");
            }
        }
        if (ay == 10) {
            if (gun < 23) {
                System.out.println("Terazi");
            } else {
                System.out.println("Akrep");
            }

        }
        if (ay == 11) {
            if (gun < 22) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yay");
            }
        }
        if (ay == 12) {
            if (gun < 23) {
                System.out.println("Yay");
            } else {
                System.out.println("Kova");
            }
        }
    }
}
