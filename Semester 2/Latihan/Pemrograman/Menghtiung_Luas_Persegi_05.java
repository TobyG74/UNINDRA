import java.util.Scanner;

class Menghitung_Luas_Persegi {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("==========================");
        System.out.println("Program Menghitung Persegi");
        System.out.println("==========================");
        
        // INPUT
        System.out.print("Input Sisi : ");
        int sisi = in.nextInt();
       
        // OUTPUT
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi : " + hasil);

    }
}
