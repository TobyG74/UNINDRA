// Class TempatMakan
class TempatMakan {
    // Atribut
    public String namaRestoran;
    public String alamatRestoran;
    public String jenisMasakan;

    // Method 1
    public void infoRestoran() {
        System.out.println("Nama Restoran: " + namaRestoran);
        System.out.println("Alamat: " + alamatRestoran);
        System.out.println("Jenis Masakan: " + jenisMasakan);
        System.out.println();
    }

    // Method 2
    public void menuMakanan() {
        String[] menu = { "Rendang", "Ayam Pop", "Sate Padang" };
        double[] harga = { 25000, 20000, 30000 };
        boolean[] tersedia = { true, true, false };

        System.out.println("Menu Makanan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - Rp" + harga[i] + " - " + (tersedia[i] ? "Tersedia" : "Habis"));
        }
    }
}

// Main Class
class pertemuan4_ganjil {

    public static void main(String[] args) {
        TempatMakan tm = new TempatMakan();

        tm.namaRestoran = "Warung Makan Sederhana";
        tm.alamatRestoran = "Jl. Merdeka No. 123";
        tm.jenisMasakan = "Masakan Padang";

        tm.infoRestoran();
        tm.menuMakanan();
    }
}