import java.io.File;
import java.sql.*;
import java.util.Scanner;

/**
 * Simply CRUD Program SQLite Database
 * Created by Tobi Saputra
 * Github : TobyG74
 * Repository : UNINDRA
 */

public class Pertemuan_15 {
    private final static String pathDatabase = "./database.db";
    public static void main(String[] args) {
        try {
            /** Deklarasi Scanner */
            Scanner in = new Scanner(System.in);

            /** Mengecek File Database */
            File file = new File(pathDatabase);
            if (!file.exists()) file.createNewFile();

            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + pathDatabase);
            Statement s = conn.createStatement();
            
            /** Mengecek Table */
            s.executeUpdate("CREATE TABLE IF NOT EXISTS mahasiswa (npm VARCHAR(12), nama VARCHAR(30), kelas VARCHAR(2), semester integer, jurusan VARCHAR(30), ipk real)");

            /** Menampilkan Menu */
            clearScreen();
            System.out.println("# ================================== #");
            System.out.println("#     PROGRAM CRUD DATABASE JAVA     #");
            System.out.println("# ================================== #");
            System.out.println();
            System.out.println("Total Data : " + totalData(s));
            System.out.println();
            System.out.println("[ 1 ] Menampilkan Data Mahasiswa");
            System.out.println("[ 2 ] Menambah Data Mahasiswa");
            System.out.println("[ 3 ] Mengupdate Data Mahasiswa");
            System.out.println("[ 4 ] Menghapus Data Mahasiswa");
            System.out.println("--------------------------------------");
            System.out.println("[ 5 ] Tentang Program (Credit)");
            System.out.println("[ 6 ] Keluar");
            System.out.println();
            System.out.print(">> Pilih Menu (1-6) : ");
            int pilih = in.nextInt(); in.nextLine();

            /** Pilih Menu */
            switch (pilih) {
                case 1: tampilkanData(s); break;
                case 2: tambahData(s, in); break;
                case 3: updateData(s, in); break;
                case 4: hapusData(s, in); break;
                case 5: tentangProgram(); break;
                case 6: System.exit(0); break;
                default: System.out.println("Pilihan Menu Tidak Tersedia!"); break;
            }

            in.close();
        } catch (Exception e) { 
            System.out.println("Terjadi Kesalahan! Error : " + e.getMessage()); 
        }
    }

    /** Clear Screen */
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.print("\u000C");
        System.out.flush();
    }

    /** Tentang Program */
    private static void tentangProgram() {
        try {
            clearScreen();
            System.out.println("# ================================== #");
            System.out.println("#     PROGRAM CRUD DATABASE JAVA     #");
            System.out.println("# ================================== #");
            System.out.println();
            System.out.println("Tema       : Program CRUD Database Java (Pertemuan 15)");
            System.out.println("Nama       : Tobi Saputra");
            System.out.println("NPM        : 202243502612");
            System.out.println("Kelas      : R37");
            System.out.println("Github     : TobyG74");
            System.out.println("Repository : UNINDRA");
            System.out.println();
            backToMenu();
        } catch (Exception e) {}
    }

    /** 
     * Mengecek Data di Database
     * Apabila Tersedia Maka Akan Return True, Jika Tidak Maka Akan Return False
    */
    private static boolean isDataAvailable(Statement s) {
        try {
            ResultSet rs = s.executeQuery("SELECT * FROM mahasiswa");
            boolean status = rs.next() ? true : false;
            return status;
        } catch (Exception e) {
            return false;
        }
    }

    /** 
     * Mengecek NPM di Database
     * Apabila Tersedia Maka Akan Return True, Jika Tidak Maka Akan Return False
    */
    private static boolean isNPMAvailable(Statement s, String npm) {
        try {
            ResultSet rs = s.executeQuery("SELECT * FROM mahasiswa WHERE npm = '" + npm + "'");
            boolean status = rs.next() ? true : false;
            return status;
        } catch (Exception e) {
            return false;
        }
    }

    /** Kembali ke Menu */
    private static void backToMenu() {
        try {
            System.out.println("Tekan Enter Untuk Kembali ke Menu...");
            System.in.read();
            main(null);
        } catch (Exception e) {}
    }

    /** Menghitung Total Data di Database */
    private static String totalData(Statement s) {
        try {
            ResultSet rs = s.executeQuery("SELECT COUNT(*) FROM mahasiswa");
            int total = rs.getInt(1);
            return Integer.toString(total);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /** 
     * Menampilkan Semua Data di Database, Dengan :
     * Melakukan Check Terhadap Data di Database
     * Melakukan Check Terhadap NPM di Database
     * */
    private static void tampilkanData(Statement s) {
        try {
            clearScreen();
        
            /** Mengecek Data di Database */
            if (!isDataAvailable(s)) {
                System.out.println("Database Masih Kosong!");
                backToMenu();
            }

            ResultSet rs = s.executeQuery("SELECT * FROM mahasiswa");
            
            /** Menampilkan Data */
            System.out.println("| ==================================================================================================== |");
            System.out.println("|                                               DATA MAHASISWA                                         |");
            System.out.println("| ==================================================================================================== |");
            System.out.printf("| %-15s | %-20s | %-10s | %-10s | %-20s | %-10s | %n", "NPM", "Nama", "Kelas", "Semester", "Jurusan", "IPK");
            System.out.println("| ---------------------------------------------------------------------------------------------------- |");
            while (rs.next()) {
                System.out.printf("| %-15s | %-20s | %-10s | %-10s | %-20s | %-10s | %n", rs.getString("npm"), rs.getString("nama"), rs.getString("kelas"), rs.getString("semester"), rs.getString("jurusan"), rs.getString("ipk"));
            }
            System.out.println("| ---------------------------------------------------------------------------------------------------- |");
            System.out.println();

            backToMenu();
        } catch (Exception e) {
            System.out.println("Gagal Menampilkan Data! Error : " + e.getMessage());
        }
    }

    /** 
     * Menambah Data ke Database, Dengan :
     * Melakukan Check Terhadap NPM di Database
     * */
    private static void tambahData(Statement s, Scanner in) {
        try {
            clearScreen();

            /** Input Data */
            System.out.println("# ===================================== #");
            System.out.println("#               TAMBAH DATA             #");
            System.out.println("# ===================================== #");
            System.out.print("Masukkan NPM: ");
            String npm = in.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = in.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = in.nextLine();
            System.out.print("Masukkan Semester: ");
            int semester = in.nextInt(); in.nextLine();
            System.out.print("Masukkan Jurusan: ");
            String jurusan = in.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = in.nextDouble(); in.nextLine();
            System.out.println();

            /** Mengecek NPM di Database */
            if (isNPMAvailable(s, npm)) {
                System.out.println("NPM Sudah Terdaftar!");
                backToMenu();
            }

            s.executeUpdate("INSERT INTO mahasiswa (npm, nama, kelas, semester, jurusan, ipk) VALUES ('" + npm + "', '" + nama + "', '" + kelas + "', " + semester + " , '" + jurusan + "' , " + ipk + ")");

            backToMenu();
        } catch (Exception e) {
            System.out.println("Gagal Menambahkan Data! Error : " + e.getMessage());
        }
    }

    /** 
     * Mengupdate Data di Database, Dengan :
     * Melakukan Check Terhadap Data di Database
     * Menampilkan Menu Update
     * Melakukan Check Terhadap NPM di Database
     * */
    private static void updateData(Statement s, Scanner in) {
        try {
            clearScreen();
            
            /** Mengecek Data di Database */
            if (!isDataAvailable(s)) {
                System.out.println("Database Masih Kosong!");
                backToMenu();
            }

            /** Pilihan Menu Update */
            System.out.println("# ===================================== #");
            System.out.println("#               UPDATE DATA             #");
            System.out.println("# ===================================== #");
            System.out.println("[ 1 ] Update Nama");
            System.out.println("[ 2 ] Update NPM");
            System.out.println("[ 3 ] Update Kelas");
            System.out.println("[ 4 ] Update Semester");
            System.out.println("[ 5 ] Update Jurusan");
            System.out.println("[ 6 ] Update IPK");
            System.out.println("[ 7 ] Update Manual (Query)");
            System.out.println("[ 8 ] Kembali ke Menu");
            System.out.println();
            System.out.print(">> Pilih Menu (1-8): ");
            int pilih = in.nextInt(); in.nextLine();
            System.out.println();

            switch (pilih) {
                case 1: update(s, in, "nama"); break;
                case 2: update(s, in, "npm"); break;
                case 3: update(s, in, "kelas"); break;
                case 4: update(s, in, "semester"); break;
                case 5: update(s, in, "jurusan"); break;
                case 6: update(s, in, "ipk"); break;
                case 7: update(s, in, "manual"); break;
                case 8: main(null); break;
                default:
                    System.out.println("Pilihan Menu Tidak Tersedia!");
                    break;
            }

            backToMenu();
        } catch (Exception e) {
            System.out.println("Gagal Memperbarui Data! Error : " + e.getMessage());
        }
    }

    /** 
     * Pilihan Update Menggunakan NPM atau Manual, Dengan :
     * Melakukan Check Terhadap NPM di Database
     * */
    private static void update(Statement s, Scanner in, String pilihan) {
        try {
            if (pilihan.equals("manual")) {
                System.out.println("[ ! ] Masukkan Query!");
                System.out.println("Contoh : UPDATE mahasiswa SET nama = 'Tobi Saputra' WHERE npm = '202243502612'");
                System.out.println();
                System.out.print(">> ");
                String query = in.nextLine();
                System.out.println();

                s.executeUpdate(query);
                
                System.out.println("Berhasil Update Data!");
                System.out.println();
            } else {
                System.out.print("Masukkan NPM: ");
                String npm = in.nextLine();
                System.out.print("Masukkan " + pilihan + " Baru: ");
                String baru = in.nextLine();
                System.out.println();

                /** Mengecek NPM di Database */
                if (!isNPMAvailable(s, npm)) {
                    System.out.println("NPM Tidak Terdaftar!");
                    backToMenu();
                }

                s.executeUpdate("UPDATE mahasiswa SET " + pilihan + " = '" + baru + "' WHERE npm = '" + npm + "'");

                System.out.println("Berhasil Update " + pilihan + "!");
                System.out.println();
            }

            backToMenu();
        } catch (Exception e) {
            System.out.println("Gagal Memperbarui Data! Error : " + e.getMessage());
        }
    }

    /** 
     * Menghapus data dari Database, Dengan :
     * Melakukan Check Terhadap Data di Database
     * Melakukan Check Terhadap NPM di Database
     * */
    private static void hapusData(Statement s, Scanner in) {
        try {
            clearScreen();
            
            /** Mengecek Data di Database */
            if (!isDataAvailable(s)) {
                System.out.println("Database Masih Kosong!");
                backToMenu();
            }

            System.out.println("# ==================================== #");
            System.out.println("#               HAPUS DATA             #");
            System.out.println("# ==================================== #");
            System.out.println("[ 1 ] Hapus Satu Data Menggunakan NPM");
            System.out.println("[ 2 ] Hapus Semua Data");
            System.out.println("[ 3 ] Kembali ke Menu");
            System.out.println();
            System.out.print(">> Pilih Menu (1-3): ");
            int pilih = in.nextInt(); in.nextLine();
            System.out.println();

            switch (pilih) {
                case 1: 
                    System.out.print("Masukkan NPM: ");
                    String npm = in.nextLine();
                    System.out.println();

                    /** Mengecek NPM di Database */
                    if (!isNPMAvailable(s, npm)) {
                        System.out.println("NPM Tidak Terdaftar!");
                        backToMenu();
                    }

                    s.executeUpdate("DELETE FROM mahasiswa WHERE npm = '" + npm + "'");

                    System.out.println();
                    System.out.println("Berhasil Menghapus Data!");
                    break;
                case 2: 
                    System.out.println("Apakah Anda Yakin Ingin Menghapus Semua Data?");
                    System.out.println("[ 1 ] Ya");
                    System.out.println("[ 2 ] Tidak");
                    System.out.println();
                    System.out.print(">> Pilih Menu (1-2): ");
                    int pilih2 = in.nextInt(); in.nextLine();
                    System.out.println();

                    switch (pilih2) {
                        case 1: {
                            s.executeUpdate("DELETE FROM mahasiswa");
                            System.out.println();
                            System.out.println("Berhasil Hapus Semua Data!");
                            break;
                        }
                        case 2: {
                            backToMenu();
                            break;
                        }
                        default:
                            System.out.println("Pilihan Menu Tidak Tersedia!");
                            break;
                    }
                    break;
                case 3: main(null); break;
                default:
                    System.out.println("Pilihan Menu Tidak Tersedia!");
                    break;
            }

            backToMenu();
        } catch (Exception e) {
            System.out.println("Gagal Hapus Data! Error : " + e.getMessage());
        }
    }
}
