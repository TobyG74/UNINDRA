// Class Koperasi
class Koperasi {
    // Atribut
    private String nama;
    private String nomorAnggota;
    private double simpanan;

    // Konstruktor tanpa parameter
    public Koperasi() {
        this.nama = "Tidak diketahui";
        this.nomorAnggota = "Tidak diketahui";
        this.simpanan = 0.0;
    }

    // Konstruktor dengan parameter
    public Koperasi(String nama, String nomorAnggota, double simpanan) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.simpanan = simpanan;
    }

    // Method 1
    public void infoAnggota() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Nomor Anggota: " + this.nomorAnggota);
        System.out.println("Simpanan: Rp" + this.simpanan);
    }

    // Method 2
    public void tambahSimpanan(double jumlah) {
        this.simpanan += jumlah;
        System.out.println("Simpanan berhasil ditambah. Simpanan sekarang: Rp" + this.simpanan);
    }

    // Method 3
    public double hitungTotalSimpanan(double bunga) {
        return this.simpanan + (this.simpanan * bunga / 100);
    }
}

class pertemuan6_genap {
    public static void main(String[] args) {
        // Inisialisasi Objek
        Koperasi anggota1 = new Koperasi();
        anggota1.infoAnggota();
        anggota1.tambahSimpanan(500000);
        System.out.println("Total Simpanan dengan bunga 5%: Rp" + anggota1.hitungTotalSimpanan(5));

        // Inisialisasi Objek
        Koperasi anggota2 = new Koperasi("Andi", "A001", 1000000);
        anggota2.infoAnggota();
        anggota2.tambahSimpanan(1000000);
        System.out.println("Total Simpanan dengan bunga 5%: Rp" + anggota2.hitungTotalSimpanan(5));
    }
}