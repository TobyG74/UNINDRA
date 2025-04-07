import java.util.Scanner;

// Kelas abstrak
abstract class MenuMakanan {
    protected String nama;
    protected double harga;

    public MenuMakanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak
    abstract void siapkan();

    // Metode yang akan di-override
    public void tampilkanInfo() {
        System.out.println("Item: " + nama + " - Rp" + harga);
    }
}

// Extendes ke Kelas Menu Makanan
class Makanan extends MenuMakanan {
    private int jumlahPesanan;

    public Makanan(String nama, double harga, int jumlahPesanan) {
        super(nama, harga);
        this.jumlahPesanan = jumlahPesanan;
    }

    // Enkapsulasi
    public int getJumlahPesanan() {
        return jumlahPesanan;
    }

    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }

    // Override metode
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pesanan: " + jumlahPesanan + " porsi");
    }

    @Override
    void siapkan() {
        System.out.println("Menyiapkan " + nama + " di dapur...");
    }
}

class Minuman extends MenuMakanan {
    private boolean panas;
    int jumlahPesanan;

    public Minuman(String nama, double harga, boolean panas, int jumlahPesanan) {
        super(nama, harga);
        this.panas = panas;
        this.jumlahPesanan = jumlahPesanan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pesanan: " + jumlahPesanan + " porsi");
        System.out.println("Disajikan: " + (panas ? "Panas" : "Dingin"));
    }

    @Override
    void siapkan() {
        System.out.println("Menyiapkan " + nama + " di stasiun minuman...");
    }
}

class Pesanan {
    // Overloading metode
    public void hitungTotal(Makanan makanan) {
        double total = makanan.harga * makanan.getJumlahPesanan();
        System.out.println("Total Harga " + makanan.nama + ": Rp" + total);
    }

    public void hitungTotal(Minuman minuman) {
        double total = minuman.harga * minuman.jumlahPesanan;
        System.out.println("Total Harga " + minuman.nama + ": Rp" + total);
    }

    public void hitungTotal(Makanan makanan, Minuman minuman) {
        double totalMakanan = makanan.harga * makanan.getJumlahPesanan();
        double totalMinuman = minuman.harga * minuman.jumlahPesanan;
        System.out.println("Total Harga Keseluruhan: Rp" + (totalMakanan + totalMinuman));
    }
}

public class pertemuan15_quiz {
    // Daftar menu tetap
    private static final String[] MENU_MAKANAN = { "Soto Ceker", "Nasi Goreng", "Ayam Penyet", "Kwetiau", "Bakso" };
    private static final double[] HARGA_MAKANAN = { 12000, 10000, 15000, 8000, 10000 };
    private static final String[] MENU_MINUMAN = { "Teh", "Air Putih", "Es Jeruk" };
    private static final double[] HARGA_MINUMAN = { 5000, 3000, 7000 };

    // Metode validasi
    private static int pilihMenu(Scanner scanner, String[] menu, String jenis) {
        System.out.println("\nDaftar " + jenis + ":");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp"
                    + (jenis.equals("Makanan") ? HARGA_MAKANAN[i] : HARGA_MINUMAN[i]));
        }
        int pilihan;
        do {
            System.out.print("Pilih nomor " + jenis + " (1-" + menu.length + "): ");
            pilihan = scanner.nextInt();
            if (pilihan < 1 || pilihan > menu.length) {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan < 1 || pilihan > menu.length);
        return pilihan - 1;
    }

    private static int inputJumlah(Scanner scanner) {
        int jumlah;
        do {
            System.out.print("Masukkan jumlah pesanan (1-10): ");
            jumlah = scanner.nextInt();
            if (jumlah < 1 || jumlah > 10) {
                System.out.println("Jumlah pesanan tidak valid!");
            }
        } while (jumlah < 1 || jumlah > 10);
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Pemesanan Restoran ===");

        // Pesanan makanan
        int indexMakanan = pilihMenu(scanner, MENU_MAKANAN, "Makanan");
        int jumlahPesanan = inputJumlah(scanner);
        String namaMakanan = MENU_MAKANAN[indexMakanan];
        double hargaMakanan = HARGA_MAKANAN[indexMakanan];

        // Pesanan minuman
        int indexMinuman = pilihMenu(scanner, MENU_MINUMAN, "Minuman");
        int jumlahMinuman = inputJumlah(scanner);
        String namaMinuman = MENU_MINUMAN[indexMinuman];
        double hargaMinuman = HARGA_MINUMAN[indexMinuman];

        // Jika minuman adalah teh / air putih, tanyakan apakah panas
        boolean panas = false;
        if (indexMinuman == 0 || indexMinuman == 1) {
            System.out.print("Apakah minuman panas? (y/n): ");
            panas = scanner.next().equalsIgnoreCase("y");
            if (panas) {
                System.out.println("Minuman disajikan panas.");
            } else {
                System.out.println("Minuman disajikan dingin.");
            }
        }

        // Membuat objek (Polimorfisme)
        MenuMakanan makanan = new Makanan(namaMakanan, hargaMakanan, jumlahPesanan);
        MenuMakanan minuman = new Minuman(namaMinuman, hargaMinuman, panas, jumlahMinuman);
        Pesanan pesanan = new Pesanan();

        // Menampilkan detail pesanan
        System.out.println("\n=== Detail Pesanan ===");
        makanan.tampilkanInfo();
        makanan.siapkan();
        minuman.tampilkanInfo();
        minuman.siapkan();

        // Demonstrasi overloading metode
        pesanan.hitungTotal((Makanan) makanan);
        pesanan.hitungTotal((Minuman) minuman);
        pesanan.hitungTotal((Makanan) makanan, (Minuman) minuman);

        scanner.close();
    }
}