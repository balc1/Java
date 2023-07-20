import java.util.Scanner;
import java.util.Arrays;
public class sorting_Array_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz :");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print((i + 1) + ". Elemanı Giriniz :");
            int deger = input.nextInt();
            list[i] = deger;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
