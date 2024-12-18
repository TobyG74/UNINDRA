import java.util.Scanner;

public class Pertemuan_10_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        int umur = in.nextInt();
        System.out.print("Masukkan NPM Anda : ");
        String npm = in.next();
        System.out.print("Masukkan Tempat Lahir Anda : ");
        String tempatLahir = in.next();
        System.out.print("Masukkan Tanggal Lahir Anda : ");
        int tanggalLahir = in.nextInt();
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
    }
}
