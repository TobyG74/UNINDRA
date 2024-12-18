import java.util.Scanner;

class Pertemuan_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int angka1, angka2, hasil; 
        
        System.out.println("---==[ PERKALIAN ]==---");
        System.out.print("Masukan Angka 1 : ");
        angka1 = in.nextInt();
        System.out.print("Masukan Angka 2 : ");
        angka2 = in.nextInt();
        
        hasil = angka1 * angka2; // Operator
        System.out.printf("%s * %s = %s \n", angka1, angka2, hasil);
        
        hasil %= 2; // Operator
        
        // Operator (hasil == 0)3
        if (hasil == 0) System.out.println("Menghasilkan Angka Genap");
        else System.out.println("Menghasilkan Angka Ganjil");
        
        in.close();
    }
}
