import java.util.Scanner;

class Menghitung_Luas_Persegi_Panjang {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.println("==================================");
        System.out.println("Program Menghitung Persegi Panjang");
        System.out.println("==================================");
       
        // INPUT
        System.out.print("Input Panjang : ");
        int panjang = in.nextInt();
        System.out.print("Input Lebar : ");
        int lebar = in.nextInt();
       
        // OUTPUT
        double hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + hasil);
    }
}
