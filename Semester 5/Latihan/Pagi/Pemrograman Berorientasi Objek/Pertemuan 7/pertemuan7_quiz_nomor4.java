// Class Restoran
class Restoran {
    // Atribut
    private String nama;
    private String alamat;
    private int kapasitas;
    private String jenisMasakan;
    private double rating;

    // Konstruktor
    public Restoran(String nama, String alamat, int kapasitas, String jenisMasakan, double rating) {
        this.nama = nama;
        this.alamat = alamat;
        this.kapasitas = kapasitas;
        this.jenisMasakan = jenisMasakan;
        this.rating = rating;
    }

    // Method untuk menampilkan informasi restoran
    public void tampilkanInfo() {
        System.out.println("Nama Restoran: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Jenis Masakan: " + this.jenisMasakan);
        System.out.println("Rating: " + this.rating);
    }

    // Method untuk mengubah rating
    public void ubahRating(double ratingBaru) {
        this.rating = ratingBaru;
    }

    // Method untuk mengubah kapasitas
    public void ubahKapasitas(int kapasitasBaru) {
        this.kapasitas = kapasitasBaru;
    }
}

// Main Class
public class pertemuan7_quiz_nomor4 {
    public static void main(String[] args) {
        // Membuat objek Restoran
        Restoran restoran1 = new Restoran("Sederhana", "Jl. Merdeka No. 1", 100, "Masakan Padang", 4.5);

        // Menampilkan informasi restoran
        restoran1.tampilkanInfo();

        // Mengubah rating restoran
        restoran1.ubahRating(4.8);
        System.out.println("\nRating setelah diubah:");
        restoran1.tampilkanInfo();

        // Mengubah kapasitas restoran
        restoran1.ubahKapasitas(120);
        System.out.println("\nKapasitas setelah diubah:");
        restoran1.tampilkanInfo();
    }
}