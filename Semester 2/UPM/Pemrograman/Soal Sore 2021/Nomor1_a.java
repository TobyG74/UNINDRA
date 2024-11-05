public class Nomor1_a {
    public static void main (String[] args) {
        for (int baris = 1; baris <= 3; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                if (baris == 2) {
                    if (kolom == 3) System.out.print("  ");
                    else System.out.print("* ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
