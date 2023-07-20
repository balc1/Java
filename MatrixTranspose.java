import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan alın
        System.out.print("Enter the number of matrix rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of matrix col: ");
        int cols = scanner.nextInt();

        // Matrisi oluşturun ve elemanları kullanıcıdan alın
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluşturun ve değerlerini doldurun
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        // Transpoz matrisini ekrana yazdırın
        System.out.println("Matrix Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
