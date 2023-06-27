public class PraktikumLimaBelasCc {
    public static void main(String[] args) {
        int[][] x = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] y = {
                {3, 6, 1},
                {-4, 7, 9}
        };

        int baris = 2;
        int kolom = 3;

        int[][] z = new int[baris][kolom];

        System.out.println("ini adalah matrix x");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ini adalah matrix y");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil Pengurangan");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                z[i][j] = x[i][j] - y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
