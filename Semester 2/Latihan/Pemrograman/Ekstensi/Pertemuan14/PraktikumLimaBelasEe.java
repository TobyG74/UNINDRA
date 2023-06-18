import java.util.Scanner;

public class PraktikumLimaBelasEe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] x = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print("Masukan Nilai ke [" + i + "][" + j + "]: ");
                x[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Data didalam Array");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}
