import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,Password;
        System.out.println("Lütfen giriş yapınız!");
        int hak = 3;
        int secim;
        int balance = 3000;
        int para;
        int cek;

        while (hak != 0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Şifreniz :");
            Password = input.nextLine();
            if(userName.equals("admin") && Password.equals("1234")){
                System.out.println("Giriş Yaptınız!");


                while (hak > 0){
                    System.out.println("1-Bakiye Sorgu\n"+ "2-Para Yatırma\n"+ "3-Para Çekme\n"+ "4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz :");
                    secim = input.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutar :");
                            para = input.nextInt();
                            System.out.println("Yeni Bakiye :" + (balance += para));
                            break;
                        case 3:
                            System.out.print("Çekmek istediğiniz tutar :");
                            cek = input.nextInt();
                            if(cek > balance){
                                System.out.println("Hatalı işlem");
                            }else {
                                System.out.println("Yeni Bakiye :" + (balance -= cek));
                            }
                            break;
                        case 4:
                            hak = 0;


                    }
                }
            }else{
                hak--;
                System.out.println("Yanlış girdiniz!" + "Kalan hak " + hak);
                if(hak == 0){
                    System.out.println("Hesabınız bloke olmuştur!");
                }
            }
        break;
        }

    }
}
