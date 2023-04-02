import java.util.Scanner;

public class artıkYıl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yıl;

        System.out.print("Yılı giriniz :");
        yıl = input.nextInt();

        if ((yıl % 100) == 0) {
            if (yıl % 400 == 0) {
                System.out.println(yıl + " " + "Artık yıldır");
            } else {
                System.out.println(yıl + " " + "Artık yıl değildir");
            }
        } else if (yıl % 4 == 0) {
            System.out.println(yıl + " " + "Artık yıldır");
        } else {
            System.out.println(yıl + " " + "Artık yıl değildir");
        }

    }
}
