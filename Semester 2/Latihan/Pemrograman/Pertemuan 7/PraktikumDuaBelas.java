import java.util.Scanner;

public class PraktikumDuaBelas {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hari;
        String namaHari;
        
        System.out.print("Input Angka : "); hari = in.nextInt();
        
        if (hari == 1) {
            namaHari = "Senin";
        } else if (hari == 2) {
            namaHari = "Selasa";
        } else if (hari == 3) {
            namaHari = "Rabu";
        } else if (hari == 4) {
            namaHari = "Kamis";
        } else if (hari == 5) {
            namaHari = "Jumat";
        } else if (hari == 6) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Minggu";
        }
        
        System.out.println("Nama Hari = " + namaHari);
    }
}
