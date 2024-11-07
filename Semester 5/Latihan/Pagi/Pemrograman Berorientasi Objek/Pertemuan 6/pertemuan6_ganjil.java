// Class Karyawan
class Karyawan {
    // Atribut
    private String nama;
    private String jabatan;
    private double gajiPokok;

    // Konstruktor tanpa parameter
    public Karyawan() {
        this.nama = "Tidak diketahui";
        this.jabatan = "Tidak diketahui";
        this.gajiPokok = 0.0;
    }

    // Konstruktor dengan parameter
    public Karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Method 1
    public void infoKaryawan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Pokok: Rp" + this.gajiPokok);
    }

    // Method 2
    public double hitungGajiTotal(double tunjangan, double potongan) {
        return this.gajiPokok + tunjangan - potongan;
    }

    // Method 3
    public void tampilkanGajiTotal(double tunjangan, double potongan) {
        double gajiTotal = hitungGajiTotal(tunjangan, potongan);
        System.out.println("Gaji Total: Rp" + gajiTotal);
    }
}

class pertemuan6_ganjil {
    public static void main(String[] args) {
        // Inisialisasi Objek
        Karyawan karyawan1 = new Karyawan();
        karyawan1.infoKaryawan();
        karyawan1.tampilkanGajiTotal(1000000, 500000);

        // Inisialisasi Objek
        Karyawan karyawan2 = new Karyawan("Budi", "Manager", 8000000);
        karyawan2.infoKaryawan();
        karyawan2.tampilkanGajiTotal(2000000, 1000000);
    }
}