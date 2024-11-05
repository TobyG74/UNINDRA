import java.util.Scanner;

class Rumus_Luas_Segitiga {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga : ");
        double tinggi = in.nextInt();
        System.out.print("Masukkan panjang alas segitiga : ");
        double alas = in.nextInt();
        double luas = (tinggi * alas) / 2;
        System.out.print("Luas Segitiga : " + luas);
        
    }
}
