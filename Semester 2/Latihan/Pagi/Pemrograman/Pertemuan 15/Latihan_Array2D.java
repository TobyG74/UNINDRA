import java.util.Scanner;

/*
 * Nama : Tobi Saputra
 * NPM : 202243502612
 * Kelas : R27
 */

public class Latihan_Array2D {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int jumlah_baris, jumlah_kolom;
        int[][] data;
        
        System.out.print("Masukkan banyak baris : "); jumlah_baris = in.nextInt();
        System.out.print("Masukkan banyak kolom : "); jumlah_kolom = in.nextInt();
        
        data = new int[jumlah_baris][jumlah_kolom];
        
        for (int i = 0; i < jumlah_baris; i++) {
            for (int j = 0; j < jumlah_kolom; j++) {
                System.out.printf("Masukkan nilai array ke [%s][%s] : ", i, j);
                data[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < jumlah_baris; i++) {
            for (int j = 0; j < jumlah_kolom; j++) {
                System.out.printf("[%s][%s] : %s \t", i, j, data[i][j]);
            }
            System.out.println();
        }
    }
}
