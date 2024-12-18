import java.util.Scanner;

 public class Nomor3 {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     System.out.print("Input Batasan Angka : ");
     int jumlah = in.nextInt();
     
     int genap = 0;
     int ganjil = 0;
     
     System.out.println("Angka2 yang merupakan kelitan 3 atau 5 kurang dari " + jumlah + " adalah : ");
     
     // Proses Loop
     for (int i = 1; i < jumlah; i++) {
       if (i % 3 == 0 || i % 5 == 0) { // Menentukan Kelipatan Melalui Sisa Bagi (Mod) 3 atau 5
         System.out.print(i + " ");
         if (i % 2 == 0) {
           genap++; // Menambahkan Nilai Genap
         } else {
           ganjil++; // Menambahkan Nilai Ganjil
         }
       }
     }
     
     System.out.println(); // New Line
     
     // Print Hasil Ganjil & Genap
     System.out.println("Jumlah angka genap = " + genap);
     System.out.println("Jumlah angka ganjil = " + ganjil);
   }
 }
