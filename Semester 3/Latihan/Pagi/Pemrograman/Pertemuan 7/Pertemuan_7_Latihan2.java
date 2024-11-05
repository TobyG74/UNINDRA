import java.io.FileInputStream;
import java.io.DataInputStream;

public class Pertemuan_7_Latihan2 {
    public static void main(String[] args) {
        String x;
        int no, tugas, uts, uas;
        double nilaiAkhir, rataRata;
        try {
            FileInputStream in = new FileInputStream("./tugasP3.txt");
            DataInputStream d = new DataInputStream(in);

            /** Membaca & Menampilkan Data */
            System.out.println("No\tTugas\tUTS\tUAS\tNilai Akhir");
            System.out.println("-------------------------------------------");

            no = 1;
            rataRata = 0;
            while (d.available() != 0) {
                x = d.readLine();
                tugas = Integer.parseInt(x.substring(1, 3));
                uts = Integer.parseInt(x.substring(6, 8));
                uas = Integer.parseInt(x.substring(9, 11));
                nilaiAkhir = (tugas * 0.2) + (uts * 0.3) + (uas * 0.5);
                rataRata = rataRata + nilaiAkhir;
                System.out.printf("%d\t%d\t%d\t%d\t%.2f\n", no, tugas, uts, uas, nilaiAkhir);
                no++;
            }

            System.out.println("-------------------------------------------");
            System.out.printf("Rata-rata : %.2f\n", (rataRata / (no - 1)));

            /** Menutup File */
            d.close();
        } catch (Exception e) {
            System.out.println("Gagal Membaca File. Error : " + e.getMessage());
        }
    }
}
