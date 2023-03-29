import java.util.Scanner;

class Menghitung_Luas_Segitiga {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.println("================================");
        System.out.println("Program Menghitung Luas Segitiga");
        System.out.println("================================");
       
        // INPUT
        System.out.print("Input Alas : ");
        double alas = in.nextDouble();
        System.out.print("Input Tinggi : ");
        double tinggi = in.nextDouble();
       
        // OUTPUT
        double hasil = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga : " + hasil);
    }
}
