public class PraktikumLimaBelasBb {
    public static void main(String[] args) {
        int[][] ints = {
                {5, 4, 2, 1, 5},
                {9, 6, 5, 7, 8},
                {5, 2, 1, 5, 10}
        };

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(ints[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }
}
