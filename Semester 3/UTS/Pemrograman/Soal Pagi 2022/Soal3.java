import java.util.Scanner;
import java.sql.*;

class Soal3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:tobi.db");
            Statement stat = conn.createStatement();

            System.out.println("Menu :");
            System.out.println("1. Menampilkan Data Nilai");
            System.out.println("2. Input Penilaian");
            System.out.println("Pilih Menu [1 / 2]: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    showData(stat, sc);
                    break;
                case 2:
                    InputNilai(stat, sc);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void showData(Statement stat, Scanner sc) {
        try {
            System.out.println("\t\t\t\t~ Menampilkan Data Nilai ~");
            ResultSet rs = stat.executeQuery("SELECT * FROM penilaian");

            // Menampilkan NPM, Kode MK, Tugas, UTS, UAS, dan Nilai Akhir
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("| %-14s | %-10s | %-5s | %-5s | %-5s | %-12s |\n", "NPM", "Kode MK", "Tugas", "UTS", "UAS", "Nilai Akhir");
            System.out.println("======================================================================");
            while (rs.next()) {
                double nilai_akhir = (rs.getInt("Nilai_Tugas") * 0.2) + (rs.getInt("Nilai_UTS") * 0.3) + (rs.getInt("Nilai_UAS") * 0.5);
                System.out.printf("| %-14s | %-10s | %-5s | %-5s | %-5s | %-12s |\n", rs.getString("NPM"),
                        rs.getString("Kode_Mata_Kuliah"), rs.getString("Nilai_Tugas"), rs.getString("Nilai_UTS"),
                        rs.getString("Nilai_UAS"), nilai_akhir);
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Kembali ke Menu? [Y/N]: ");
            String back = sc.next();
            sc.nextLine();
            if (back.equalsIgnoreCase("Y")) {
                main(new String[0]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void InputNilai(Statement stat, Scanner sc) {
        try {
            System.out.println("\t\t\t\t~ Input Penilaian ~");
            System.out.println("----------------------------------------------------------------------");

            System.out.print("Input NPM: ");
            String npm = sc.nextLine();
            ResultSet rs = stat.executeQuery("SELECT * FROM mahasiswa WHERE NPM = '" + npm + "'");
            while (rs.next()) {
                System.out.println("\t>> " + rs.getString("Nama"));
                System.out.println("\t>> " + rs.getString("Kelas"));
            }

            System.out.println("----------------------------------------------------------------------");
            System.out.print("Input Kode MK: ");
            String kode_mk = sc.nextLine();
            ResultSet rs2 = stat.executeQuery("SELECT * FROM mata_kuliah WHERE Kode_Mata_Kuliah = '" + kode_mk + "'");
            while (rs2.next()) {
                System.out.println("\t>> " + rs2.getString("Nama_Mata_Kuliah"));
                System.out.println("\t>> " + rs2.getString("SKS") + " sks");
            }

            System.out.println("----------------------------------------------------------------------");
            System.out.print("Input Nilai Tugas: ");
            int tugas = sc.nextInt();
            System.out.print("Input Nilai UTS: ");
            int uts = sc.nextInt();
            System.out.print("Input Nilai UAS: ");
            int uas = sc.nextInt();
            stat.executeUpdate("INSERT INTO penilaian VALUES ('" + npm + "', '" + kode_mk + "', " + tugas + ", " + uts + ", " + uas + ")");

            System.out.print("\t~ Input Penilaian Lagi? [Y/N]: ");
            String lagi = sc.next();
            sc.nextLine();
            if (lagi.toLowerCase().equals("y")) {
                InputNilai(stat, sc);
            }

            System.out.println("Kembali ke Menu? [Y/N]: ");
            String back = sc.next();
            sc.nextLine();
            if (back.toLowerCase().equals("Y")) {
                main(new String[0]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}