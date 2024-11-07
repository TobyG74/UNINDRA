// Class GudangBarang
class GudangBarang {
    // Atribut
    public String namaBarang;
    public String lokasiGudang;
    public double hargaBarang;
    public boolean tersedia;
    private int jumlahStok;

    // Method 1
    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    // Method 2
    public void infoBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Harga Barang: Rp" + hargaBarang);
    }

    // Method 3
    public void statusBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
        System.out.println("Lokasi Gudang: " + lokasiGudang);
    }
}

// Main Class
class pertemuan4_genap {
    public static void main(String[] args) {
        GudangBarang gb = new GudangBarang();

        gb.namaBarang = "Laptop";
        gb.lokasiGudang = "Gudang A";
        gb.hargaBarang = 7500000.00;
        gb.tersedia = true;

        gb.infoBarang();
        gb.statusBarang();
    }
}