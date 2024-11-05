public class Nomor2_a {
    public static void main (String[] args) {
        int hitung = 1;
        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = 0; kolom < baris + 1; kolom++) {
                System.out.print(hitung + " ");
                hitung++;
            }
            System.out.println();
        }
    }
}
