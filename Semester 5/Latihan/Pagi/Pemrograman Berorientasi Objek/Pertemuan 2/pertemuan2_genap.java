// Class Tumbuhan
class Tumbuhan {
    // Atribut
    String nama;
    String jenis;
    int umur;

    // Method 1
    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Umur: " + hitungUmur() + " bulan");
    }

    // Method 2
    int hitungUmur() {
        return umur * 12;
    }
}

// Main Class
class pertemuan2_genap {
    public static void main(String[] args) {
        // Object
        Tumbuhan pohon = new Tumbuhan();
        Tumbuhan bunga = new Tumbuhan();

        // Inisialisasi Object
        pohon.nama = "Pohon Mangga";
        pohon.jenis = "Tumbuhan Berbuah";
        pohon.umur = 5;

        bunga.nama = "Bunga Mawar";
        bunga.jenis = "Bunga";
        bunga.umur = 2;

        // Method
        pohon.tampil();
        System.out.println();
        bunga.tampil();
    }
}
