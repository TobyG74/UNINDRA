import java.util.Scanner;

public class StrukKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaProduk;
        int[] hargaProduk;
        int[] jumlahProduk;
        int totalHarga = 0;

        System.out.println("===============================");
        System.out.println("         Toko ABC             ");
        System.out.println("===============================");

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = input.nextLine();

        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBarang = input.nextInt();
        input.nextLine();

        namaProduk = new String[jumlahBarang];
        hargaProduk = new int[jumlahBarang];
        jumlahProduk = new int[jumlahBarang];

        System.out.println("Masukkan detail barang: ");
        System.out.println("------------------------------");

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Produk ke-" + (i + 1));
            System.out.print("Nama produk: ");
            String nama = input.nextLine();
            namaProduk[i] = nama;

            System.out.print("Harga produk: ");
            int harga = input.nextInt();
            hargaProduk[i] = harga;

            System.out.print("Kuantitas produk: ");
            int kuantitas = input.nextInt();
            jumlahProduk[i] = kuantitas;

            totalHarga += harga * kuantitas;

            input.nextLine();
        }

        System.out.println("===============================");
        System.out.println("        Struk Belanja          ");
        System.out.println("===============================");
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("------------------------------");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("%-20s %5d x %d = %d\n", namaProduk[i], hargaProduk[i], jumlahProduk[i],
                    hargaProduk[i] * jumlahProduk[i]);
        }
        System.out.println("------------------------------");
        System.out.printf("Total Harga: %28d\n", totalHarga);
        System.out.println("===============================");
        System.out.println("Terima kasih telah berbelanja di Toko ABC");
    }
}
