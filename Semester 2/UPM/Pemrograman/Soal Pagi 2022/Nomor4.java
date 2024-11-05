import java.util.Scanner;

 public class latihan3 {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     // Input Baris & Kolom
     System.out.print("Input Baris : ");
     int baris = in.nextInt();
     System.out.print("Input Kolom : ");
     int kolom = in.nextInt();
     
     // Proses
     for (int i = 1; i <= baris; i++) {
       for (int j = 1; j <= kolom; j++) {
         if (i % 2 == 0 && j % 2 == 0) System.out.print("X "); // Jika Sisa Bagi nya 0 maka Print X
         else if (i % 2 == 1 && j % 2 == 1) System.out.print("X "); // Jika Sisa Bagi nya 1 maka Print X
         else System.out.print("O "); // Jika Sisa Bagi bukan keduanya maka Print O
       } 
       System.out.println(); // New Line
     }
   }
 }
