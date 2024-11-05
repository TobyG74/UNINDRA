import java.util.Scanner;
import java.sql.*;

class Soal3 {
    static int totalBiaya = 0;
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:tobi.db");
            Statement stat = conn.createStatement();

            InputDataTransaksi(stat);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void InputDataTransaksi(Statement stat) {
        try {

            Scanner sc = new Scanner(System.in);
    
            System.out.println("\t\t\t\t~ Transaksi Pembayaran ~");
    
            System.out.print("Nomor Transaksi : ");
            String noTransaksi = sc.nextLine();
            System.out.print("Tanggal Transaksi : ");
            String tglTransaksi = sc.nextLine();

            System.out.println("----------------------------------------------------------------");
            InputDataMahasiswa(stat);
            System.out.println("----------------------------------------------------------------");
        
            InputDataPembayaran(stat);

            System.out.println("----------------------------------------------------------------");
            System.out.println("\t\t\tTOTAL PEMBAYARAN : " + totalBiaya);
            System.out.println("----------------------------------------------------------------");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void InputDataPembayaran(Statement stat) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Input Kode Pembayaran : ");
            String kodePembayaran = sc.nextLine();
            ResultSet check = stat.executeQuery("SELECT * FROM jenis_pembayaran WHERE Kode_Pembayaran = '" + kodePembayaran + "'");
            while (check.next()) {
                System.out.println("\t>> " + check.getString("Nama_Pembayaran"));
                System.out.println("\t>> " + check.getInt("Biaya"));
            }

            System.out.println("----------------------------------------------------------------");
            
            System.out.print("Input Jumlah : ");
            int jumlah = sc.nextInt();

            ResultSet getTotal = stat.executeQuery("SELECT * FROM jenis_pembayaran WHERE Kode_Pembayaran = '" + kodePembayaran + "'");
            jumlah = jumlah * getTotal.getInt("Biaya");
            System.out.println("\t\t\tSubtotal >> " + jumlah);
            totalBiaya += jumlah;

            System.out.println("----------------------------------------------------------------");

            System.out.print("[?] Lanjut Pembayaran Lain? (Y/N) : ");
            String lanjut = sc.next();
            if (lanjut.toLowerCase().equals("y")) {
                InputDataPembayaran(stat);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void InputDataMahasiswa(Statement stat) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Input NPM : ");
            String npm = sc.nextLine();

            ResultSet check = stat.executeQuery("SELECT * FROM mahasiswa WHERE npm = '" + npm + "'");
            while (check.next()) {
                System.out.println("\t>> " + check.getString("npm"));
                System.out.println("\t>> " + check.getString("nama"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}