import java.util.Scanner;

public class Soal1_NilaiAkhirMahasiswa {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nama, npm;
        boolean kelulusan;
        char grade;
        int tugas, uts, uas;
        double akhir;
        
        System.out.println("Sistem Penilaian Universitas");
        System.out.println("============================");
        
        // INPUT
        System.out.print("NPM : "); 
        npm = in.nextLine();
        System.out.print("Nama : "); 
        nama = in.nextLine();
        System.out.print("Nilai Tugas : "); 
        tugas = in.nextInt();
        System.out.print("Nilai UTS : "); 
        uts = in.nextInt();
        System.out.print("Nilai UAS : "); 
        uas = in.nextInt();
        System.out.println("=======================");
        
        // PROCESS
        akhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);
        
        // Menentukan Nilai
        if (akhir >= 80 && akhir <= 100) {
            grade = 'A';
        } else if (akhir >= 70 && akhir <= 80) {
            grade = 'B';
        } else if (akhir >= 60 && akhir <= 70) {
            grade = 'C';
        } else if (akhir >= 50  && akhir <= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        // Menentukan Kelulusan
        if (akhir >= 70) {
            kelulusan = true;
        } else {
            kelulusan = false;
        }

        // OUTPUT
        System.out.println("Nilai Akhir : " + (int) akhir);
        System.out.println("Grade : " + grade);
        if (kelulusan) {
            System.out.println("Selamat, Anda dinyatakan Lulus!");
        } else {    
            System.out.println("Maaf, Anda dinyatakan Tidak Lulus!");
        }
    }
}
