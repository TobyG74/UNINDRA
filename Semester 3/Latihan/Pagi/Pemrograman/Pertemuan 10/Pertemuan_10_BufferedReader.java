import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pertemuan_10_BufferedReader {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Masukkan Nama Anda : ");
            String nama = in.readLine();
            System.out.print("Masukkan Umur Anda : ");
            int umur = Integer.parseInt(in.readLine());
            System.out.print("Masukkan NPM Anda : ");
            String npm = in.readLine();
            System.out.print("Masukkan Tempat Lahir Anda : ");
            String tempatLahir = in.readLine();
            System.out.print("Masukkan Tanggal Lahir Anda : ");
            String tanggalLahir = in.readLine();
            System.out.println();
    
            System.out.println("-------------------------------------------");
            System.out.println("             BIODATA MAHASISWA             ");
            System.out.println("-------------------------------------------");
            System.out.println("Nama\t\t: " + nama);
            System.out.println("Umur\t\t: " + umur);
            System.out.println("NPM\t\t: " + npm);
            System.out.println("Tempat Lahir\t: " + tempatLahir);
            System.out.println("Tanggal Lahir\t: " + tanggalLahir);
            System.out.println("-------------------------------------------");
    
            in.close();
        } catch (Exception e) {
            System.out.println("Gagal Membaca Input. Error : " + e.getMessage());
        }
    }
}
