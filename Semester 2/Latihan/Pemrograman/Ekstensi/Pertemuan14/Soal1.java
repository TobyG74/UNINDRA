import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buat array 2 dimensi untuk menampung data mahasiswa
        String[][] mahasiswa = new String[5][6];

        // Loop untuk memasukkan data mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NPM: ");
            mahasiswa[i][0] = scanner.nextLine();
            System.out.print("Nama: ");
            mahasiswa[i][1] = scanner.nextLine();
            System.out.print("Nilai UTS: ");
            mahasiswa[i][2] = scanner.nextLine();
            System.out.print("Nilai UAS: ");
            mahasiswa[i][3] = scanner.nextLine();
            System.out.print("Nilai Praktikum: ");
            mahasiswa[i][4] = scanner.nextLine();

            // salah kalkulasi, need to fixx... idk
            int nilaiUts = Integer.parseInt(mahasiswa[i][2]);
            int nilaiUas = Integer.parseInt(mahasiswa[i][3]);
            int nilaiPraktikum = Integer.parseInt(mahasiswa[i][4]);
            int nilaiAkhir = (nilaiUts + nilaiUas + nilaiPraktikum) / 3;
            mahasiswa[i][5] = String.valueOf(nilaiAkhir);

            System.out.println();
        }

        // Cetak data mahasiswa dalam bentuk tabel
        System.out.println("Data Mahasiswa:");
        System.out.println("----------------------------------------------------");
        System.out.println("| NPM\t| Nama\t| UTS\t| UAS\t| Praktikum\t| Akhir\t|");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + mahasiswa[i][0] + "\t| "
                    + mahasiswa[i][1] + "\t| " + mahasiswa[i][2] + "\t| "
                    + mahasiswa[i][3] + "\t| " + mahasiswa[i][4] + "\t\t| "
                    + mahasiswa[i][5] + "\t|");
        }
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}
