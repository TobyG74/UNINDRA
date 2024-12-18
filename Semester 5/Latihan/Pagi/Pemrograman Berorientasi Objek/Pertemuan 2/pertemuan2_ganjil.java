// Class Binatang
class Binatang {
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
class pertemuan2_ganjil {
    public static void main(String[] args) {
        // Object
        Binatang kucing = new Binatang();
        Binatang anjing = new Binatang();

        // Inisialisasi Object
        kucing.nama = "Kucing";
        kucing.jenis = "Mamalia";
        kucing.umur = 2;

        anjing.nama = "Anjing";
        anjing.jenis = "Mamalia";
        anjing.umur = 3;

        // Method
        kucing.tampil();
        System.out.println();
        anjing.tampil();
    }
}