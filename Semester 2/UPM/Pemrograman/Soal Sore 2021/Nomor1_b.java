public class Nomor1_b {
    public static void main (String[] args) {
        // SEGITIGA 1
        for (int baris = 1; baris <= 5; baris++){
            for (int space = 4; space >= baris; space--) {
               System.out.print("  ");
            }
            for (int kolom = 1; kolom <= baris; kolom++){
                System.out.print("* ");
            }
            System.out.println();
        }
      // SEGITIGA 2
        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = baris; kolom < 5; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
