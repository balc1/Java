import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {

        int repass;
        String userName, password, yenisifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifre giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarıyla giriş yaptınız ! ");

        } else if (!password.equals("java123")) {

            System.out.println("Şifre yanlış");

            System.out.println("Yeni şifre oluşturmak ister misiniz?");
            System.out.println("1-Yeni şifre\n2-Hayır");
            repass = input.nextInt();

            switch (repass) {
                case 1:
                    System.out.print("Yeni şifre : ");
                    yenisifre = input.next();
                    if (yenisifre.equals(password)) {
                        System.out.println("Şifre oluşturulamadı ! ");
                    } else {
                        System.out.println("Şifre başarıla oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("İşleminiz sonlandırıldı ! ");
                    break;
            }

        } else {
            System.out.println("Bilgiler yanlış ! ");
        }
    }

}