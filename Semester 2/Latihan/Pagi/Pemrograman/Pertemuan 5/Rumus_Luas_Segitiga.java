import java.util.Scanner;

class Rumus_Luas_Segitiga {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        // NILAI
        int alas = 20;
        int tinggi = 10;
       
        // OUTPUT
        double hasil = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga : " + hasil);
    }
}
