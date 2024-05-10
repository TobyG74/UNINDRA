import java.util.Scanner;

public class KategoriUsia {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int usia;
        String kategori;
        
        System.out.print("Masukan Usia Anda : "); usia = in.nextInt();
        
        if (usia >= 1 && usia <= 16) {
            kategori = "Anak-anak";
        } else if (usia >= 17 && usia <= 25) {
            kategori = "Remaja";
        } else {
            kategori = "Dewasa";
        }
        
        System.out.println("Kategori Usia Anda adalah " + kategori);
    }
}
